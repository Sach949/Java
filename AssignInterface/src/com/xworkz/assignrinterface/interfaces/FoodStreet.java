package com.xworkz.assignrinterface.interfaces;

public class FoodStreet implements Food{

	@Override
	public void cookFood() {
		System.out.println("Cooking food by street vendor");
		
	}

	@Override
	public String spicesUsed() {
		System.out.println("Spices used in food of Food Street");
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
