package com.xworkz.vehicle.util;

public class VehicleRentalUtil {

	private VehicleRentalUtil() {
		
	}
	
	public static boolean validate(String values) {
		if(values != null && values.length() >=3) {
			return true;
		}
		return false;
	}
}