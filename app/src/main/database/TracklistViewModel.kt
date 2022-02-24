package com.example.cse438.cse438_assignment2.database

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.cse438.cse438_assignment2.data.TrackDB
import com.example.cse438.cse438_assignment2.data.TrackPlaylist
import com.example.cse438.cse438_assignment2.repository.TrackDBRepository

class TracklistViewModel (application: Application): AndroidViewModel(application) {
    var trackList: LiveData<List<TrackPlaylist>> = MutableLiveData()
    //var trackList: LiveData<List<TrackDB>> = MutableLiveData()

    private val repository: TrackDBRepository = TrackDBRepository(AppDatabase.getDatabase(application).tracklistDao())


    init {
        trackList = repository.allTracksDB
    }

    fun insert(track: TrackDB) {
        repository.addTrack(track)
    }

    fun joinTracks(playlistID: Int): LiveData<List<TrackPlaylist>> {
        return repository.join(playlistID)
    }

    fun deleteTrack(id: Int){
        repository.deleteTrackByID(id)
    }
}