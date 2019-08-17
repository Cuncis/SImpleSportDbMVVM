package com.example.simplesportdbmvvm.viewmodel;

import com.example.simplesportdbmvvm.data.MatchDataSource;
import com.example.simplesportdbmvvm.data.MatchRepository;
import com.example.simplesportdbmvvm.model.Match;
import com.example.simplesportdbmvvm.model.MatchResponse;

import java.util.List;

public class MatchViewModel {

    private MatchRepository matchRepository;
    private MatchNavigator navigator;

    public MatchViewModel(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    public void setNavigator(MatchNavigator navigator) {
        this.navigator = navigator;
    }

    public void getListMatch() {
        matchRepository.getListMatch(new MatchDataSource.GetMatchCallback() {
            @Override
            public void onMatchLoaded(MatchResponse data) {
                navigator.loadListMatch(data.getEvents());
            }

            @Override
            public void onDataNotAvailable(String errorMessage) {
                navigator.errorLoadMatchList(errorMessage);
            }
        });
    }

    public interface MatchNavigator {
        void loadListMatch(List<Match> matchList);
        void errorLoadMatchList(String message);
    }

}
