package com.example.simplesportdbmvvm.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;


public class MatchResponse{

	@SerializedName("events")
	private List<Match> events;

	public MatchResponse(List<Match> events) {
		this.events = events;
	}

	public void setEvents(List<Match> events){
		this.events = events;
	}

	public List<Match> getEvents(){
		return events;
	}

	@Override
 	public String toString(){
		return 
			"MatchResponse{" + 
			"events = '" + events + '\'' + 
			"}";
		}
}