package com.example.cse438.cse438_assignment2.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\'J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\nH\'J\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000b0\n2\u0006\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\u000e"}, d2 = {"Lcom/example/cse438/cse438_assignment2/database/TracklistDao;", "", "addTrack", "", "track", "Lcom/example/cse438/cse438_assignment2/data/TrackDB;", "deleteTrack", "id", "", "getTracks", "Landroidx/lifecycle/LiveData;", "", "join", "Lcom/example/cse438/cse438_assignment2/data/TrackPlaylist;", "app_debug"})
public abstract interface TracklistDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM trackdb")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.cse438.cse438_assignment2.data.TrackDB>> getTracks();
    
    @androidx.room.Insert()
    public abstract void addTrack(@org.jetbrains.annotations.NotNull()
    com.example.cse438.cse438_assignment2.data.TrackDB track);
    
    @androidx.room.Query(value = "DELETE FROM trackdb WHERE trackID = :id")
    public abstract void deleteTrack(int id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT trackdb.name, trackdb.artist, trackdb.duration, playlists.genre, playlists.rating, trackdb.trackID FROM trackdb JOIN playlists ON playlists.id=trackdb.playlistID WHERE trackdb.playlistID=:id")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.cse438.cse438_assignment2.data.TrackPlaylist>> join(int id);
}