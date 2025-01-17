package com.xworkz.assign.things;

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
		final int prime = 31;
		int result = 1;
		result = prime * result + ((houseOwner == null) ? 0 : houseOwner.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((ownershipType == null) ? 0 : ownershipType.hashCode());
		result = prime * result + totalMembersofhouse;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		HouseDetails other = (HouseDetails) obj;
		if (houseOwner == null) {
			if (other.houseOwner != null)
				return false;
		} else if (!houseOwner.equals(other.houseOwner))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (ownershipType == null) {
			if (other.ownershipType != null)
				return false;
		} else if (!ownershipType.equals(other.ownershipType))
			return false;
		if (totalMembersofhouse != other.totalMembersofhouse)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	
}
