package com.xworkz.features.dto;

import java.time.LocalTime;
import java.util.Objects;

import com.xworkz.features.constant.Profession;

public class TournamentDto implements Comparable<TournamentDto>{

	private String name;
	private Profession sport;
	private int runs;
	private int matchPlayed;
	private int goals;
	private LocalTime time;
	private String teamName;
	private int durationInMin;
	
	
	public TournamentDto(String name, Profession sport, int runs, int matchPlayed, int goals, LocalTime time,
			String teamName, int durationInMin) {
		super();
		this.name = name;
		this.sport = sport;
		this.runs = runs;
		this.matchPlayed = matchPlayed;
		this.goals = goals;
		this.time = time;
		this.teamName = teamName;
		this.durationInMin = durationInMin;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Profession getSport() {
		return sport;
	}


	public void setSport(Profession sport) {
		this.sport = sport;
	}


	public int getRuns() {
		return runs;
	}


	public void setRuns(int runs) {
		this.runs = runs;
	}


	public int getMatchPlayed() {
		return matchPlayed;
	}


	public void setMatchPlayed(int matchPlayed) {
		this.matchPlayed = matchPlayed;
	}


	public int getGoals() {
		return goals;
	}


	public void setGoals(int goals) {
		this.goals = goals;
	}


	public LocalTime getTime() {
		return time;
	}


	public void setTime(LocalTime time) {
		this.time = time;
	}


	public String getTeamName() {
		return teamName;
	}


	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	public int getDurationInMin() {
		return durationInMin;
	}


	public void setDurationInMin(int durationInMin) {
		this.durationInMin = durationInMin;
	}


	@Override
	public String toString() {
		return "TournamentDto [name=" + name + ", sport=" + sport + ", runs=" + runs + ", matchPlayed=" + matchPlayed
				+ ", goals=" + goals + ", time=" + time + ", teamName=" + teamName + ", durationInMin=" + durationInMin
				+ "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(durationInMin, goals, matchPlayed, name, runs, sport, teamName, time);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TournamentDto other = (TournamentDto) obj;
		return durationInMin == other.durationInMin && goals == other.goals && matchPlayed == other.matchPlayed
				&& Objects.equals(name, other.name) && runs == other.runs && sport == other.sport
				&& Objects.equals(teamName, other.teamName) && Objects.equals(time, other.time);
	}


	@Override
	public int compareTo(TournamentDto o) {
		if(this.getRuns() < o.getRuns()) {
			return -1;
		}
		if(this.getRuns() > o.getRuns()) {
			return 1;
		}
		return 0;
	}
	
	
	

	
	
	
	
}
