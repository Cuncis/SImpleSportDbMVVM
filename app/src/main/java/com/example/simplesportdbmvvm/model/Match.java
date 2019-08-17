package com.example.simplesportdbmvvm.model;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "match")
public class Match {

	@PrimaryKey(autoGenerate = true)
	private int id;

	@SerializedName("intHomeShots")
	private String intHomeShots;

	@SerializedName("strSport")
	private String strSport;

	@SerializedName("strHomeLineupDefense")
	private String strHomeLineupDefense;

	@SerializedName("datetimeEventUTC")
	private String datetimeEventUTC;

	@SerializedName("strAwayLineupSubstitutes")
	private String strAwayLineupSubstitutes;

	@SerializedName("strTweet1")
	private String strTweet1;

	@SerializedName("strTweet2")
	private String strTweet2;

	@SerializedName("strTweet3")
	private String strTweet3;

	@SerializedName("idLeague")
	private String idLeague;

	@SerializedName("idSoccerXML")
	private String idSoccerXML;

	@SerializedName("strHomeLineupForward")
	private String strHomeLineupForward;

	@SerializedName("strTVStation")
	private String strTVStation;

	@SerializedName("strHomeGoalDetails")
	private String strHomeGoalDetails;

	@SerializedName("strVideo")
	private String strVideo;

	@SerializedName("strAwayLineupGoalkeeper")
	private String strAwayLineupGoalkeeper;

	@SerializedName("strAwayLineupMidfield")
	private String strAwayLineupMidfield;

	@ColumnInfo(name = "id_event")
	@SerializedName("idEvent")
	private String idEvent;

	@SerializedName("intRound")
	private String intRound;

	@SerializedName("strHomeYellowCards")
	private String strHomeYellowCards;

	@SerializedName("idHomeTeam")
	private String idHomeTeam;

	@ColumnInfo(name = "home_score")
	@SerializedName("intHomeScore")
	private String intHomeScore;

	@ColumnInfo(name = "date_event")
	@SerializedName("dateEvent")
	private String dateEvent;

	@SerializedName("strCountry")
	private String strCountry;

	@ColumnInfo(name = "away_team")
	@SerializedName("strAwayTeam")
	private String strAwayTeam;

	@SerializedName("strHomeLineupMidfield")
	private String strHomeLineupMidfield;

	@SerializedName("strDate")
	private String strDate;

	@SerializedName("strHomeFormation")
	private String strHomeFormation;

	@SerializedName("strMap")
	private String strMap;

	@SerializedName("idAwayTeam")
	private String idAwayTeam;

	@SerializedName("strAwayRedCards")
	private String strAwayRedCards;

	@SerializedName("strBanner")
	private String strBanner;

	@SerializedName("strFanart")
	private String strFanart;

	@SerializedName("strDescriptionEN")
	private String strDescriptionEN;

	@SerializedName("strResult")
	private String strResult;

	@SerializedName("strCircuit")
	private String strCircuit;

	@SerializedName("intAwayShots")
	private String intAwayShots;

	@SerializedName("strFilename")
	private String strFilename;

	@SerializedName("strTime")
	private String strTime;

	@SerializedName("strAwayGoalDetails")
	private String strAwayGoalDetails;

	@SerializedName("strAwayLineupForward")
	private String strAwayLineupForward;

	@SerializedName("strLocked")
	private String strLocked;

	@SerializedName("strSeason")
	private String strSeason;

	@SerializedName("intSpectators")
	private String intSpectators;

	@SerializedName("strHomeRedCards")
	private String strHomeRedCards;

	@SerializedName("strHomeLineupGoalkeeper")
	private String strHomeLineupGoalkeeper;

	@SerializedName("strHomeLineupSubstitutes")
	private String strHomeLineupSubstitutes;

	@SerializedName("strAwayFormation")
	private String strAwayFormation;

	@SerializedName("strEvent")
	private String strEvent;

	@SerializedName("strAwayYellowCards")
	private String strAwayYellowCards;

	@SerializedName("strAwayLineupDefense")
	private String strAwayLineupDefense;

	@ColumnInfo(name = "home_team")
	@SerializedName("strHomeTeam")
	private String strHomeTeam;

	@SerializedName("strThumb")
	private String strThumb;

	@SerializedName("strLeague")
	private String strLeague;

	@ColumnInfo(name = "away_score")
	@SerializedName("intAwayScore")
	private String intAwayScore;

	@SerializedName("strCity")
	private String strCity;

	@SerializedName("strPoster")
	private String strPoster;

	public void setIntHomeShots(String intHomeShots){
		this.intHomeShots = intHomeShots;
	}

