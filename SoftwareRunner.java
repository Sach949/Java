package com.xworkz.assign.runner;

import com.xworkz.assign.things.SoftwareDetails;
import com.xworkz.assign.things.SoftwareOperation;

public class SoftwareRunner {

	public static void main(String[] args) {
		System.out.println("Main methoid started");
		
		SoftwareDetails softDetails = new SoftwareDetails();
		softDetails.setSoftwareName("Windows");
		softDetails.setVersionName("11");
		softDetails.setSoftwareType("OS");
		softDetails.setUsedFor("PCs and Laptop");;
		softDetails.setDeveloper("Microsoft");
		
		SoftwareDetails softDetails2 = new SoftwareDetails();
		softDetails2.setSoftwareName("Call of Duty");
		softDetails2.setVersionName("Season 9");
		softDetails2.setSoftwareType("Game Application");
		softDetails2.setUsedFor("Play games");
		softDetails2.setDeveloper("GameLoft");
		
		SoftwareDetails softDetails3 = new SoftwareDetails();
		softDetails3.setSoftwareName("Asphalt");
		softDetails3.setVersionName("Season 8");
		softDetails3.setSoftwareType("Game Application");
		softDetails3.setUsedFor("Play games");
		softDetails3.setDeveloper("Gameloft");
		
		SoftwareDetails softDetails4 = new SoftwareDetails();
		softDetails4.setSoftwareName("Linux Sparrow");
		softDetails4.setVersionName("1.18.8");
		softDetails4.setSoftwareType("Open OS");
		softDetails4.setUsedFor("PCs and Laptop");
		softDetails4.setDeveloper("Linux");
		
		SoftwareDetails softDetails5 = new SoftwareDetails();
		softDetails5.setSoftwareName("Android");
		softDetails5.setVersionName("14");
		softDetails5.setSoftwareType("Mobile OS");
		softDetails5.setUsedFor("Mobile and Tab");
		softDetails5.setDeveloper("Google");
		
		SoftwareDetails softDetails6 = new SoftwareDetails();
		softDetails6.setSoftwareName("iOS");
		softDetails6.setVersionName("18");
		softDetails6.setSoftwareType("Mobile OS");
		softDetails6.setUsedFor("Mobile and Tab");
		softDetails6.setDeveloper("Apple");
		
		
		SoftwareOperation ops = new SoftwareOperation();
		ops.saveSoftwareOperation(softDetails);
		ops.saveSoftwareOperation(softDetails2);
		ops.saveSoftwareOperation(softDetails3);
		ops.saveSoftwareOperation(softDetails4);
		ops.saveSoftwareOperation(softDetails5);
		ops.saveSoftwareOperation(softDetails6);
		
		System.out.println("\n-----Read------\n");
		
		ops.readSoftwareOperation();
		
		
	}
}