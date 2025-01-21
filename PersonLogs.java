package com.xworkz.person.things;

public class PersonLogs {

	PersonDetails[] personDetails = new PersonDetails[4]; // array
	int index = 0;

	// Save method
	public String savePersonDetails(PersonDetails perDetails) {

		System.out.println("person Details: " + perDetails);

		if (perDetails != null) {
			System.out.println("Array is not empty");

			if (index < personDetails.length) {
				personDetails[index] = perDetails;
				index++;
				return "Saved successfully";

			} else {
				System.out.println("\n!!!!!Array is full\n");
				return "Array is full. Can't save";
			}
		}

		return "can not saved";
	}

	// Read method
	public void readPersonDetails() {
		for (int i = 0; i < personDetails.length; i++) {
			System.out.println("Person Details are " + i + " : " + personDetails[i]);
		}
	}

	// Delete Method
	public void deletePersonLogsById(int id) {
		System.out.println("\nPerson's Id is: " + id);

		if (id > 0) {

			for (int i = 0; i < personDetails.length; i++) {
				if (personDetails[i] != null && personDetails[i].getId() == id) {
					System.out.println("Id match is found");
					personDetails[i] = null;
					System.out.println("Deleted successfully");
				}
			}
		} else {
			System.out.println("Id is 0 " + id);
		}
	}

	public void updatePersonLogsById(PersonDetails personInfo) {

		System.out.println("Person Details is: " + personInfo);

		if (personInfo != null) {

			for (int i = 0; i < personDetails.length; i++) {
				if (personDetails[i] != null && personDetails[i].getId() == personInfo.getId()) {
					personDetails[i] = personInfo;

					System.out.println("Deleted successfully");
				} else {
					System.out.println("Match is not found");
				}

			}
		} else {
			System.out.println("It is null");
		}

	}

	public void searchPersonLogsById(int id) {
		
		if (id > 0) {

			for (int i = 0; i < personDetails.length; i++) {
				if (personDetails[i] != null && personDetails[i].getId() == id) {
					System.out.println("Id match is found");
					System.out.println("Details is: "+personDetails[i]);
				}else {
					System.out.println("Id match is not found");
				}
			}
		} else {
			System.out.println("Id is 0 " + id);
		}
	}

}
