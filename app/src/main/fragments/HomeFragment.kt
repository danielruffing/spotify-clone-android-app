package com.example.cse438.cse438_assignment2.fragments

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.SearchView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cse438.cse438_assignment2.Adapter.PlaylistListAdapter
import com.example.cse438.cse438_assignment2.Adapter.TrackListAdapter

import com.example.cse438.cse438_assignment2.R
import com.example.cse438.cse438_assignment2.data.Playlist
import com.example.cse438.cse438_assignment2.data.Track
import com.example.cse438.cse438_assignment2.data.TrackPayload
import com.example.cse438.cse438_assignment2.network.TrackViewModel
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_playlist.*
import kotlinx.android.synthetic.main.track_item.*

class HomeFragment : Fragment() {
    private var trackList: ArrayList<Track>? = ArrayList()
    lateinit var trackViewModel: TrackViewModel
    private lateinit var gridManager: GridLayoutManager

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }


   override fun onStart() {
        super.onStart()

       gridManager = GridLayoutManager(activity, 2)
       //set adapter
       var trackAdapter = TrackListAdapter(trackList)
       //set RecyclerView to TrackAdapter
       recyclerview.adapter = trackAdapter
       //set RecyclerView to GridLayout
       recyclerview.layoutManager = gridManager

       trackViewModel = ViewModelProviders.of(this).get(TrackViewModel::class.java)

       //Observes the GridLayout and inserts a Track into each position
       trackViewModel.trackList.observe(this, Observer {
           trackList?.clear()
           if(it.data==null){
               println("trackViewModel.charts() returned null")
           } else{
               trackList?.addAll(it.data)
           }

           trackAdapter.notifyDataSetChanged()
       })
       trackViewModel.charts()

       //SearchBar Listener
       search_bar.addTextChangedListener(object: TextWatcher{
           override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
           override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
           //After text changes, search for result. If search is cleared, brings up charts again
           override fun afterTextChanged(editable: Editable) {
               if(search_bar.text.toString()==""){
                   search_bar.hint = "Search.."
                   trackViewModel.charts()
               } else{
                   trackViewModel.search(search_bar.text.toString())
               }
           }
       })


    }

}
