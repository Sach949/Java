package com.xworkz.library.runner;

import com.xworkz.library.dto.LibraryDto;
import com.xworkz.library.service.LibraryService;
import com.xworkz.library.service.LibraryServiceImpl;

public class LibraryRunner {

	public static void main(String[] args) {
		
		LibraryDto libraryDto = new LibraryDto("Allen", "Kota", 10000);
		LibraryDto libraryDto2 = new LibraryDto("Resonance", "Delhi", 1000);
		LibraryDto libraryDto3 = new LibraryDto("Fitzee", "Pune", 5000);
		LibraryDto libraryDto4 = new LibraryDto("Sankalp", "Bengaluru", 4000);
		LibraryDto libraryDto5 = new LibraryDto("Vishal", "Mumbai", 20000);
		
		LibraryService service = new LibraryServiceImpl();
		System.out.println("-----Adding-----\n");
		service.addLibrary(libraryDto);
		service.addLibrary(libraryDto2);
		service.addLibrary(libraryDto3);
		service.addLibrary(libraryDto4);
		service.addLibrary(libraryDto5);
		
		System.out.println("\n-----View-----\n");
		service.displayLibrary();
		
		System.out.println("\n-----Update-----\n");
		LibraryDto update = new LibraryDto("Fitzee", "Chnadigarh", 50000);
		service.updateLibrary(update);
		
		System.out.println("\n-----View-----\n");
		service.displayLibrary();
		
		
		System.out.println("\n-----Remove-----\n");
		service.deleteLibrary("Sankalp");
		
		System.out.println("\n-----View-----\n");
		service.displayLibrary();
		
		System.out.println("\n-----Search-----\n");
		service.searchLibrary("Allen");
		service.searchLibrary("Sankalp");
		
		System.out.println("\n-----View-----\n");
		service.displayLibrary();
		
		
	}
}
