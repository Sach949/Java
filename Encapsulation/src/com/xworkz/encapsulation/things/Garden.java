package com.xworkz.encapsulation.things;

public class Garden {

	private String gardener;
	private String plantType;
	private int noOfPlants;
	
	public Garden() {
		System.out.println("Default const");
	}
	
	
	public void setGardener(String gardener) {
		this.gardener = gardener;
	}
	
	public String getGardener() {
		return gardener;
	}
	
	
	public void setPlantType(String plantType) {
		this.plantType = plantType;
	}
	
	public String getPlantType() {
		return plantType;
	}
	
	public void setNoOfPlants(int noOfPlants) {
		this.noOfPlants = noOfPlants;
	}
	
	public int getNoOfPlants() {
		return noOfPlants;
	}
	
}
