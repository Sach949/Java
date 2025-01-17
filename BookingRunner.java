package com.xworkz.assign.runner;

import com.xworkz.assign.things.BookingApplication;
import com.xworkz.assign.things.BookingLogs;

public class BookingRunner {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		BookingApplication book = new BookingApplication();
		book.setAppName("IRCTC");
		book.setTypesOfBooking("Train & Air Ticket");
		book.setDevName("IRCTC Pvt Ltd");
		book.setTotalUsers(50000000);
		book.setAvgBooking(2500000);
		
		BookingApplication book2 = new BookingApplication();
		book2.setAppName("GOIBIBO");
		book2.setTypesOfBooking("Air Ticket & Hotel Booking");
		book2.setDevName("GOIBIBO Pvt Ltd");
		book2.setTotalUsers(400000);
		book2.setAvgBooking(40000);
		
		BookingApplication book3 = new BookingApplication();
		book3.setAppName("Uber");
		book3.setTypesOfBooking("Cab Booking");
		book3.setDevName("Uber Pvt Ltd");
		book3.setTotalUsers(100000);
		book3.setAvgBooking(20000);
		
		BookingApplication book4 = new BookingApplication();
		book4.setAppName("Zomato");
		book4.setTypesOfBooking("Restaurant & Food booking");
		book4.setDevName("Zomato Pvt Ltd");
		book4.setTotalUsers(40000);
		book4.setAvgBooking(4000);
		
		BookingApplication book5 = new BookingApplication();
		book5.setAppName("Swiggy");
		book5.setTypesOfBooking("Restaurant & Food booking");
		book5.setDevName("Swiggy Pvt Ltd");
		book5.setTotalUsers(50000);
		book5.setAvgBooking(5000);
		
		BookingApplication book6 = new BookingApplication();
		book6.setAppName("Amazon");
		book6.setTypesOfBooking("Gas Cylinder Booking and Train & Air Ticket");
		book6.setDevName("AWS");
		book6.setTotalUsers(700000);
		book6.setAvgBooking(25000);
		
		BookingLogs log = new BookingLogs();
		log.saveBookingLogs(book);
		log.saveBookingLogs(book2);
		log.saveBookingLogs(book3);
		log.saveBookingLogs(book4);
		log.saveBookingLogs(book5);
		log.saveBookingLogs(book6);

	    System.out.println("\n------Read-----\n");
	    log.readbookingLogs();
	}
}