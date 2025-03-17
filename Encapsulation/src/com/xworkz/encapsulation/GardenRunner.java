package com.xworkz.encapsulation;

import com.xworkz.encapsulation.things.Garden;

public class GardenRunner {

	public static void main(String[] args) {
		 System.out.println("main method started");
		 
		 Garden garden = new Garden();
		 garden.setGardener("Ramesh");
		 System.out.println(garden.getGardener());
		 
		 garden.setNoOfPlants(50);
		 System.out.println(garden.getNoOfPlants());
		 
		 garden.setPlantType("Herbal");
		 System.out.println(garden.getPlantType());
		 
	}
}
