package com.xworkz.assignrinterface.interfaces;

public interface Food {

	public abstract void cookFood();
	
	public abstract String spicesUsed();
	
	public abstract void servingFood(String serving);
	
	public abstract String eatingFood(String eating);
	
	public static void cleaningTables() {
		System.out.println("Cleaning tables");
	}
	
	public static String washingPlates(String washing) {
		System.out.println(washing);
		return null;
	}
	
	public static void finishedEating() {
		System.out.println("Finished eating");
	}
	
	
}
