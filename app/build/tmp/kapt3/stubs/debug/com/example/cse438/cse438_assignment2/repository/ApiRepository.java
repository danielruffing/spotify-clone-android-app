package com.example.cse438.cse438_assignment2.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u001c\u0010\n\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/cse438/cse438_assignment2/repository/ApiRepository;", "", "()V", "service", "Lcom/example/cse438/cse438_assignment2/network/TrackInterface;", "getTracks", "", "resBody", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/cse438/cse438_assignment2/data/TrackPayload;", "getTracksBySearch", "keyword", "", "app_debug"})
public final class ApiRepository {
    private final com.example.cse438.cse438_assignment2.network.TrackInterface service = null;
    
    public final void getTracks(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.cse438.cse438_assignment2.data.TrackPayload> resBody) {
    }
    
    public final void getTracksBySearch(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.cse438.cse438_assignment2.data.TrackPayload> resBody, @org.jetbrains.annotations.NotNull()
    java.lang.String keyword) {
    }
    
    public ApiRepository() {
        super();
    }
}