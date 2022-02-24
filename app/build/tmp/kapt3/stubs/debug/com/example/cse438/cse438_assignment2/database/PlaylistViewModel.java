package com.example.cse438.cse438_assignment2.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bR&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/cse438/cse438_assignment2/database/PlaylistViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "playlistList", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/cse438/cse438_assignment2/data/Playlist;", "getPlaylistList", "()Landroidx/lifecycle/LiveData;", "setPlaylistList", "(Landroidx/lifecycle/LiveData;)V", "repository", "Lcom/example/cse438/cse438_assignment2/repository/DatabaseRepository;", "getPlaylists", "insert", "", "playlist", "app_debug"})
public final class PlaylistViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.example.cse438.cse438_assignment2.data.Playlist>> playlistList;
    private final com.example.cse438.cse438_assignment2.repository.DatabaseRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.cse438.cse438_assignment2.data.Playlist>> getPlaylistList() {
        return null;
    }
    
    public final void setPlaylistList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.cse438.cse438_assignment2.data.Playlist>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.cse438.cse438_assignment2.data.Playlist>> getPlaylists() {
        return null;
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    com.example.cse438.cse438_assignment2.data.Playlist playlist) {
    }
    
    public PlaylistViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}