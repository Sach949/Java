package com.xworkz.assign.runner;

import com.xworkz.assign.things.HouseDetails;
import com.xworkz.assign.things.HouseOperation;

public class HouseRunner {

	public static void main(String[] args) {
		System.out.println("Main Methos Started");
		
		HouseDetails house = new HouseDetails();
		house.setHouseOwner("Ashutosh");
		house.setLocation("Bengaluru");
		house.setTotalMembersofhouse(5);
		house.setType("Residential");
		house.setOwnershipType("Private");
		
		HouseDetails house2 = new HouseDetails();
		house2.setHouseOwner("Gomtesh");
		house2.setLocation("Pune");
		house2.setTotalMembersofhouse(7);
		house2.setType("Residential");
		house2.setOwnershipType("Private");

		HouseDetails house3 = new HouseDetails();
		house3.setHouseOwner("Nithin");
		house3.setLocation("Chennai");
		house3.setTotalMembersofhouse(50);
		house3.setType("Rental");
		house3.setOwnershipType("Private");
		
		HouseDetails house4 = new HouseDetails();
		house4.setHouseOwner("Anurag");
		house4.setLocation("Mumbai");
		house4.setTotalMembersofhouse(100);
		house4.setType("Industrial");
		house4.setOwnershipType("Private");
		
		HouseDetails house5 = new HouseDetails();
		house5.setHouseOwner("Shivamogga Miniciapl Corps.");
		house5.setLocation("Shivamogga");
		house5.setTotalMembersofhouse(200);
		house5.setType("Residential");
		house5.setOwnershipType("Public");
		
		HouseDetails house6 = new HouseDetails();
		house6.setHouseOwner("Ajay");
		house6.setLocation("Delhi");
		house6.setTotalMembersofhouse(10);
		house6.setType("Residential");
		house6.setOwnershipType("Private");
		
		HouseDetails house7 = new HouseDetails();
		house7.setHouseOwner("Niroshan");
		house7.setLocation("Hyderabad");
		house7.setTotalMembersofhouse(90);
		house7.setType("Rental");
		house7.setOwnershipType("Private");
		
		HouseOperation ops = new HouseOperation();
		ops.saveHouseOperation(house);
		ops.saveHouseOperation(house2);
		ops.saveHouseOperation(house3);
		ops.saveHouseOperation(house4);
		ops.saveHouseOperation(house5);
		ops.saveHouseOperation(house6);
		ops.saveHouseOperation(house7);
		
		System.out.println("]\n----Read---\n");
		ops.readHouseOperation();
		
	}
}