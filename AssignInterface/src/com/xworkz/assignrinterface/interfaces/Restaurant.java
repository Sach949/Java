package com.xworkz.assignrinterface.interfaces;

public class Restaurant implements Food {

	@Override
	public void cookFood() {
		System.out.println("Cooking food in restaurants");
		
	}

	@Override
	public String spicesUsed() {
		System.out.println("Restauranta are using spices");
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
