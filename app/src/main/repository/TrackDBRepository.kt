package com.example.cse438.cse438_assignment2.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.cse438.cse438_assignment2.data.TrackDB
import com.example.cse438.cse438_assignment2.data.TrackPlaylist
import com.example.cse438.cse438_assignment2.database.TracklistDao
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TrackDBRepository (private val tracklistDao: TracklistDao){
    //database
    val allTracksDB: LiveData<List<TrackPlaylist>> = MutableLiveData()

    fun addTrack(track: TrackDB){
        CoroutineScope(Dispatchers.IO).launch {
            tracklistDao.addTrack(track)
        }
    }

    fun deleteTrackByID(id: Int){
        CoroutineScope(Dispatchers.IO).launch {
            tracklistDao.deleteTrack(id)
        }
    }

    fun join(ownerID: Int) : LiveData<List<TrackPlaylist>>{
            return tracklistDao.join(ownerID)

    }


}