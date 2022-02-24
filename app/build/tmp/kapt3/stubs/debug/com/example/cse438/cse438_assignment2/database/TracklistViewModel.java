package com.example.cse438.cse438_assignment2.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015J\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0017\u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/example/cse438/cse438_assignment2/database/TracklistViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "repository", "Lcom/example/cse438/cse438_assignment2/repository/TrackDBRepository;", "trackList", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/cse438/cse438_assignment2/data/TrackPlaylist;", "getTrackList", "()Landroidx/lifecycle/LiveData;", "setTrackList", "(Landroidx/lifecycle/LiveData;)V", "deleteTrack", "", "id", "", "insert", "track", "Lcom/example/cse438/cse438_assignment2/data/TrackDB;", "joinTracks", "playlistID", "app_debug"})
public final class TracklistViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.example.cse438.cse438_assignment2.data.TrackPlaylist>> trackList;
    private final com.example.cse438.cse438_assignment2.repository.TrackDBRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.cse438.cse438_assignment2.data.TrackPlaylist>> getTrackList() {
        return null;
    }
    
    public final void setTrackList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.cse438.cse438_assignment2.data.TrackPlaylist>> p0) {
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    com.example.cse438.cse438_assignment2.data.TrackDB track) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.cse438.cse438_assignment2.data.TrackPlaylist>> joinTracks(int playlistID) {
        return null;
    }
    
    public final void deleteTrack(int id) {
    }
    
    public TracklistViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}