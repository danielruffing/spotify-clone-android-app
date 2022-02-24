package com.example.cse438.cse438_assignment2.database

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.cse438.cse438_assignment2.data.Playlist
import com.example.cse438.cse438_assignment2.repository.DatabaseRepository

class PlaylistViewModel (application: Application): AndroidViewModel(application) {
    var playlistList: LiveData<List<Playlist>> = MutableLiveData()
    private val repository: DatabaseRepository = DatabaseRepository(AppDatabase.getDatabase(application).playlistDao())
    init {
        playlistList = repository.allPlaylists
    }
    fun getPlaylists() : LiveData<List<Playlist>> {
        return playlistList
    }
    fun insert(playlist: Playlist) {
        repository.addPlaylist(playlist)
    }


}