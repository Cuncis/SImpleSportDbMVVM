package com.example.simplesportdbmvvm.data.remote;

import com.example.simplesportdbmvvm.model.MatchResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("api/v1/json/1/eventspastleague.php")
    Call<MatchResponse> getAllLastMatches(@Query("id") String id);

}
