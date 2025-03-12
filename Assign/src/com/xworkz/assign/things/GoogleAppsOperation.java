package com.xworkz.assign.things;

public class GoogleAppsOperation {

	GoogleAppsDetails [] googleAppsDetails = new GoogleAppsDetails[5];
	int index = 0;
	
	public String saveGoogleApps(GoogleAppsDetails appsDetails) {
		if(googleAppsDetails != null) {
			System.out.println("Array is not null");
		}
		if(index < googleAppsDetails.length) {
			googleAppsDetails[index] = appsDetails;
			index++;
			System.out.println("GoogleApps Details are: "+appsDetails);
		}else {
			System.out.println("Array is full");
			return "Array is full";
		}
		return "Not saved";
	}
	
	
	public void readGoogleApps() {
		for(int i = 0; i < googleAppsDetails.length; i++) {
			System.out.println("GoogleApps Details at "+i+" position are: "+googleAppsDetails[i]);
		}
	}
}