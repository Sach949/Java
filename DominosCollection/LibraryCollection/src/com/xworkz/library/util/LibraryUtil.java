package com.xworkz.library.util;

public class LibraryUtil {

	public LibraryUtil() {
		
	}
	
	public static boolean validate(String values) {
		if(values != null && values.length() >=3) {
			return true;
		}
		return false;
	}
}
