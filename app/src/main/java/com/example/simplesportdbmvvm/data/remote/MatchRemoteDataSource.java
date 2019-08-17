package com.example.simplesportdbmvvm.data.remote;

import com.example.simplesportdbmvvm.data.MatchDataSource;
import com.example.simplesportdbmvvm.model.MatchResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MatchRemoteDataSource implements MatchDataSource {

    private ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);

    @Override
    public void getListMatch(final GetMatchCallback callback) {
        Call<MatchResponse> call = apiInterface.getAllLastMatches("4328");
        call.enqueue(new Callback<MatchResponse>() {
            @Override
            public void onResponse(Call<MatchResponse> call, Response<MatchResponse> response) {
                callback.onMatchLoaded(response.body());
            }

            @Override
            public void onFailure(Call<MatchResponse> call, Throwable t) {
                callback.onDataNotAvailable(t.getMessage());
            }
        });
    }
}
