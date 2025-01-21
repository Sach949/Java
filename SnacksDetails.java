package com.gtre.assign.things;

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
		final int prime = 31;
		int result = 1;
		result = prime * result + (isHealthy ? 1231 : 1237);
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + quantity;
		result = prime * result + snacksId;
		result = prime * result + ((snacksName == null) ? 0 : snacksName.hashCode());
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
		SnacksDetails other = (SnacksDetails) obj;
		if (isHealthy != other.isHealthy)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (quantity != other.quantity)
			return false;
		if (snacksId != other.snacksId)
			return false;
		if (snacksName == null) {
			if (other.snacksName != null)
				return false;
		} else if (!snacksName.equals(other.snacksName))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	
}
