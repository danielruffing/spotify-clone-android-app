package com.example.cse438.cse438_assignment2.repository

import androidx.lifecycle.LiveData
import com.example.cse438.cse438_assignment2.data.Playlist
import com.example.cse438.cse438_assignment2.database.PlaylistDao
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DatabaseRepository (private val playlistDao: PlaylistDao){
    //database
    val allPlaylists: LiveData<List<Playlist>> = playlistDao.getPlaylists()

    fun addPlaylist(playlist: Playlist){
        CoroutineScope(Dispatchers.IO).launch {
            playlistDao.addPlaylist(playlist)
        }
    }
}