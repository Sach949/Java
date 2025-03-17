package com.xworkz.dominos.util;

public class DominosUtil {

	public DominosUtil() {
		
	}
	
	public static boolean validate(String values) {
		if(values != null && values.length() >=3) {
			return true;
		}else {
			System.out.println("Not validated");
		}
		
		return false;
		
	}
}
