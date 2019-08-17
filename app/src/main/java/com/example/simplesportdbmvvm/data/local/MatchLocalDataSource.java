package com.example.simplesportdbmvvm.data.local;

import android.content.Context;

import com.example.simplesportdbmvvm.data.MatchDataSource;
import com.example.simplesportdbmvvm.model.Match;
import com.example.simplesportdbmvvm.model.MatchResponse;

import java.util.List;

public class MatchLocalDataSource implements MatchDataSource {

    private Context context;
    private MatchDAO matchDAO;

    public MatchLocalDataSource(Context context) {
        this.context = context;
        matchDAO = MatchDatabase.getInstance(context).matchDAO();
    }

    @Override
    public void getListMatch(final GetMatchCallback callback) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                List<Match> matches = matchDAO.getMatches();
                if (matches.isEmpty()) {
                    callback.onDataNotAvailable("Data di Database SQLite Kosong...");
                } else {
                    MatchResponse data = new MatchResponse(matches);
                    callback.onMatchLoaded(data);
                }
            }
        };

        new Thread(runnable).start();
    }

    public void saveDataMatch(final List<Match> matchList) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                matchDAO.insertTeam(matchList);
            }
        };

        new Thread(runnable).start();
    }
}
