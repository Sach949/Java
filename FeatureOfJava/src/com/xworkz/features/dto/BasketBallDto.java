package com.xworkz.features.dto;

public class BasketBallDto implements Comparable<BasketBallDto> {

	private String name;
	private String teamName;
	private int totalPoints;
	
	
	@Override
	public String toString() {
		return "BasketBallDto [name=" + name + ", teamName=" + teamName + ", totalPoints=" + totalPoints + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((teamName == null) ? 0 : teamName.hashCode());
		result = prime * result + totalPoints;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BasketBallDto other = (BasketBallDto) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (teamName == null) {
			if (other.teamName != null)
				return false;
		} else if (!teamName.equals(other.teamName))
			return false;
		if (totalPoints != other.totalPoints)
			return false;
		return true;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTeamName() {
		return teamName;
	}


	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	public int getTotalPoints() {
		return totalPoints;
	}


	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}


	public BasketBallDto(String name, String teamName, int totalPoints) {
		super();
		this.name = name;
		this.teamName = teamName;
		this.totalPoints = totalPoints;
	}


	@Override
	public int compareTo(BasketBallDto o) {
		if(this.getTotalPoints() < o.getTotalPoints()) {
			return 1;
		}
		if(this.getTotalPoints() > o.getTotalPoints()) {
			return -1;
		}
		return 0;
	}
	
	
}
