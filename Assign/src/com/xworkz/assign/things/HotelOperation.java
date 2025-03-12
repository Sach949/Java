package com.xworkz.assign.things;

public class HotelOperation {

	HotelDetails[] details = new HotelDetails[5];
	int index = 0;
	
	public String saveHotelOperation(HotelDetails hotelDetails) {
		if(details != null) {
			System.out.println("Array is not null");
		}
		
		if(index < details.length) {
			details[index] = hotelDetails;
			index++;
			System.out.println("Details Are: "+hotelDetails);
			return "saved successfully";
		}else {
			System.out.println("Array is full");
		}
		
		return "Not saved";
	}
	
	public void deleteHotelLogs(int id) {
		if(id>0) {
			for(int i = 0; i < details.length; i++) {
				if(details [i] != null && details[i].getRegId() == id) {
					System.out.println("Id match is found");
					details[i] = null;
					System.out.println("Deleted Successfully");
					
				}else {
					System.out.println("Id match is not found");
				}
			}
		}else {
			System.out.println("Id is 0");
		}
	}
	
	public void updateHotelLogs(HotelDetails hotel) {
		if(hotel != null) {
			for(int i = 0; i < details.length; i++) {
				if(details [i] != null && details[i].getRegId() == hotel.getRegId()) {
					System.out.println("Id match is found");
					details[i] = hotel;
					System.out.println("Updated Successfully");
					System.out.println("Updated details are: "+hotel);
					
				}else {
					System.out.println("Id match is not found");
				}
			}
		}else {
			System.out.println("Details is null");
		}
	}	
	
	public void searchByLocation() {
		if(details !=null) {
			for(int i = 0; i<details.length; i++) {
				if(details[i] != null && details[i].getLocation() == "Mumbai") {
					System.out.println("Location match is found");
					System.out.println("Location is: "+details[i]);
				}
			}
		}else {
			System.out.println("Details is null");
		}
	}
	
	public void readHotelOperation() {
		for(int i = 0; i < details.length; i++) {
			System.out.println("Hotel Details at "+i+" position are: "+details[i]);
		}
	}
}