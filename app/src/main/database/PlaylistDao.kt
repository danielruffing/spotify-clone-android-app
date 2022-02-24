package com.example.cse438.cse438_assignment2.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.cse438.cse438_assignment2.data.Playlist

@Dao
interface PlaylistDao {

    @Query("SELECT * FROM playlists")
    fun getPlaylists(): LiveData<List<Playlist>>

    @Insert
    fun addPlaylist(playlist: Playlist)

    @Query("DELETE FROM playlists WHERE playlists.id = :id")
    fun delete(id: Int)

    @Query("DELETE FROM playlists")
    fun deleteAll()

}