package com.xworkz.assign.runner;

import com.xworkz.assign.things.LinkedInAccount;
import com.xworkz.assign.things.LinkedlnOperation;
import com.xworkz.assign.things.SnacksDetails;

public class LinkedlnRunner {

	public static void main(String[] args) {
		System.out.println("Main method");
		
		LinkedInAccount account1 = new LinkedInAccount();
		account1.setProfileId(10);
        account1.setName("Ravi Kumar");
        account1.setCurrentJobTitle("Software Engineer");
        account1.setLocation("Bangalore");
        account1.setConnections(120);
        
        LinkedInAccount account2 = new LinkedInAccount();
        account2.setProfileId(20);
        account2.setName("Meera Sharma");
        account2.setCurrentJobTitle("Data Analyst");
        account2.setLocation("Delhi");
        account2.setConnections(200);
        
        LinkedInAccount account3 = new LinkedInAccount();
        account3.setProfileId(30);
        account3.setName("Aman Gupta");
        account3.setCurrentJobTitle("Product Manager");
        account3.setLocation("Mumbai");
        account3.setConnections(300);
        
        LinkedInAccount account4 = new LinkedInAccount();
        account4.setProfileId(40);
        account4.setName("Priya Singh");
        account4.setCurrentJobTitle("UX Designer");
        account4.setLocation("Pune");
        account4.setConnections(150);
        
        
        LinkedlnOperation ops = new LinkedlnOperation();
        ops.saveLinkedlnOperation(account1);
        ops.saveLinkedlnOperation(account2);
        ops.saveLinkedlnOperation(account3);
        ops.saveLinkedlnOperation(account4);
        
        System.out.println("]\n----Read---\n");
		ops.readLinkedlnOperation();
		
		System.out.println("\n---Delete----\n");
		ops.deleteLinkedProfile(20);
		
		System.out.println("\n---Read----\n");
		ops.readLinkedlnOperation();
		
		System.out.println("\n---Update----\n");
		LinkedInAccount account5 = new LinkedInAccount();
        account5.setProfileId(30);
        account5.setName("Arjun Das");
        account5.setCurrentJobTitle("HR Specialist");
        account5.setLocation("Hyderabad");
        account5.setConnections(180);
		
		ops.updateLinkedProfile(account5);
		
		System.out.println("\n---Read----\n");
		ops.readLinkedlnOperation();
		
		System.out.println("\n---search----\n");
		ops.searchLinkedProfile(10);
		
	}
}
