package com.xwork.government.example;

public class Schemes {
	String schemeName;
	int allotedFund;
	String sector;
	
	
	public Schemes(String schemeName, int allotedFund, String sector) {
		this.schemeName = schemeName;
		this.allotedFund = allotedFund;
		this.sector = sector;
	}
	
	public void schemeDetails() {
		System.out.println("\n-----schemes details------\n");
		System.out.println("Name of the scheme: "+schemeName);
		System.out.println("Alloted Fund: "+allotedFund);
		System.out.println("For the field of: "+sector);
	}
}
