package com.example.cse438.cse438_assignment2.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.cse438.cse438_assignment2.R
import com.example.cse438.cse438_assignment2.data.TrackPlaylist
import com.example.cse438.cse438_assignment2.database.TracklistViewModel

//create the view holder
class PlaylistTracksViewHolder(inflater: LayoutInflater, parent: ViewGroup) : RecyclerView.ViewHolder(inflater.inflate(R.layout.playlist_track_item, parent, false)) {
    /*
    display
    Users can view the contents of their playlist in a RecyclerView with track name, artist,
playlist genre, time, and playlist rating. This is done by joining two tables together to avoid data
redundancy
     */

    val name: TextView
    val artist: TextView
    val duration: TextView
    val item: LinearLayout

    init {
        name = itemView.findViewById(R.id.ptrack_title)
        artist = itemView.findViewById(R.id.ptrack_artist)
        duration = itemView.findViewById(R.id.ptrack_length)
        item = itemView.findViewById(R.id.ptrack_container)
    }

    fun bind(track: TrackPlaylist, vm: TracklistViewModel) {
        name.text = track.name
        artist.text = track.artist
        duration.text = track.duration.toString()
        item.setOnClickListener {
            vm.deleteTrack(track.trackID.toInt())
            val toast = Toast.makeText(it.context, "Track Deleted!", Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}

//define the adapter for the recycler view
class PlaylistTracksAdapter(private val list: ArrayList<TrackPlaylist>?, private val vm: TracklistViewModel) : RecyclerView.Adapter<PlaylistTracksViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaylistTracksViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return PlaylistTracksViewHolder(inflater, parent)
    }

    //bind the object
    override fun onBindViewHolder(holder: PlaylistTracksViewHolder, position: Int) {
        val track: TrackPlaylist = list!![position]
        holder.bind(track, vm)
    }

    //set the count
    override fun getItemCount(): Int = list!!.size
}



