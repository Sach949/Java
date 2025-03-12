package com.xworkz.assign.things;

import java.util.Objects;

public class SnacksDetails {

	private int snacksId;
	private String snacksName;
	private String type;
	private double price;
	private int quantity;
	private boolean isHealthy;
	
	public SnacksDetails() {
		System.out.println("Default Constructor");
	}

	public SnacksDetails(int snacksId, String snacksName, String type, double price, int quantity, boolean isHealthy) {
		super();
		this.snacksId = snacksId;
		this.snacksName = snacksName;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
		this.isHealthy = isHealthy;
	}

	public int getSnacksId() {
		return snacksId;
	}

	public void setSnacksId(int snacksId) {
		this.snacksId = snacksId;
	}

	public String getSnacksName() {
		return snacksName;
	}

	public void setSnacksName(String snacksName) {
		this.snacksName = snacksName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isHealthy() {
		return isHealthy;
	}

	public void setHealthy(boolean isHealthy) {
		this.isHealthy = isHealthy;
	}

	@Override
	public String toString() {
		return "SnacksDetails [snacksId=" + snacksId + ", snacksName=" + snacksName + ", type=" + type + ", price="
				+ price + ", quantity=" + quantity + ", isHealthy=" + isHealthy + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(isHealthy, price, quantity, snacksId, snacksName, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SnacksDetails other = (SnacksDetails) obj;
		return isHealthy == other.isHealthy && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& quantity == other.quantity && snacksId == other.snacksId
				&& Objects.equals(snacksName, other.snacksName) && Objects.equals(type, other.type);
	}

    
	
}
