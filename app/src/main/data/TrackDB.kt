package com.example.cse438.cse438_assignment2.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "trackdb",
        foreignKeys = [ForeignKey(entity = Playlist::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("playlistID"),
        onDelete = ForeignKey.CASCADE)])
data class TrackDB(
    @ColumnInfo
    val name: String?,

    @ColumnInfo
    val artist: String?,

    @ColumnInfo
    val duration: Int?,

    @ColumnInfo
    val playlistID: Long

){
    @PrimaryKey(autoGenerate = true)
    var trackID: Long = 0
}

data class TrackPlaylist(
    val name : String?, val artist : String, val duration : Int,
    val genre: String, val rating : Int, val trackID: Long)