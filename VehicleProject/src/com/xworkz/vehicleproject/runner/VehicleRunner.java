package com.xworkz.vehicleproject.runner;

import com.xworkz.vehicleproject.things.Bus;

public class VehicleRunner {

	public static void main(String[] args) {
		System.out.println("Main method");
		
		Bus bus = new Bus("Bus Details");
		bus.display();
		
	}
}
