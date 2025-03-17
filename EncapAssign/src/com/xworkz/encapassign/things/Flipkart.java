package com.xworkz.encapassign.things;

public class Flipkart {

	protected String owner;
	protected String hq;
	protected String purpose;
	protected int totalSale;
	protected String typeOfCompany;
	
	public Flipkart(String owner, String hq, String purpose, int totalSale, String typeOfCompany) {
		this.owner = owner;
		this.hq = hq;
		this.purpose = purpose;
		this.totalSale = totalSale;
		this.typeOfCompany = typeOfCompany;
	}
	
	@Override
	public String toString() {
		return "Owner of Flipkart: "+this.owner+"\nHQ of this: "+this.hq+"\nPurpose: "+this.purpose
				+"\nTotal Sale in crores: "+this.totalSale+"\nType of company: "+this.typeOfCompany;
	}
	
}