	public String getIntHomeShots(){
		return intHomeShots;
	}

	public void setStrSport(String strSport){
		this.strSport = strSport;
	}

	public String getStrSport(){
		return strSport;
	}

	public void setStrHomeLineupDefense(String strHomeLineupDefense){
		this.strHomeLineupDefense = strHomeLineupDefense;
	}

	public String getStrHomeLineupDefense(){
		return strHomeLineupDefense;
	}

	public void setDatetimeEventUTC(String datetimeEventUTC){
		this.datetimeEventUTC = datetimeEventUTC;
	}

	public String getDatetimeEventUTC(){
		return datetimeEventUTC;
	}

	public void setStrAwayLineupSubstitutes(String strAwayLineupSubstitutes){
		this.strAwayLineupSubstitutes = strAwayLineupSubstitutes;
	}

	public String getStrAwayLineupSubstitutes(){
		return strAwayLineupSubstitutes;
	}

	public void setStrTweet1(String strTweet1){
		this.strTweet1 = strTweet1;
	}

	public String getStrTweet1(){
		return strTweet1;
	}

	public void setStrTweet2(String strTweet2){
		this.strTweet2 = strTweet2;
	}

	public String getStrTweet2(){
		return strTweet2;
	}

	public void setStrTweet3(String strTweet3){
		this.strTweet3 = strTweet3;
	}

	public String getStrTweet3(){
		return strTweet3;
	}

	public void setIdLeague(String idLeague){
		this.idLeague = idLeague;
	}

	public String getIdLeague(){
		return idLeague;
	}

	public void setIdSoccerXML(String idSoccerXML){
		this.idSoccerXML = idSoccerXML;
	}

	public String getIdSoccerXML(){
		return idSoccerXML;
	}

	public void setStrHomeLineupForward(String strHomeLineupForward){
		this.strHomeLineupForward = strHomeLineupForward;
	}

	public String getStrHomeLineupForward(){
		return strHomeLineupForward;
	}

	public void setStrTVStation(String strTVStation){
		this.strTVStation = strTVStation;
	}

	public String getStrTVStation(){
		return strTVStation;
	}

	public void setStrHomeGoalDetails(String strHomeGoalDetails){
		this.strHomeGoalDetails = strHomeGoalDetails;
	}

	public String getStrHomeGoalDetails(){
		return strHomeGoalDetails;
	}

	public void setStrVideo(String strVideo){
		this.strVideo = strVideo;
	}

	public String getStrVideo(){
		return strVideo;
	}

	public void setStrAwayLineupGoalkeeper(String strAwayLineupGoalkeeper){
		this.strAwayLineupGoalkeeper = strAwayLineupGoalkeeper;
	}

	public String getStrAwayLineupGoalkeeper(){
		return strAwayLineupGoalkeeper;
	}

	public void setStrAwayLineupMidfield(String strAwayLineupMidfield){
		this.strAwayLineupMidfield = strAwayLineupMidfield;
	}

	public String getStrAwayLineupMidfield(){
		return strAwayLineupMidfield;
	}

	public void setIdEvent(String idEvent){
		this.idEvent = idEvent;
	}

	public String getIdEvent(){
		return idEvent;
	}

	public void setIntRound(String intRound){
		this.intRound = intRound;
	}

	public String getIntRound(){
		return intRound;
	}

	public void setStrHomeYellowCards(String strHomeYellowCards){
		this.strHomeYellowCards = strHomeYellowCards;
	}

	public String getStrHomeYellowCards(){
		return strHomeYellowCards;
	}

	public void setIdHomeTeam(String idHomeTeam){
		this.idHomeTeam = idHomeTeam;
	}

	public String getIdHomeTeam(){
		return idHomeTeam;
	}

	public void setIntHomeScore(String intHomeScore){
		this.intHomeScore = intHomeScore;
	}

	public String getIntHomeScore(){
		return intHomeScore;
	}

	public void setDateEvent(String dateEvent){
		this.dateEvent = dateEvent;
	}

	public String getDateEvent(){
		return dateEvent;
	}

	public void setStrCountry(String strCountry){
		this.strCountry = strCountry;
	}

	public String getStrCountry(){
		return strCountry;
	}

	public void setStrAwayTeam(String strAwayTeam){
		this.strAwayTeam = strAwayTeam;
	}

	public String getStrAwayTeam(){
		return strAwayTeam;
	}

	public void setStrHomeLineupMidfield(String strHomeLineupMidfield){
		this.strHomeLineupMidfield = strHomeLineupMidfield;
	}

	public String getStrHomeLineupMidfield(){
		return strHomeLineupMidfield;
	}

	public void setStrDate(String strDate){
		this.strDate = strDate;
	}

