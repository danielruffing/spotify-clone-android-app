package com.example.cse438.cse438_assignment2.repository

import androidx.lifecycle.MutableLiveData
import com.example.cse438.cse438_assignment2.data.ChartPayload
import com.example.cse438.cse438_assignment2.data.TrackPayload
import com.example.cse438.cse438_assignment2.network.ApiClient
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.HttpException

class ApiRepository {
    //network
    private val service = ApiClient.makeRetrofitService()

    fun getTracks(resBody: MutableLiveData<TrackPayload>) {
        CoroutineScope(Dispatchers.IO).launch {
            val response = service.getTracks()

            withContext(Dispatchers.Main) {
                try{
                    if(response.isSuccessful) {
                        resBody.value = response.body()
                    }
                } catch (e: HttpException) {
                    println("Http error")
                }
            }
        }
    }

    fun getTracksBySearch(resBody: MutableLiveData<TrackPayload>, keyword: String) {
        CoroutineScope(Dispatchers.IO).launch {
            val response = service.getTracksBySearch(keyword)
            withContext(Dispatchers.Main) {
                try{
                    if(response.isSuccessful) {
                        resBody.value = response.body()
                    }
                } catch (e: HttpException) {
                    println("Http error")
                }
            }
        }
    }
}