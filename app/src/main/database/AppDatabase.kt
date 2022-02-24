package com.example.cse438.cse438_assignment2.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.cse438.cse438_assignment2.data.Playlist
import com.example.cse438.cse438_assignment2.data.TrackDB

@Database(entities = arrayOf(Playlist::class, TrackDB::class), version = 1)
abstract class AppDatabase: RoomDatabase(){
    abstract fun playlistDao(): PlaylistDao
    abstract fun tracklistDao(): TracklistDao

    companion object{

        @Volatile   //retrieves from memory rather than from cache
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context) : AppDatabase {
            val temp = INSTANCE
            if(temp != null) {
                return temp
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "db"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}