package com.example.cse438.cse438_assignment2.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\u0003H\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000bH\'\u00a8\u0006\r"}, d2 = {"Lcom/example/cse438/cse438_assignment2/database/PlaylistDao;", "", "addPlaylist", "", "playlist", "Lcom/example/cse438/cse438_assignment2/data/Playlist;", "delete", "id", "", "deleteAll", "getPlaylists", "Landroidx/lifecycle/LiveData;", "", "app_debug"})
public abstract interface PlaylistDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM playlists")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.cse438.cse438_assignment2.data.Playlist>> getPlaylists();
    
    @androidx.room.Insert()
    public abstract void addPlaylist(@org.jetbrains.annotations.NotNull()
    com.example.cse438.cse438_assignment2.data.Playlist playlist);
    
    @androidx.room.Query(value = "DELETE FROM playlists WHERE playlists.id = :id")
    public abstract void delete(int id);
    
    @androidx.room.Query(value = "DELETE FROM playlists")
    public abstract void deleteAll();
}