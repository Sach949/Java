package com.xworkz.assignrinterface.interfaces;

public class Hotel implements Food{

	@Override
	public void cookFood() {
		System.out.println("Vishal is cooking the food");
		
	}

	@Override
	public String spicesUsed() {
		System.out.println("Using spices");
		return null;
	}

	@Override
	public void servingFood(String serving) {
		System.out.println(serving);
		
	}

	@Override
	public String eatingFood(String eating) {
		System.out.println(eating);
		return null;
	}

}
