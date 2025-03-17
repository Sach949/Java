package com.xworkz.encapsulation.things;

public class Pen {

	private String penName;
	private int penPrice;
	private String typeOfPen;
	private int numberOfPen;
	private String penColor;
	
	public Pen() {
		System.out.println("No argument constructor");
	}
	//getter and setter method.
	//setter method is used to set the values to the properties.
	//getter method is used to get the method/value from the properties.
	
	public void setPenName(String penName) {
		this.penName = penName;
	}
	
	public String getPenName() {
		return penName;
	}

	private String getPenColor() {
		return penColor;
	}

	private void setPenColor(String penColor) {
		this.penColor = penColor;
	}

	private int getNumberOfPen() {
		return numberOfPen;
	}

	private void setNumberOfPen(int numberOfPen) {
		this.numberOfPen = numberOfPen;
	}

	private String getTypeOfPen() {
		return typeOfPen;
	}

	private void setTypeOfPen(String typeOfPen) {
		this.typeOfPen = typeOfPen;
	}

	private int getPenPrice() {
		return penPrice;
	}

	private void setPenPrice(int penPrice) {
		this.penPrice = penPrice;
	}
}
