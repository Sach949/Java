package com.xworkz.assign.things;

public class LinkedlnOperation {

	LinkedInAccount[] details = new LinkedInAccount[5];
	int index = 0;
	
	public String saveLinkedlnOperation(LinkedInAccount linkedInAccount) {
		
		if(details != null) {
			System.out.println("Array is not null");
			if(index < details.length) {
				details[index] = linkedInAccount;
				index++;
				System.out.println("Saved details are: "+linkedInAccount);
				return "saved successfully";
			}else {
				System.out.println("Array is full");
			}
		}else {
			System.out.println("Array is null");
		}
		
		return"Not Saved";
	}
	
	
	public void deleteLinkedProfile(int id) {
		if (id>0) {
			for(int i = 0; i < details.length; i++) {
				if(details[i] !=null && details[i].getProfileId()==id) {
					System.out.println("Id match is found");
					details[i] = null;
					System.out.println("Deleted successfully");
				}else {
					System.out.println("Id match is not found");
				}
			}
		}else {
			System.out.println("Is is 0 or invalid");
		}
	}
	
	public void updateLinkedProfile(LinkedInAccount account) {
		if(account !=null) {
			for(int i = 0; i < details.length; i++) {
				if(details[i] !=null && details[i].getProfileId()==account.getProfileId()) {
					System.out.println("Id match is found");
					details[i] = account;
					System.out.println("Updated successfully");
					System.out.println("Updated Details are: "+account);
				}else {
					System.out.println("Id match is not found");
				}
			}
		}else {
			System.out.println("Is is 0 or invalid");
		}
	}
	
	public void searchLinkedProfile(int id) {
		if (id>0) {
			for(int i = 0; i < details.length; i++) {
				if(details[i] !=null && details[i].getProfileId() == id) {
					System.out.println("Id match is found");
					System.out.println("Matche ID Details are: "+details[i]);
				}else {
					System.out.println("Id match is not found");
				}
			}
		}else {
			System.out.println("Is is 0 or invalid");
		}
	}
	
	public void readLinkedlnOperation() {
		for(int i = 0; i < details.length; i++) {
			System.out.println("Accounts details at "+i+" position are: "+details[i]);
		}
	}
}


