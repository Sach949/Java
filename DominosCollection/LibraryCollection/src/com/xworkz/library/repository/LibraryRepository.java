package com.xworkz.library.repository;

import com.xworkz.library.dto.LibraryDto;

public interface LibraryRepository {

	boolean addLibrary(LibraryDto dto);
	
	boolean updateLibrary(LibraryDto dto);
	
	boolean deleteLibrary(String lib);
	
	void displayLibrary();
	
	void searchLibrary(String lib);
}
