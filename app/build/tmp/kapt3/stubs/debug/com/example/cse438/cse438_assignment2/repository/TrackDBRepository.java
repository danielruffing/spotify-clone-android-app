package com.example.cse438.cse438_assignment2.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011J\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0013\u001a\u00020\u0011R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/cse438/cse438_assignment2/repository/TrackDBRepository;", "", "tracklistDao", "Lcom/example/cse438/cse438_assignment2/database/TracklistDao;", "(Lcom/example/cse438/cse438_assignment2/database/TracklistDao;)V", "allTracksDB", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/cse438/cse438_assignment2/data/TrackPlaylist;", "getAllTracksDB", "()Landroidx/lifecycle/LiveData;", "addTrack", "", "track", "Lcom/example/cse438/cse438_assignment2/data/TrackDB;", "deleteTrackByID", "id", "", "join", "ownerID", "app_debug"})
public final class TrackDBRepository {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.cse438.cse438_assignment2.data.TrackPlaylist>> allTracksDB = null;
    private final com.example.cse438.cse438_assignment2.database.TracklistDao tracklistDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.cse438.cse438_assignment2.data.TrackPlaylist>> getAllTracksDB() {
        return null;
    }
    
    public final void addTrack(@org.jetbrains.annotations.NotNull()
    com.example.cse438.cse438_assignment2.data.TrackDB track) {
    }
    
    public final void deleteTrackByID(int id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.cse438.cse438_assignment2.data.TrackPlaylist>> join(int ownerID) {
        return null;
    }
    
    public TrackDBRepository(@org.jetbrains.annotations.NotNull()
    com.example.cse438.cse438_assignment2.database.TracklistDao tracklistDao) {
        super();
    }
}