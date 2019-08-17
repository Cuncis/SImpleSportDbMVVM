package com.example.simplesportdbmvvm.data;

import com.example.simplesportdbmvvm.model.MatchResponse;

public interface MatchDataSource {

    void getListMatch(GetMatchCallback callback);

    interface GetMatchCallback {
        void onMatchLoaded(MatchResponse data);
        void onDataNotAvailable(String errorMessage);
    }

}
