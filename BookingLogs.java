package com.xworkz.assign.things;

public class BookingLogs {

	BookingApplication[] application = new BookingApplication[5];
	int index = 0;
	
	public String saveBookingLogs(BookingApplication bookingApplication) {
		
		System.out.println("Booking details are: "+bookingApplication);
		if(application != null) {
			System.out.println("Array is not null");
			
			if(index < application.length) {
				application[index] = bookingApplication;
				index++;
//				System.out.println("Booking details are: "+bookingApplication);
				return "Saved successfully";
			}else {
				System.out.println("\nCannot Save because Array is full !!");
				return "Array is full";
			}
		}
		
		return "Not saved";
	}
	
	public void readbookingLogs() {
		for(int i = 0; i < application.length; i++) {
			System.out.println("Booking Details at "+i+" position: "+application[i]);
		}
	}
}