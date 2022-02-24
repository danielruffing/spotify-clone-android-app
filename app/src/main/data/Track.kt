package com.example.cse438.cse438_assignment2.data

data class Track(
    val id: Long,
    val title: String,
    val position: Int,
    val duration: Int,
    val rank: Int,
    val artist: Artist,
    val album: Album
)
data class TrackPayload(
    val data: List<Track>
)