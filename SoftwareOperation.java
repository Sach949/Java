package com.xworkz.assign.things;

public class SoftwareOperation {

	SoftwareDetails[] details = new SoftwareDetails[5];
	int index = 0;
	
	public String saveSoftwareOperation(SoftwareDetails softwareDetails) {
		
		if(details != null) {
			System.out.println("Array is not null. We can save");
		}
		if(index < details.length) {
			details[index] = softwareDetails;
			index++;
			System.out.println("Software Details are: "+softwareDetails);
		}else {
			System.out.println("\n!!Array is full");
			return "Array is full";
		}
		return null;
	}
	
	public void readSoftwareOperation() {
		for(int i = 0; i < details.length; i++) {
			System.out.println("Software Details at "+i+" position are: "+details[i]);
		}
	}
	
}