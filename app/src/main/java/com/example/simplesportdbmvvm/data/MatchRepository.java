package com.example.simplesportdbmvvm.data;

import com.example.simplesportdbmvvm.data.local.MatchLocalDataSource;
import com.example.simplesportdbmvvm.data.remote.MatchRemoteDataSource;
import com.example.simplesportdbmvvm.model.MatchResponse;

public class MatchRepository implements MatchDataSource {

    private MatchRemoteDataSource matchRemoteDataSource;
    private MatchLocalDataSource matchLocalDataSource;

    public MatchRepository(MatchRemoteDataSource matchRemoteDataSource, MatchLocalDataSource matchLocalDataSource) {
        this.matchRemoteDataSource = matchRemoteDataSource;
        this.matchLocalDataSource = matchLocalDataSource;
    }

    @Override
    public void getListMatch(final GetMatchCallback callback) {
        matchLocalDataSource.getListMatch(new GetMatchCallback() {
            @Override
            public void onMatchLoaded(MatchResponse data) {
                callback.onMatchLoaded(data);
            }

            @Override
            public void onDataNotAvailable(String errorMessage) {
                getMatchesFromRemote(callback);
            }
        });
    }

    private void getMatchesFromRemote(final GetMatchCallback callback) {
        matchRemoteDataSource.getListMatch(new GetMatchCallback() {
            @Override
            public void onMatchLoaded(MatchResponse data) {
                matchLocalDataSource.saveDataMatch(data.getEvents());
                callback.onMatchLoaded(data);
            }

            @Override
            public void onDataNotAvailable(String errorMessage) {
                callback.onDataNotAvailable(errorMessage);
            }
        });
    }
}
