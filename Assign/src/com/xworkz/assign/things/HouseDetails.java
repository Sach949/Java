package com.xworkz.assign.things;

import java.util.Objects;

public class HouseDetails {

	private String houseOwner;
	private String location;
	private int totalMembersofhouse;
	private String type;
	private String ownershipType;
	
	public HouseDetails() {
		System.out.println("Default Constructor");
	}

	public HouseDetails(String houseOwner, String location, int totalMembersofhouse, String type,
			String ownershipType) {
		super();
		this.houseOwner = houseOwner;
		this.location = location;
		this.totalMembersofhouse = totalMembersofhouse;
		this.type = type;
		this.ownershipType = ownershipType;
	}

	public String getHouseOwner() {
		return houseOwner;
	}

	public void setHouseOwner(String houseOwner) {
		this.houseOwner = houseOwner;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getTotalMembersofhouse() {
		return totalMembersofhouse;
	}

	public void setTotalMembersofhouse(int totalMembersofhouse) {
		this.totalMembersofhouse = totalMembersofhouse;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOwnershipType() {
		return ownershipType;
	}

	public void setOwnershipType(String ownershipType) {
		this.ownershipType = ownershipType;
	}

	@Override
	public String toString() {
		return "HouseDetails [houseOwner=" + houseOwner + ", location=" + location + ", totalMembersofhouse="
				+ totalMembersofhouse + ", type=" + type + ", ownershipType=" + ownershipType + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(houseOwner, location, ownershipType, totalMembersofhouse, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HouseDetails other = (HouseDetails) obj;
		return Objects.equals(houseOwner, other.houseOwner) && Objects.equals(location, other.location)
				&& Objects.equals(ownershipType, other.ownershipType)
				&& totalMembersofhouse == other.totalMembersofhouse && Objects.equals(type, other.type);
	}

	
	
}
