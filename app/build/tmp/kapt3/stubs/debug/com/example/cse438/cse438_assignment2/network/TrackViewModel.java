package com.example.cse438.cse438_assignment2.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/example/cse438/cse438_assignment2/network/TrackViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "chart", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/cse438/cse438_assignment2/data/ChartPayload;", "getChart", "()Landroidx/lifecycle/MutableLiveData;", "setChart", "(Landroidx/lifecycle/MutableLiveData;)V", "repository", "Lcom/example/cse438/cse438_assignment2/repository/ApiRepository;", "trackList", "Lcom/example/cse438/cse438_assignment2/data/TrackPayload;", "getTrackList", "setTrackList", "charts", "", "search", "keyword", "", "app_debug"})
public final class TrackViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.cse438.cse438_assignment2.data.TrackPayload> trackList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.cse438.cse438_assignment2.data.ChartPayload> chart;
    private final com.example.cse438.cse438_assignment2.repository.ApiRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.cse438.cse438_assignment2.data.TrackPayload> getTrackList() {
        return null;
    }
    
    public final void setTrackList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.cse438.cse438_assignment2.data.TrackPayload> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.cse438.cse438_assignment2.data.ChartPayload> getChart() {
        return null;
    }
    
    public final void setChart(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.cse438.cse438_assignment2.data.ChartPayload> p0) {
    }
    
    public final void search(@org.jetbrains.annotations.Nullable()
    java.lang.String keyword) {
    }
    
    public final void charts() {
    }
    
    public TrackViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}