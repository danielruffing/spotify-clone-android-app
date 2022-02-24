package com.example.cse438.cse438_assignment2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cse438.cse438_assignment2.Adapter.PlaylistSelectAdapter
import com.example.cse438.cse438_assignment2.data.Playlist
import com.example.cse438.cse438_assignment2.database.PlaylistViewModel
import com.example.cse438.cse438_assignment2.database.TracklistViewModel
import com.example.cse438.cse438_assignment2.fragments.NewPlaylistForm
import kotlinx.android.synthetic.main.fragment_playlist.*

/**
 * this activity appears when adding a track [From TrackActivity()] to a playlist
 */
class TrackToPlaylistActivity : AppCompatActivity(){
    private var playlistList: ArrayList<Playlist> = ArrayList()
    private lateinit var playlistViewModel: PlaylistViewModel
    private lateinit var tracklistViewModel: TracklistViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_playlist)
    }

    override fun onStart() {
        super.onStart()

        playlistViewModel = ViewModelProvider(this).get(PlaylistViewModel::class.java)
        tracklistViewModel = ViewModelProvider(this).get(TracklistViewModel::class.java)

        val adapter = PlaylistSelectAdapter(playlistList, intent?.extras, tracklistViewModel)
        playlist_recycler_view.adapter = adapter
        playlist_recycler_view.layoutManager = LinearLayoutManager(this)


        playlistViewModel.playlistList.observe(this, Observer { playlists ->
            playlistList.clear()
            playlistList.addAll(playlists)
            adapter.notifyDataSetChanged()
        })

        new_playlist_button.setOnClickListener {
            val intent = Intent(this, NewPlaylistForm::class.java)
            startActivity(intent)
        }
    }
}