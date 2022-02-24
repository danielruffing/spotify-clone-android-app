package com.example.cse438.cse438_assignment2.database;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.cse438.cse438_assignment2.data.TrackDB;
import com.example.cse438.cse438_assignment2.data.TrackPlaylist;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TracklistDao_Impl implements TracklistDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<TrackDB> __insertionAdapterOfTrackDB;

  private final SharedSQLiteStatement __preparedStmtOfDeleteTrack;

  public TracklistDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTrackDB = new EntityInsertionAdapter<TrackDB>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `trackdb` (`trackID`,`name`,`artist`,`duration`,`playlistID`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TrackDB value) {
        stmt.bindLong(1, value.getTrackID());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getArtist() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getArtist());
        }
        if (value.getDuration() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getDuration());
        }
        stmt.bindLong(5, value.getPlaylistID());
      }
    };
    this.__preparedStmtOfDeleteTrack = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM trackdb WHERE trackID = ?";
        return _query;
      }
    };
  }

  @Override
  public void addTrack(final TrackDB track) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfTrackDB.insert(track);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteTrack(final int id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteTrack.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteTrack.release(_stmt);
    }
  }

  @Override
  public LiveData<List<TrackDB>> getTracks() {
    final String _sql = "SELECT * FROM trackdb";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"trackdb"}, false, new Callable<List<TrackDB>>() {
      @Override
      public List<TrackDB> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTrackID = CursorUtil.getColumnIndexOrThrow(_cursor, "trackID");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfArtist = CursorUtil.getColumnIndexOrThrow(_cursor, "artist");
          final int _cursorIndexOfDuration = CursorUtil.getColumnIndexOrThrow(_cursor, "duration");
          final int _cursorIndexOfPlaylistID = CursorUtil.getColumnIndexOrThrow(_cursor, "playlistID");
          final List<TrackDB> _result = new ArrayList<TrackDB>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TrackDB _item;
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpArtist;
            _tmpArtist = _cursor.getString(_cursorIndexOfArtist);
            final Integer _tmpDuration;
            if (_cursor.isNull(_cursorIndexOfDuration)) {
              _tmpDuration = null;
            } else {
              _tmpDuration = _cursor.getInt(_cursorIndexOfDuration);
            }
            final long _tmpPlaylistID;
            _tmpPlaylistID = _cursor.getLong(_cursorIndexOfPlaylistID);
            _item = new TrackDB(_tmpName,_tmpArtist,_tmpDuration,_tmpPlaylistID);
            final long _tmpTrackID;
            _tmpTrackID = _cursor.getLong(_cursorIndexOfTrackID);
            _item.setTrackID(_tmpTrackID);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<TrackPlaylist>> join(final int id) {
    final String _sql = "SELECT trackdb.name, trackdb.artist, trackdb.duration, playlists.genre, playlists.rating, trackdb.trackID FROM trackdb JOIN playlists ON playlists.id=trackdb.playlistID WHERE trackdb.playlistID=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return __db.getInvalidationTracker().createLiveData(new String[]{"trackdb","playlists"}, false, new Callable<List<TrackPlaylist>>() {
      @Override
      public List<TrackPlaylist> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfArtist = CursorUtil.getColumnIndexOrThrow(_cursor, "artist");
          final int _cursorIndexOfDuration = CursorUtil.getColumnIndexOrThrow(_cursor, "duration");
          final int _cursorIndexOfGenre = CursorUtil.getColumnIndexOrThrow(_cursor, "genre");
          final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
          final int _cursorIndexOfTrackID = CursorUtil.getColumnIndexOrThrow(_cursor, "trackID");
          final List<TrackPlaylist> _result = new ArrayList<TrackPlaylist>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TrackPlaylist _item;
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpArtist;
            _tmpArtist = _cursor.getString(_cursorIndexOfArtist);
            final int _tmpDuration;
            _tmpDuration = _cursor.getInt(_cursorIndexOfDuration);
            final String _tmpGenre;
            _tmpGenre = _cursor.getString(_cursorIndexOfGenre);
            final int _tmpRating;
            _tmpRating = _cursor.getInt(_cursorIndexOfRating);
            final long _tmpTrackID;
            _tmpTrackID = _cursor.getLong(_cursorIndexOfTrackID);
            _item = new TrackPlaylist(_tmpName,_tmpArtist,_tmpDuration,_tmpGenre,_tmpRating,_tmpTrackID);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
