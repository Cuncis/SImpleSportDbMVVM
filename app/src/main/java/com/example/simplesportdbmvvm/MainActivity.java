package com.example.simplesportdbmvvm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.simplesportdbmvvm.adapter.MatchAdapter;
import com.example.simplesportdbmvvm.model.Match;
import com.example.simplesportdbmvvm.viewmodel.MatchViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MatchViewModel.MatchNavigator {

    private MatchViewModel matchViewModel;
    private RecyclerView recyclerView;

    private MatchAdapter adapter;
    private List<Match> matches;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_lastMatch);
        matchViewModel = new MatchViewModel(Injection.provideMatchRepository(this));
        matches = new ArrayList<>();
        matchViewModel.setNavigator(this);
        matchViewModel.getListMatch();
        initAdapter();
    }

    private void initAdapter() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        adapter = new MatchAdapter(this, matches);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void loadListMatch(List<Match> matchList) {
        matches.addAll(matchList);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void errorLoadMatchList(String message) {
        Toast.makeText(this, "" + message, Toast.LENGTH_SHORT).show();
    }
}
