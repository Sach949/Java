package com.xworkz.assign.things;

public class BookLogs {

	BookDetails[] details = new BookDetails[4];
	int index = 0;
	
	//Save Method
	public String saveBookLogs(BookDetails bookDetails) {
		
		if(details != null) {
			System.out.println("Array is not null");
		}
		if(index < details.length) {
			details[index] = bookDetails;
			index++;
			System.out.println("Book details are: "+bookDetails);
			return "Saved Successfully";
		}else {
			System.out.println("\nArray is full");
		}
		
		return "Not Saved";
	}
	
	
	//Read Method
	public void readBookLogs() {
		for(int i = 0; i < details.length; i++) {
			System.out.println("Book Details at "+i+" position are: "+details[i]);
		}
	}
	
	//Delete Method
	public void deleteBookLogs(int id) {
		System.out.println("Book Id is: "+id);
		
		if(id >0) {
			
			for(int i = 0; i < details.length; i++) {
				if(details[i] != null && details[i].getBookId() == id) {
					System.out.println("Id match is found");
					details[i] = null;
					System.out.println("Deleted Successfully");
				}
			}
		}else {
			System.out.println("Id is 0 " + id);
		}
	}
	
	public void updateBookLogs(BookDetails book) {
		System.out.println("Book Details are: "+book);
		
		if(book != null) {
			for(int i = 0; i<details.length; i++) {
				if(details[i] != null && details[i].getBookId() == book.getBookId()) {
					details[i] = book;
				}
			}
		}else {
			System.out.println("It is null");
		}
	}
	
	public void searchBookLogs(int id) {
		if(id >0) {
			for(int i = 0; i < details.length; i++) {
				if(details[i] !=null && details[i].getBookId() == id) {
					System.out.println("Id match is found");
					System.out.println("Book Details are: "+details[i]);
				}else {
					System.out.println("Is match is not found");
				}
			}
			
		}else {
			System.out.println("Id is 0");
		}
	}
}
