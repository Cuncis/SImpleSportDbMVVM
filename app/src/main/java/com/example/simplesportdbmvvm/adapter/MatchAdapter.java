package com.example.simplesportdbmvvm.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.simplesportdbmvvm.R;
import com.example.simplesportdbmvvm.model.Match;
import com.example.simplesportdbmvvm.utils.Utils;

import java.util.List;

public class MatchAdapter extends RecyclerView.Adapter<MatchAdapter.MatchHolder> {

    private Context context;
    private List<Match> matches;

    public MatchAdapter(Context context, List<Match> matches) {
        this.context = context;
        this.matches = matches;
    }

    @NonNull
    @Override
    public MatchHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_match, parent, false);
        return new MatchHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MatchHolder holder, int position) {
        final Match matchList = matches.get(position);
        holder.tvDate.setText(Utils.getDateEvent(matchList.getDateEvent()));
        holder.tvHomeTeam.setText(matchList.getStrHomeTeam());
        holder.tvHomeScore.setText(matchList.getIntHomeScore());
        holder.tvAwayTeam.setText(matchList.getStrAwayTeam());
        holder.tvAwayScore.setText(matchList.getIntAwayScore());
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(context, MatchDetail.class);
//                i.putExtra("ID_EVENT", matchList.getIdEvent());
//                i.putExtra("ID_HOME", matchList.getIdHomeTeam());
//                i.putExtra("ID_AWAY", matchList.getIdAwayTeam());
//                Toast.makeText(context, "" + matchList.getIdEvent(), Toast.LENGTH_SHORT).show();
//                context.startActivity(i);
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return matches.size();
    }

    class MatchHolder extends RecyclerView.ViewHolder {
        private TextView tvDate, tvHomeTeam, tvHomeScore, tvAwayTeam, tvAwayScore;

        public MatchHolder(@NonNull View itemView) {
            super(itemView);
            tvDate = itemView.findViewById(R.id.tv_date);
            tvHomeTeam = itemView.findViewById(R.id.tv_homeTeam);
            tvHomeScore = itemView.findViewById(R.id.tv_homeScore);
            tvAwayTeam = itemView.findViewById(R.id.tv_awayTeam);
            tvAwayScore = itemView.findViewById(R.id.tv_awayScore);
        }
    }

}
