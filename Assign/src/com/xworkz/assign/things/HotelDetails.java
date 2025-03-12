package com.xworkz.assign.things;

import java.util.Objects;

public class HotelDetails {

	private int regId;
	private String name;
	private String location;
	private int noOfRooms;
	private double ratings;
	private boolean hasSwimmingPool;
	
	
	public HotelDetails() {
		System.out.println("Default Constructor");
	}


	public HotelDetails(int regId, String name, String location, int noOfRooms, double ratings,
			boolean hasSwimmingPool) {
		super();
		this.regId = regId;
		this.name = name;
		this.location = location;
		this.noOfRooms = noOfRooms;
		this.ratings = ratings;
		this.hasSwimmingPool = hasSwimmingPool;
	}


	public int getRegId() {
		return regId;
	}


	public void setRegId(int regId) {
		this.regId = regId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public int getNoOfRooms() {
		return noOfRooms;
	}


	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}


	public double getRatings() {
		return ratings;
	}


	public void setRatings(double ratings) {
		this.ratings = ratings;
	}


	public boolean isHasSwimmingPool() {
		return hasSwimmingPool;
	}


	public void setHasSwimmingPool(boolean hasSwimmingPool) {
		this.hasSwimmingPool = hasSwimmingPool;
	}


	@Override
	public String toString() {
		return "HotelDetails [regId=" + regId + ", name=" + name + ", location=" + location + ", noOfRooms=" + noOfRooms
				+ ", ratings=" + ratings + ", hasSwimmingPool=" + hasSwimmingPool + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(hasSwimmingPool, location, name, noOfRooms, ratings, regId);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HotelDetails other = (HotelDetails) obj;
		return hasSwimmingPool == other.hasSwimmingPool && Objects.equals(location, other.location)
				&& Objects.equals(name, other.name) && noOfRooms == other.noOfRooms
				&& Double.doubleToLongBits(ratings) == Double.doubleToLongBits(other.ratings) && regId == other.regId;
	}

	

}
