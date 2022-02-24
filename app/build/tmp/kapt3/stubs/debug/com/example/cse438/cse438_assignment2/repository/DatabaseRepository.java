package com.example.cse438.cse438_assignment2.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/cse438/cse438_assignment2/repository/DatabaseRepository;", "", "playlistDao", "Lcom/example/cse438/cse438_assignment2/database/PlaylistDao;", "(Lcom/example/cse438/cse438_assignment2/database/PlaylistDao;)V", "allPlaylists", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/cse438/cse438_assignment2/data/Playlist;", "getAllPlaylists", "()Landroidx/lifecycle/LiveData;", "addPlaylist", "", "playlist", "app_debug"})
public final class DatabaseRepository {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.cse438.cse438_assignment2.data.Playlist>> allPlaylists = null;
    private final com.example.cse438.cse438_assignment2.database.PlaylistDao playlistDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.cse438.cse438_assignment2.data.Playlist>> getAllPlaylists() {
        return null;
    }
    
    public final void addPlaylist(@org.jetbrains.annotations.NotNull()
    com.example.cse438.cse438_assignment2.data.Playlist playlist) {
    }
    
    public DatabaseRepository(@org.jetbrains.annotations.NotNull()
    com.example.cse438.cse438_assignment2.database.PlaylistDao playlistDao) {
        super();
    }
}