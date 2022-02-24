package com.example.cse438.cse438_assignment2.fragments

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.cse438.cse438_assignment2.R
import com.example.cse438.cse438_assignment2.data.Playlist
import com.example.cse438.cse438_assignment2.data.Track
import com.example.cse438.cse438_assignment2.database.PlaylistViewModel
import com.example.cse438.cse438_assignment2.network.TrackViewModel
import kotlinx.android.synthetic.main.fragment_new_playlist_form.*

class NewPlaylistForm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_new_playlist_form)
    }

    override fun onStart() {
        super.onStart()

        val playlistViewModel = ViewModelProvider(this).get(PlaylistViewModel::class.java)
        runButton.setOnClickListener {
            if(new_playlist_title.text.toString()=="" || new_playlist_description.text.toString()=="" ||
                new_playlist_rating.text.toString()=="" || new_playlist_genre.text.toString()==""){

                val toast = Toast.makeText(this, "Please fill all fields", Toast.LENGTH_LONG)
                toast.show()
            } else{
                val p = Playlist(new_playlist_title.text.toString(), new_playlist_description.text.toString(),
                    new_playlist_rating.text.toString().toInt(), new_playlist_genre.text.toString())

                playlistViewModel.insert(p)

                val toast = Toast.makeText(this, "Playlist Created", Toast.LENGTH_SHORT)
                toast.show()
            }



        }
    }
}