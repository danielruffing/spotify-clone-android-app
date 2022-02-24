package com.example.cse438.cse438_assignment2;

import java.lang.System;

/**
 * this activity appears when adding a track [From TrackActivity()] to a playlist
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\fH\u0014R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/cse438/cse438_assignment2/TrackToPlaylistActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "playlistList", "Ljava/util/ArrayList;", "Lcom/example/cse438/cse438_assignment2/data/Playlist;", "Lkotlin/collections/ArrayList;", "playlistViewModel", "Lcom/example/cse438/cse438_assignment2/database/PlaylistViewModel;", "tracklistViewModel", "Lcom/example/cse438/cse438_assignment2/database/TracklistViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "app_debug"})
public final class TrackToPlaylistActivity extends androidx.appcompat.app.AppCompatActivity {
    private java.util.ArrayList<com.example.cse438.cse438_assignment2.data.Playlist> playlistList;
    private com.example.cse438.cse438_assignment2.database.PlaylistViewModel playlistViewModel;
    private com.example.cse438.cse438_assignment2.database.TracklistViewModel tracklistViewModel;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    public TrackToPlaylistActivity() {
        super();
    }
}