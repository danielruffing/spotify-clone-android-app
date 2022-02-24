package com.example.cse438.cse438_assignment2.network

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.cse438.cse438_assignment2.data.ChartPayload
import com.example.cse438.cse438_assignment2.data.TrackPayload
import com.example.cse438.cse438_assignment2.repository.ApiRepository

class TrackViewModel (application: Application): AndroidViewModel(application) {
    var trackList: MutableLiveData<TrackPayload> = MutableLiveData()
    var chart: MutableLiveData<ChartPayload> = MutableLiveData()
    private val repository: ApiRepository = ApiRepository()

    fun search(keyword: String?){
        if(keyword==null){
            //FIXME: improve logic here?
        } else{
            repository.getTracksBySearch(trackList, keyword)
        }
    }

    fun charts(){
        repository.getTracks(trackList)
    }
}