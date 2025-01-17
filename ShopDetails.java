package com.xworkz.assign.things;

public class ShopDetails {

	private String shopName;
	private String shopType;
	private String owner;
	private int annualTurnover;
	private int avgCustomersVisitPerMonths;
	private String location;
	
	public ShopDetails() {
		System.out.println("Default Constructor");
	}

	public ShopDetails(String shopName, String shopType, String owner, int annualTurnover,
			int avgCustomersVisitPerMonths, String location) {
		super();
		this.shopName = shopName;
		this.shopType = shopType;
		this.owner = owner;
		this.annualTurnover = annualTurnover;
		this.avgCustomersVisitPerMonths = avgCustomersVisitPerMonths;
		this.location = location;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopType() {
		return shopType;
	}

	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getAnnualTurnover() {
		return annualTurnover;
	}

	public void setAnnualTurnover(int annualTurnover) {
		this.annualTurnover = annualTurnover;
	}

	public int getAvgCustomersVisitPerMonths() {
		return avgCustomersVisitPerMonths;
	}

	public void setAvgCustomersVisitPerMonths(int avgCustomersVisitPerMonths) {
		this.avgCustomersVisitPerMonths = avgCustomersVisitPerMonths;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "ShopDetails [shopName=" + shopName + ", shopType=" + shopType + ", owner=" + owner + ", annualTurnover="
				+ annualTurnover + ", avgCustomersVisitPerMonths=" + avgCustomersVisitPerMonths + ", location="
				+ location + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + annualTurnover;
		result = prime * result + avgCustomersVisitPerMonths;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		result = prime * result + ((shopName == null) ? 0 : shopName.hashCode());
		result = prime * result + ((shopType == null) ? 0 : shopType.hashCode());
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
		ShopDetails other = (ShopDetails) obj;
		if (annualTurnover != other.annualTurnover)
			return false;
		if (avgCustomersVisitPerMonths != other.avgCustomersVisitPerMonths)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		if (shopName == null) {
			if (other.shopName != null)
				return false;
		} else if (!shopName.equals(other.shopName))
			return false;
		if (shopType == null) {
			if (other.shopType != null)
				return false;
		} else if (!shopType.equals(other.shopType))
			return false;
		return true;
	}
	
	
}