package com.xworkz.assign.things;

public class CollegeOperation {

	CollegeDetails[] details = new CollegeDetails[5];
	int index = 0 ;
	
	public String saveCollegeOperation(CollegeDetails collegeDetails) {
		if(details != null) {
			System.out.println("Array is not null");
		}
		if(index < details.length) {
			details[index] = collegeDetails;
			index++;
			System.out.println("College details are: "+collegeDetails);
		}else {
			System.out.println("\nArray is full. Cannot save more");
			return "Array is full";
		}
		return "Not saved";
	}
	
	public void readCollegeOperation() {
		for(int i = 0; i < details.length; i++) {
			System.out.println("College Details at "+i+" position: "+details[i]);
		}
	}
}