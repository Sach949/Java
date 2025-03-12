package com.xworkz.vehicleproject.things;

public class Bus extends Vehicle {

	private String busName;

	public Bus(int regId, String name, String companyName,String busName) {
		super(regId, busName, companyName);
		this.busName = busName;
	}
	
	
	

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}
	
	public void display() {
		System.out.println(busName);
	}
	
}
