package com.xworkz.assign.things;

import java.util.Objects;

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
		return Objects.hash(collegeName, isEngineering, location, noOfClasses, totalStudents);
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
		return Objects.equals(collegeName, other.collegeName) && isEngineering == other.isEngineering
				&& Objects.equals(location, other.location) && noOfClasses == other.noOfClasses
				&& totalStudents == other.totalStudents;
	}

	
}
