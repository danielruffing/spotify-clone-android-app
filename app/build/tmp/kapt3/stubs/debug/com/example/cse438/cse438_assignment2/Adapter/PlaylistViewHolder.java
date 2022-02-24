package com.example.cse438.cse438_assignment2.Adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J \u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/cse438/cse438_assignment2/Adapter/PlaylistViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "inflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V", "description", "Landroid/widget/TextView;", "item", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getItem", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "title", "bind", "", "playlist", "Lcom/example/cse438/cse438_assignment2/data/Playlist;", "bundle", "Landroid/os/Bundle;", "bindAlt", "vm", "Lcom/example/cse438/cse438_assignment2/database/TracklistViewModel;", "app_debug"})
public final class PlaylistViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    @org.jetbrains.annotations.NotNull()
    private final androidx.constraintlayout.widget.ConstraintLayout item = null;
    private final android.widget.TextView title = null;
    private final android.widget.TextView description = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.constraintlayout.widget.ConstraintLayout getItem() {
        return null;
    }
    
    /**
     * creates a new playlist and inserts it into the PlaylistFragment Adapter
     * uses the adapter: PlaylistListAdapter
     */
    public final void bind(@org.jetbrains.annotations.NotNull()
    com.example.cse438.cse438_assignment2.data.Playlist playlist, @org.jetbrains.annotations.Nullable()
    android.os.Bundle bundle) {
    }
    
    /**
     * used for adding a track to the selected playlist from RecyclerView
     * adapter: PlaylistSelectAdapter
     */
    public final void bindAlt(@org.jetbrains.annotations.NotNull()
    com.example.cse438.cse438_assignment2.data.Playlist playlist, @org.jetbrains.annotations.Nullable()
    android.os.Bundle bundle, @org.jetbrains.annotations.NotNull()
    com.example.cse438.cse438_assignment2.database.TracklistViewModel vm) {
    }
    
    public PlaylistViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        super(null);
    }
}