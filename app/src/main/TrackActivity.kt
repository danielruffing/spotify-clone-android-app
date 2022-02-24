package com.example.cse438.cse438_assignment2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_track.*


class TrackActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_track)
    }

    override fun onStart() {
        super.onStart()

        //1. grab the intent
        val bundle = intent.extras

        //2. set views from track data
        title_header.text = bundle?.getString("TRACK_TITLE")
        val image = bundle?.getString("TRACK_IMAGE")
        Picasso.get().load(image).into(cover)
        artist.text = bundle?.getString("TRACK_ARTIST")
        title_small.text = bundle?.getString("TRACK_TITLE")
        position.text = bundle?.getInt("TRACK_POSITION").toString()
        length.text = bundle?.getInt("TRACK_LENGTH").toString()
        rank.text = bundle?.getInt("TRACK_RANK").toString()

        //3. set listener that adds Track to Playlist [sends user to TrackToPlaylistActivity()]
        add_button.setOnClickListener{
            val intent = Intent(this, TrackToPlaylistActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        back_button.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}