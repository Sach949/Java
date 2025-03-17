package com.xworkz.library.service;

import com.xworkz.library.dto.LibraryDto;

public interface LibraryService {

	boolean addLibrary(LibraryDto dto);
	
	boolean updateLibrary(LibraryDto dto);
	
	boolean deleteLibrary(String lib);
	
	void displayLibrary();
	
	void searchLibrary(String lib);
}
