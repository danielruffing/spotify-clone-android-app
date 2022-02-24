package com.example.cse438.cse438_assignment2.data

data class Chart(
    val tracks: List<TrackPayload>,
    val total: Int
)
//FIXME: ??? am I using the chart object from the API correctly?
data class ChartPayload(
    val data: List<Track>
)
