package com.example.cse438.cse438_assignment2.Adapter

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.cse438.cse438_assignment2.PlaylistTracks
import com.example.cse438.cse438_assignment2.R
import com.example.cse438.cse438_assignment2.data.Playlist
import com.example.cse438.cse438_assignment2.data.TrackDB
import com.example.cse438.cse438_assignment2.database.TracklistViewModel

//create the view holder
class PlaylistViewHolder(inflater: LayoutInflater, parent: ViewGroup) : RecyclerView.ViewHolder(inflater.inflate(R.layout.playlist_item, parent, false)) {
    val item: ConstraintLayout = itemView.findViewById(R.id.playlist_item_container)
    private val title: TextView
    private val description: TextView

    init {
        title = itemView.findViewById(R.id.playlist_title)
        description = itemView.findViewById(R.id.playlist_description)
    }

    /**
     * creates a new playlist and inserts it into the PlaylistFragment Adapter
     * uses the adapter: PlaylistListAdapter
     */
    fun bind(playlist: Playlist) {
        title.text = playlist.name
        description.text = playlist.description
        title.setOnClickListener {

            val intent = Intent(it.context, PlaylistTracks::class.java)
            intent.putExtra("PLAYLIST_ID", playlist.id)
            intent.putExtra("PLAYLIST_GENRE", playlist.genre)
            intent.putExtra("PLAYLIST_RATING", playlist.rating)
            it.context.startActivity(intent)
        }
    }

    /**
     * used for adding a track to the selected playlist from RecyclerView
     * adapter: PlaylistSelectAdapter
     */
    fun bindAlt(playlist: Playlist, bundle: Bundle?, vm: TracklistViewModel) {
        title.text = playlist.name
        description.text = playlist.description
        title.setOnClickListener{
            val t = TrackDB(
                bundle?.getString("TRACK_TITLE"),     //track name
                bundle?.getString("TRACK_ARTIST"),          //track artist
                bundle?.getInt("TRACK_LENGTH"),             //track duration
                playlist.id
            ) //key for what playlist "owns" this track
            vm.insert(t)
            val toast = Toast.makeText(it.context, "Track Added!", Toast.LENGTH_SHORT)
            toast.show()

        }
    }
}

/**
 * this adapter is used when we step inside a playlist from the MainActivity
 */
class PlaylistListAdapter(private val list: ArrayList<Playlist>?, private val bundle: Bundle?) : RecyclerView.Adapter<PlaylistViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaylistViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return PlaylistViewHolder(inflater, parent)
    }

    //bind the object
    override fun onBindViewHolder(holder: PlaylistViewHolder, position: Int) {
        val playlist: Playlist = list!![position]
        holder.bind(playlist)
    }

    //set the count
    override fun getItemCount(): Int = list!!.size

}
