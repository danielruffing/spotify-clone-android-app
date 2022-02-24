package com.example.cse438.cse438_assignment2.Adapter


import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.cse438.cse438_assignment2.MainActivity
import com.example.cse438.cse438_assignment2.R
import com.example.cse438.cse438_assignment2.TrackActivity
import com.example.cse438.cse438_assignment2.data.Track
import com.squareup.picasso.Picasso
import kotlin.coroutines.coroutineContext

//create the view holder
class TrackListViewHolder(inflater: LayoutInflater, parent: ViewGroup) : RecyclerView.ViewHolder(inflater.inflate(R.layout.track_item, parent, false)) {
    private val title: TextView = itemView.findViewById(R.id.track_title)
    val image: ImageView

    init {
        image = itemView.findViewById(R.id.track_image)
    }

    fun bind(track: Track) {
        title.text = track.title
        Picasso.get().load(track.album.cover_big).into(image)
    }
}

//define the adapter for the recycler view
class TrackListAdapter(private val list: ArrayList<Track>?) : RecyclerView.Adapter<TrackListViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrackListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return TrackListViewHolder(inflater, parent)
    }

    //bind the object
    override fun onBindViewHolder(holder: TrackListViewHolder, position: Int) {
        val track: Track = list!![position]
        holder.image.setOnClickListener {
            val intent = Intent(it.context, TrackActivity::class.java)
            intent.putExtra("TRACK_TITLE", track.title)
            intent.putExtra("TRACK_ARTIST", track.artist.name)
            intent.putExtra("TRACK_IMAGE", track.album.cover_big)
            intent.putExtra("TRACK_POSITION", track.position)
            intent.putExtra("TRACK_LENGTH", track.duration)
            intent.putExtra("TRACK_RANK", track.rank)

            it.context.startActivity(intent)
        }
        holder.bind(track)
    }

    //set the count
    override fun getItemCount(): Int = list!!.size
}


