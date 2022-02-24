package com.example.cse438.cse438_assignment2.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.cse438.cse438_assignment2.data.TrackDB
import com.example.cse438.cse438_assignment2.data.TrackPlaylist

@Dao
interface TracklistDao {
    @Query("SELECT * FROM trackdb")
    fun getTracks(): LiveData<List<TrackDB>>

    @Insert
    fun addTrack(track: TrackDB)

    @Query("DELETE FROM trackdb WHERE trackID = :id")
    fun deleteTrack(id: Int)

    @Query("SELECT trackdb.name, trackdb.artist, trackdb.duration, playlists.genre, playlists.rating, trackdb.trackID FROM trackdb JOIN playlists ON playlists.id=trackdb.playlistID WHERE trackdb.playlistID=:id" )
    fun join(id: Int):LiveData<List<TrackPlaylist>>
}
