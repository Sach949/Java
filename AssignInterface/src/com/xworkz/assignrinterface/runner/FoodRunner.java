package com.xworkz.assignrinterface.runner;

import com.xworkz.assignrinterface.interfaces.Food;
import com.xworkz.assignrinterface.interfaces.FoodStreet;
import com.xworkz.assignrinterface.interfaces.Hotel;
import com.xworkz.assignrinterface.interfaces.Restaurant;

public class FoodRunner {

	public static void main(String[] args) {
		System.out.println("Main Method");
		
		
		//Hotel Class
		System.out.println("\n------Hotel Class------\n");
		Hotel hotel = new Hotel();
		hotel.cookFood();
		hotel.spicesUsed();
		hotel.servingFood("Aman is sevring the food");
		hotel.eatingFood("People started to eat");
		
		//Restaurants class
		System.out.println("\n------Restaurant Class------\n");
		Restaurant res = new Restaurant();
		res.cookFood();
		res.spicesUsed();
		res.servingFood("Restaurant are serving the food");
		res.eatingFood("People are eating in the restaurants");
		
		//Food Street class
		System.out.println("\n------FoodStreet Class------\n");
		FoodStreet street = new FoodStreet();
		street.cookFood();
		street.spicesUsed();
		street.servingFood("Foods are served in food Street");
		street.eatingFood("More people are eating at food street");
		
		//Accessing the static method of Food interface
		System.out.println("\n------Food interface----\n");
		Food.cleaningTables();
		Food.washingPlates("Washing the tables");
		Food.finishedEating();
	}
}
