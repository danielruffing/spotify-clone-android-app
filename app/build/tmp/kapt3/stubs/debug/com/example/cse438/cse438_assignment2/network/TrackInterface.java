package com.example.cse438.cse438_assignment2.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/example/cse438/cse438_assignment2/network/TrackInterface;", "", "getTracks", "Lretrofit2/Response;", "Lcom/example/cse438/cse438_assignment2/data/TrackPayload;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTracksBySearch", "q", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface TrackInterface {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/chart/0/tracks")
    public abstract java.lang.Object getTracks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.cse438.cse438_assignment2.data.TrackPayload>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/search")
    public abstract java.lang.Object getTracksBySearch(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String q, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.cse438.cse438_assignment2.data.TrackPayload>> p1);
}