	public String getStrDate(){
		return strDate;
	}

	public void setStrHomeFormation(String strHomeFormation){
		this.strHomeFormation = strHomeFormation;
	}

	public String getStrHomeFormation(){
		return strHomeFormation;
	}

	public void setStrMap(String strMap){
		this.strMap = strMap;
	}

	public String getStrMap(){
		return strMap;
	}

	public void setIdAwayTeam(String idAwayTeam){
		this.idAwayTeam = idAwayTeam;
	}

	public String getIdAwayTeam(){
		return idAwayTeam;
	}

	public void setStrAwayRedCards(String strAwayRedCards){
		this.strAwayRedCards = strAwayRedCards;
	}

	public String getStrAwayRedCards(){
		return strAwayRedCards;
	}

	public void setStrBanner(String strBanner){
		this.strBanner = strBanner;
	}

	public String getStrBanner(){
		return strBanner;
	}

	public void setStrFanart(String strFanart){
		this.strFanart = strFanart;
	}

	public String getStrFanart(){
		return strFanart;
	}

	public void setStrDescriptionEN(String strDescriptionEN){
		this.strDescriptionEN = strDescriptionEN;
	}

	public String getStrDescriptionEN(){
		return strDescriptionEN;
	}

	public void setStrResult(String strResult){
		this.strResult = strResult;
	}

	public String getStrResult(){
		return strResult;
	}

	public void setStrCircuit(String strCircuit){
		this.strCircuit = strCircuit;
	}

	public String getStrCircuit(){
		return strCircuit;
	}

	public void setIntAwayShots(String intAwayShots){
		this.intAwayShots = intAwayShots;
	}

	public String getIntAwayShots(){
		return intAwayShots;
	}

	public void setStrFilename(String strFilename){
		this.strFilename = strFilename;
	}

	public String getStrFilename(){
		return strFilename;
	}

	public void setStrTime(String strTime){
		this.strTime = strTime;
	}

	public String getStrTime(){
		return strTime;
	}

	public void setStrAwayGoalDetails(String strAwayGoalDetails){
		this.strAwayGoalDetails = strAwayGoalDetails;
	}

	public String getStrAwayGoalDetails(){
		return strAwayGoalDetails;
	}

	public void setStrAwayLineupForward(String strAwayLineupForward){
		this.strAwayLineupForward = strAwayLineupForward;
	}

	public String getStrAwayLineupForward(){
		return strAwayLineupForward;
	}

	public void setStrLocked(String strLocked){
		this.strLocked = strLocked;
	}

	public String getStrLocked(){
		return strLocked;
	}

	public void setStrSeason(String strSeason){
		this.strSeason = strSeason;
	}

	public String getStrSeason(){
		return strSeason;
	}

	public void setIntSpectators(String intSpectators){
		this.intSpectators = intSpectators;
	}

	public String getIntSpectators(){
		return intSpectators;
	}

	public void setStrHomeRedCards(String strHomeRedCards){
		this.strHomeRedCards = strHomeRedCards;
	}

	public String getStrHomeRedCards(){
		return strHomeRedCards;
	}

	public void setStrHomeLineupGoalkeeper(String strHomeLineupGoalkeeper){
		this.strHomeLineupGoalkeeper = strHomeLineupGoalkeeper;
	}

	public String getStrHomeLineupGoalkeeper(){
		return strHomeLineupGoalkeeper;
	}

	public void setStrHomeLineupSubstitutes(String strHomeLineupSubstitutes){
		this.strHomeLineupSubstitutes = strHomeLineupSubstitutes;
	}

	public String getStrHomeLineupSubstitutes(){
		return strHomeLineupSubstitutes;
	}

	public void setStrAwayFormation(String strAwayFormation){
		this.strAwayFormation = strAwayFormation;
	}

	public String getStrAwayFormation(){
		return strAwayFormation;
	}

	public void setStrEvent(String strEvent){
		this.strEvent = strEvent;
	}

	public String getStrEvent(){
		return strEvent;
	}

	public void setStrAwayYellowCards(String strAwayYellowCards){
		this.strAwayYellowCards = strAwayYellowCards;
	}

	public String getStrAwayYellowCards(){
		return strAwayYellowCards;
	}

	public void setStrAwayLineupDefense(String strAwayLineupDefense){
		this.strAwayLineupDefense = strAwayLineupDefense;
	}

	public String getStrAwayLineupDefense(){
		return strAwayLineupDefense;
	}

	public void setStrHomeTeam(String strHomeTeam){
		this.strHomeTeam = strHomeTeam;
	}

	public String getStrHomeTeam(){
		return strHomeTeam;
	}

