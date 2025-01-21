package com.xworkz.person.runner;

import com.xworkz.person.things.PersonDetails;
import com.xworkz.person.things.PersonLogs;

public class PersonRunner {

	
	public static void main(String[] args) {
		
		System.out.println("Main method started");
		
		PersonDetails details = new PersonDetails();
		details.setId(1001);
		details.setName("Ramesh");
		details.setAge(30);
		details.setFahterName("Suresh");
		details.setAddress("C V Raman nagar, Bengaluru");
		details.setMobileNo(1023654782);
		
		PersonDetails details2 = new PersonDetails();
		details2.setId(1002);
		details2.setName("Ajay");
		details2.setAge(25);
		details2.setFahterName("Vijay");
		details2.setAddress("Mumbai");
		details2.setMobileNo(13236547);
		
		PersonDetails details3 = new PersonDetails();
		details3.setId(1003);
		details3.setName("Anil");
		details3.setAge(20);
		details3.setFahterName("Sunil");
		details3.setAddress("Delhi");
		details3.setMobileNo(203654782);
		
		PersonDetails details4 = new PersonDetails();
		details4.setId(1004);
		details4.setName("Nidhi");
		details4.setAge(40);
		details4.setFahterName("Anjali");
		details4.setAddress("Pune");
		details4.setMobileNo(112354782);
		
		PersonDetails details5 = new PersonDetails();
		details5.setId(1005);
		details5.setName("Rima");
		details5.setAge(50);
		details5.setFahterName("Sima");
		details5.setAddress("Chennai");
		details5.setMobileNo(203654782);
		

		
		
		PersonLogs log = new PersonLogs();
		
		log.savePersonDetails(details);
		log.savePersonDetails(details2);
		log.savePersonDetails(details3);
		log.savePersonDetails(details4);
		log.savePersonDetails(details5);

		
		System.out.println("\n------Read Operation------\n");
		log.readPersonDetails();
		
		System.out.println("\n------Delete Operation------\n");
		log.deletePersonLogsById(1002);
		log.deletePersonLogsById(1004);
		
		System.out.println("\n------Read Operation------\n");
		log.readPersonDetails();
		
		
		PersonDetails updateDetails6 = new PersonDetails();
		updateDetails6.setId(1001);
		updateDetails6.setName("Sachin");
		updateDetails6.setAge(30);
		updateDetails6.setFahterName("Manish");
		updateDetails6.setAddress("Jaipur");
		updateDetails6.setMobileNo(423654782);
		
		System.out.println("\n------Update Operation------\n");
		log.updatePersonLogsById(updateDetails6);
		log.updatePersonLogsById(updateDetails6);
		
		System.out.println("\n------Read Operation------\n");
		log.readPersonDetails();
		
		System.out.println("\n------Search Operation------\n");
		log.searchPersonLogsById(1001);
		
		System.out.println("\n------Read Operation------\n");
		log.readPersonDetails();
	}
}
