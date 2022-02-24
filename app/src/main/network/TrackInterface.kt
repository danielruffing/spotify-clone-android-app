package com.example.cse438.cse438_assignment2.network

import com.example.cse438.cse438_assignment2.data.Chart
import com.example.cse438.cse438_assignment2.data.ChartPayload
import com.example.cse438.cse438_assignment2.data.TrackPayload
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TrackInterface {

    @GET("/chart/0/tracks")
    suspend fun getTracks(): Response<TrackPayload>
    //FIXME: Response<TrackPayload>?


    @GET("/search")
    suspend fun getTracksBySearch(@Query("q") q: String): Response<TrackPayload>

}