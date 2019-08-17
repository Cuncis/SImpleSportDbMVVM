package com.example.simplesportdbmvvm;

import android.content.Context;

import com.example.simplesportdbmvvm.data.MatchRepository;
import com.example.simplesportdbmvvm.data.local.MatchLocalDataSource;
import com.example.simplesportdbmvvm.data.remote.MatchRemoteDataSource;

public class Injection {
    public static MatchRepository provideMatchRepository(Context context) {
        return new MatchRepository(new MatchRemoteDataSource(), new MatchLocalDataSource(context));
    }
}
