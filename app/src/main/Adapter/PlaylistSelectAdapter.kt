package com.example.cse438.cse438_assignment2.Adapter


import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cse438.cse438_assignment2.data.Playlist
import com.example.cse438.cse438_assignment2.database.TracklistViewModel

/**
 *
 * this adapter is used when selecting
 * which playlist to add a track to
 *
 *
 */
class PlaylistSelectAdapter(private val list: ArrayList<Playlist>?, private val bundle: Bundle?, val vm: TracklistViewModel) : RecyclerView.Adapter<PlaylistViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaylistViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return PlaylistViewHolder(inflater, parent)
    }
    //bind the object
    override fun onBindViewHolder(holder: PlaylistViewHolder, position: Int) {
        val playlist: Playlist = list!![position]
        holder.bindAlt(playlist, bundle, vm)
    }
    //set the count
    override fun getItemCount(): Int = list!!.size

}