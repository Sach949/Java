package com.xworkz.library.dto;

import java.util.Objects;

public class LibraryDto {

	private String libraryName;
	private String location;
	private int noOfBooks;
	
//	public LibraryDto() {
//		
//	}

	public LibraryDto(String libraryName, String location, int noOfBooks) {
		super();
		this.libraryName = libraryName;
		this.location = location;
		this.noOfBooks = noOfBooks;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfBooks() {
		return noOfBooks;
	}

	public void setNoOfBooks(int noOfBooks) {
		this.noOfBooks = noOfBooks;
	}

	@Override
	public String toString() {
		return "LibraryDto [libraryName=" + libraryName + ", location=" + location + ", noOfBooks=" + noOfBooks + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(libraryName, location, noOfBooks);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LibraryDto other = (LibraryDto) obj;
		return Objects.equals(libraryName, other.libraryName) && Objects.equals(location, other.location)
				&& noOfBooks == other.noOfBooks;
	}
	
	
}
