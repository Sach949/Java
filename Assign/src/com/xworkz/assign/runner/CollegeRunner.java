package com.xworkz.assign.runner;

import com.xworkz.assign.things.CollegeDetails;
import com.xworkz.assign.things.CollegeOperation;

public class CollegeRunner {

	public static void main(String[] args) {
		System.out.println("Main Method");
		
		CollegeDetails college = new CollegeDetails();
		college.setCollegeName("Rajkiya College");
		college.setLocation("Delhi");
		college.setTotalStudents(500);
		college.setNoOfClasses(12);
		college.setEngineering(false);
		
		CollegeDetails college2 = new CollegeDetails();
		college2.setCollegeName("1st Grade PU college");
		college2.setLocation("Bengaluru");
		college2.setTotalStudents(300);
		college2.setNoOfClasses(12);
		college2.setEngineering(false);
		
		CollegeDetails college3 = new CollegeDetails();
		college3.setCollegeName("Mahila Mahavidyalaya");
		college3.setLocation("Varanasi");
		college3.setTotalStudents(250);
		college3.setNoOfClasses(20);
		college3.setEngineering(true);
		
		CollegeDetails college4 = new CollegeDetails();
		college4.setCollegeName("Rajiv Gandhi Graduation College");
		college4.setLocation("Mirzapur");
		college4.setTotalStudents(400);
		college4.setNoOfClasses(15);
		college4.setEngineering(true);
		
		CollegeDetails college5 = new CollegeDetails();
		college5.setCollegeName("DAV colleg");
		college5.setLocation("Mumbai");
		college5.setTotalStudents(350);
		college5.setNoOfClasses(12);
		college5.setEngineering(false);
		
		CollegeDetails college6 = new CollegeDetails();
		college6.setCollegeName("Modern College");
		college6.setLocation("Pune");
		college6.setTotalStudents(100);
		college6.setNoOfClasses(10);
		college6.setEngineering(true);
		
		CollegeOperation ops = new CollegeOperation();
		ops.saveCollegeOperation(college);
		ops.saveCollegeOperation(college2);
		ops.saveCollegeOperation(college3);
		ops.saveCollegeOperation(college4);
		ops.saveCollegeOperation(college5);
		ops.saveCollegeOperation(college6);
		
		System.out.println("\n----Read------\n");
		ops.readCollegeOperation();
	}
}