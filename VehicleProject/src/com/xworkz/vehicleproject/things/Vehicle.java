package com.xworkz.vehicleproject.things;

public class Vehicle {

	private int regId;
	private String name;
	private String companyName;
	
	
	
	public Vehicle(int regId, String name, String companyName) {
		
		this.regId = regId;
		this.name = name;
		this.companyName = companyName;
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

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
	
}
