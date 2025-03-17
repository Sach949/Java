package com.xworkz.encapassign.things;

public class Optical {

	protected String typeOf;
	protected String materialUsed;
	int focalLength;
	int priceOfLens;
	String usedFor;
	
	public Optical(String typeOf, String materialUsed, int focalLength, int priceOfLens, String usedFor) {
		this.typeOf = typeOf;
		this.materialUsed = materialUsed;
		this.focalLength = focalLength;
		this.priceOfLens = priceOfLens;
		this.usedFor = usedFor;
	}
	
	@Override
	public String toString() {
		return "Type of lens: "+this.typeOf+"\nMaterial used: "+this.materialUsed+"\nFocal Length of lens: "+this.focalLength
				+"\nPrice of Lens: "+this.priceOfLens+"\nUsed for: "+this.usedFor;
	}
}