	public void setStrThumb(String strThumb){
		this.strThumb = strThumb;
	}

	public String getStrThumb(){
		return strThumb;
	}

	public void setStrLeague(String strLeague){
		this.strLeague = strLeague;
	}

	public String getStrLeague(){
		return strLeague;
	}

	public void setIntAwayScore(String intAwayScore){
		this.intAwayScore = intAwayScore;
	}

	public String getIntAwayScore(){
		return intAwayScore;
	}

	public void setStrCity(String strCity){
		this.strCity = strCity;
	}

	public String getStrCity(){
		return strCity;
	}

	public void setStrPoster(String strPoster){
		this.strPoster = strPoster;
	}

	public String getStrPoster(){
		return strPoster;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
 	public String toString(){
		return 
			"Match{" +
			"intHomeShots = '" + intHomeShots + '\'' + 
			",strSport = '" + strSport + '\'' + 
			",strHomeLineupDefense = '" + strHomeLineupDefense + '\'' + 
			",datetimeEventUTC = '" + datetimeEventUTC + '\'' + 
			",strAwayLineupSubstitutes = '" + strAwayLineupSubstitutes + '\'' + 
			",strTweet1 = '" + strTweet1 + '\'' + 
			",strTweet2 = '" + strTweet2 + '\'' + 
			",strTweet3 = '" + strTweet3 + '\'' + 
			",idLeague = '" + idLeague + '\'' + 
			",idSoccerXML = '" + idSoccerXML + '\'' + 
			",strHomeLineupForward = '" + strHomeLineupForward + '\'' + 
			",strTVStation = '" + strTVStation + '\'' + 
			",strHomeGoalDetails = '" + strHomeGoalDetails + '\'' + 
			",strVideo = '" + strVideo + '\'' + 
			",strAwayLineupGoalkeeper = '" + strAwayLineupGoalkeeper + '\'' + 
			",strAwayLineupMidfield = '" + strAwayLineupMidfield + '\'' + 
			",idEvent = '" + idEvent + '\'' + 
			",intRound = '" + intRound + '\'' + 
			",strHomeYellowCards = '" + strHomeYellowCards + '\'' + 
			",idHomeTeam = '" + idHomeTeam + '\'' + 
			",intHomeScore = '" + intHomeScore + '\'' + 
			",dateEvent = '" + dateEvent + '\'' + 
			",strCountry = '" + strCountry + '\'' + 
			",strAwayTeam = '" + strAwayTeam + '\'' + 
			",strHomeLineupMidfield = '" + strHomeLineupMidfield + '\'' + 
			",strDate = '" + strDate + '\'' + 
			",strHomeFormation = '" + strHomeFormation + '\'' + 
			",strMap = '" + strMap + '\'' + 
			",idAwayTeam = '" + idAwayTeam + '\'' + 
			",strAwayRedCards = '" + strAwayRedCards + '\'' + 
			",strBanner = '" + strBanner + '\'' + 
			",strFanart = '" + strFanart + '\'' + 
			",strDescriptionEN = '" + strDescriptionEN + '\'' + 
			",strResult = '" + strResult + '\'' + 
			",strCircuit = '" + strCircuit + '\'' + 
			",intAwayShots = '" + intAwayShots + '\'' + 
			",strFilename = '" + strFilename + '\'' + 
			",strTime = '" + strTime + '\'' + 
			",strAwayGoalDetails = '" + strAwayGoalDetails + '\'' + 
			",strAwayLineupForward = '" + strAwayLineupForward + '\'' + 
			",strLocked = '" + strLocked + '\'' + 
			",strSeason = '" + strSeason + '\'' + 
			",intSpectators = '" + intSpectators + '\'' + 
			",strHomeRedCards = '" + strHomeRedCards + '\'' + 
			",strHomeLineupGoalkeeper = '" + strHomeLineupGoalkeeper + '\'' + 
			",strHomeLineupSubstitutes = '" + strHomeLineupSubstitutes + '\'' + 
			",strAwayFormation = '" + strAwayFormation + '\'' + 
			",strEvent = '" + strEvent + '\'' + 
			",strAwayYellowCards = '" + strAwayYellowCards + '\'' + 
			",strAwayLineupDefense = '" + strAwayLineupDefense + '\'' + 
			",strHomeTeam = '" + strHomeTeam + '\'' + 
			",strThumb = '" + strThumb + '\'' + 
			",strLeague = '" + strLeague + '\'' + 
			",intAwayScore = '" + intAwayScore + '\'' + 
			",strCity = '" + strCity + '\'' + 
			",strPoster = '" + strPoster + '\'' + 
			"}";
		}
}