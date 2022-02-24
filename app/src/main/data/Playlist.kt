package com.example.cse438.cse438_assignment2.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "playlists")
data class Playlist(
    @ColumnInfo
    val name: String,

    @ColumnInfo
    val description: String,

    @ColumnInfo
    val rating: Int,

    @ColumnInfo
    val genre: String
){
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
}
/*
@Entity
    (foreignKeys = arrayOf(ForeignKey(entity = Playlist::class,
    parentColumns = arrayOf("playlistID"),
    childColumns = arrayOf("ownerID"),
    onDelete = ForeignKey.CASCADE)))
data class TrackDB(
    @ColumnInfo
    val name: String?,

    @ColumnInfo
    val artist: String?,

    @ColumnInfo
    val duration: Int?,

    @ColumnInfo
    val ownerID: Long
){
    @PrimaryKey(autoGenerate = true)
    var trackID: Long = 0
}
*/




