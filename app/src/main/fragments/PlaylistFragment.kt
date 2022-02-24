package com.example.cse438.cse438_assignment2.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cse438.cse438_assignment2.Adapter.PlaylistListAdapter
import com.example.cse438.cse438_assignment2.R
import com.example.cse438.cse438_assignment2.data.Playlist
import com.example.cse438.cse438_assignment2.database.PlaylistViewModel
import kotlinx.android.synthetic.main.fragment_playlist.*

class PlaylistFragment : Fragment() {
    private var playlistList: ArrayList<Playlist> = ArrayList()
    private lateinit var playlistViewModel: PlaylistViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_playlist, container, false)
    }

    override fun onStart() {
        super.onStart()
        val intent = Intent(this.context, NewPlaylistForm::class.java)

        playlistViewModel = ViewModelProvider(this).get(PlaylistViewModel::class.java)

        val bundle = intent.extras

        val adapter = PlaylistListAdapter(playlistList, bundle)
        playlist_recycler_view.adapter = adapter
        playlist_recycler_view.layoutManager = LinearLayoutManager(this.context)

        playlistViewModel.playlistList.observe(this, Observer { playlists ->
            playlistList.clear()
            playlistList.addAll(playlists)
            adapter.notifyDataSetChanged()
        })

        new_playlist_button.setOnClickListener {
            startActivity(intent)
        }
    }
}
