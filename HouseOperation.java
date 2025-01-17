package com.xworkz.assign.things;

public class HouseOperation {

	HouseDetails[] details = new HouseDetails[5];
	int index = 0;
	
	public String saveHouseOperation(HouseDetails houseDetails) {
		
		if(details != null) {
			System.out.println("Array is not full");
		}
		if(index < details.length) {
			details[index] = houseDetails;
			index++;
			System.out.println("House details are: "+houseDetails);
		}else {
			System.out.println("\nCannot saved as Array is full !!");
			return "Array is full";
		}
		
		return "Not saved";
	}
	
	
	public void readHouseOperation() {
		for(int i = 0; i < details.length; i++) {
			System.out.println("house Details at "+i+" position: "+details[i]);
		}
	}
}
