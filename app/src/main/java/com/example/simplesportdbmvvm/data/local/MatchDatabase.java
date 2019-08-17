package com.example.simplesportdbmvvm.data.local;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.example.simplesportdbmvvm.model.Match;

@Database(entities = {Match.class}, version = 1)
public abstract class MatchDatabase extends RoomDatabase {

    private static MatchDatabase INSTANCE;

    public abstract MatchDAO matchDAO();

    private static final Object sLock = new Object();

    public static MatchDatabase getInstance(Context context) {
        synchronized (sLock) {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(context, MatchDatabase.class, "match_db")
                        .build();
            }

            return INSTANCE;
        }
    }

}
