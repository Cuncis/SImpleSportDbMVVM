package com.example.simplesportdbmvvm.data.local;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.simplesportdbmvvm.model.Match;

import java.util.List;

@Dao
public interface MatchDAO {
    @Query("SELECT * FROM `match`")
    List<Match> getMatches();

    @Insert
    void insertTeam(List<Match> matches);
}
