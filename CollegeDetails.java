package com.xworkz.assign.things;

public class CollegeDetails {

	private String collegeName;
	private String location;
	private int totalStudents;
	private int noOfClasses;
	private boolean isEngineering;
	
	public CollegeDetails() {
		System.out.println("Default Constructor");
	}

	public CollegeDetails(String collegeName, String location, int totalStudents, int noOfClasses,
			boolean isEngineering) {
		super();
		this.collegeName = collegeName;
		this.location = location;
		this.totalStudents = totalStudents;
		this.noOfClasses = noOfClasses;
		this.isEngineering = isEngineering;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getTotalStudents() {
		return totalStudents;
	}

	public void setTotalStudents(int totalStudents) {
		this.totalStudents = totalStudents;
	}

	public int getNoOfClasses() {
		return noOfClasses;
	}

	public void setNoOfClasses(int noOfClasses) {
		this.noOfClasses = noOfClasses;
	}

	public boolean isEngineering() {
		return isEngineering;
	}

	public void setEngineering(boolean isEngineering) {
		this.isEngineering = isEngineering;
	}

	@Override
	public String toString() {
		return "CollegeDetails [collegeName=" + collegeName + ", location=" + location + ", totalStudents="
				+ totalStudents + ", noOfClasses=" + noOfClasses + ", isEngineering=" + isEngineering + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((collegeName == null) ? 0 : collegeName.hashCode());
		result = prime * result + (isEngineering ? 1231 : 1237);
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + noOfClasses;
		result = prime * result + totalStudents;
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
		CollegeDetails other = (CollegeDetails) obj;
		if (collegeName == null) {
			if (other.collegeName != null)
				return false;
		} else if (!collegeName.equals(other.collegeName))
			return false;
		if (isEngineering != other.isEngineering)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (noOfClasses != other.noOfClasses)
			return false;
		if (totalStudents != other.totalStudents)
			return false;
		return true;
	}
	
	
}
