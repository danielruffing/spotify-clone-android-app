package com.example.cse438.cse438_assignment2.Adapter;

import java.lang.System;

/**
 * this adapter is used when selecting
 * which playlist to add a track to
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lcom/example/cse438/cse438_assignment2/Adapter/PlaylistSelectAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/cse438/cse438_assignment2/Adapter/PlaylistViewHolder;", "list", "Ljava/util/ArrayList;", "Lcom/example/cse438/cse438_assignment2/data/Playlist;", "Lkotlin/collections/ArrayList;", "bundle", "Landroid/os/Bundle;", "vm", "Lcom/example/cse438/cse438_assignment2/database/TracklistViewModel;", "(Ljava/util/ArrayList;Landroid/os/Bundle;Lcom/example/cse438/cse438_assignment2/database/TracklistViewModel;)V", "getVm", "()Lcom/example/cse438/cse438_assignment2/database/TracklistViewModel;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public final class PlaylistSelectAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.cse438.cse438_assignment2.Adapter.PlaylistViewHolder> {
    private final java.util.ArrayList<com.example.cse438.cse438_assignment2.data.Playlist> list = null;
    private final android.os.Bundle bundle = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.cse438.cse438_assignment2.database.TracklistViewModel vm = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.cse438.cse438_assignment2.Adapter.PlaylistViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.cse438.cse438_assignment2.Adapter.PlaylistViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.cse438.cse438_assignment2.database.TracklistViewModel getVm() {
        return null;
    }
    
    public PlaylistSelectAdapter(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.example.cse438.cse438_assignment2.data.Playlist> list, @org.jetbrains.annotations.Nullable()
    android.os.Bundle bundle, @org.jetbrains.annotations.NotNull()
    com.example.cse438.cse438_assignment2.database.TracklistViewModel vm) {
        super();
    }
}