package com.example.cse438.cse438_assignment2.data;

import java.lang.System;

@androidx.room.Entity(tableName = "trackdb", foreignKeys = {@androidx.room.ForeignKey(entity = com.example.cse438.cse438_assignment2.data.Playlist.class, childColumns = {"playlistID"}, onDelete = 5, parentColumns = {"id"})})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\bH\u00c6\u0003J<\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0006H\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0011\"\u0004\b\u0014\u0010\u0015\u00a8\u0006!"}, d2 = {"Lcom/example/cse438/cse438_assignment2/data/TrackDB;", "", "name", "", "artist", "duration", "", "playlistID", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;J)V", "getArtist", "()Ljava/lang/String;", "getDuration", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "getPlaylistID", "()J", "trackID", "getTrackID", "setTrackID", "(J)V", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;J)Lcom/example/cse438/cse438_assignment2/data/TrackDB;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class TrackDB {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private long trackID;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo()
    private final java.lang.String artist = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo()
    private final java.lang.Integer duration = null;
    @androidx.room.ColumnInfo()
    private final long playlistID = 0L;
    
    public final long getTrackID() {
        return 0L;
    }
    
    public final void setTrackID(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getArtist() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDuration() {
        return null;
    }
    
    public final long getPlaylistID() {
        return 0L;
    }
    
    public TrackDB(@org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String artist, @org.jetbrains.annotations.Nullable()
    java.lang.Integer duration, long playlistID) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    public final long component4() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.cse438.cse438_assignment2.data.TrackDB copy(@org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String artist, @org.jetbrains.annotations.Nullable()
    java.lang.Integer duration, long playlistID) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}