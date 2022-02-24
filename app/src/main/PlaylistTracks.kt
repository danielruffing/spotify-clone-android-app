package com.example.cse438.cse438_assignment2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cse438.cse438_assignment2.Adapter.PlaylistTracksAdapter
import com.example.cse438.cse438_assignment2.data.TrackPlaylist
import com.example.cse438.cse438_assignment2.database.TracklistViewModel
import kotlinx.android.synthetic.main.activity_playlist_tracks.*

/**
 * This activity displays the list of tracks of a playlist in a recyclerview
 */
class PlaylistTracks : AppCompatActivity(){
    private var trackList: ArrayList<TrackPlaylist> = ArrayList()
    private lateinit var tracklistViewModel: TracklistViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = intent

        setContentView(R.layout.activity_playlist_tracks)
        ptrack_genre.text = intent.getStringExtra("PLAYLIST_GENRE")
        ptrack_rating.text = intent.getIntExtra("PLAYLIST_RATING", 1).toString()

        tracklistViewModel = ViewModelProvider(this).get(TracklistViewModel::class.java)

        val adapter = PlaylistTracksAdapter(trackList, tracklistViewModel)
        tracks_recycler_view.adapter = adapter
        tracks_recycler_view.layoutManager = LinearLayoutManager(this)



        val temp = intent.getIntExtra("PLAYLIST_ID", 1)
        tracklistViewModel.joinTracks(temp).observe(this, Observer {tracks ->
            trackList.clear()
            trackList.addAll(tracks)
            adapter.notifyDataSetChanged()
        })
    }
}