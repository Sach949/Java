package com.xworkz.library.service;

import com.xworkz.library.dto.LibraryDto;
import com.xworkz.library.repository.LibraryRepository;
import com.xworkz.library.repository.LibraryRepositoryImpl;
import com.xworkz.library.util.LibraryUtil;

public class LibraryServiceImpl implements LibraryService {

	private LibraryRepository libraryRep = new LibraryRepositoryImpl();
	
	@Override
	public boolean addLibrary(LibraryDto dto) {
		System.out.println("Dto is: "+dto);
		if(dto != null) {
			if(LibraryUtil.validate(dto.getLibraryName()) 
					&& LibraryUtil.validate(dto.getLocation())) {
				System.out.println("Validation is done");
				
				if(this.libraryRep.addLibrary(dto)) {
					System.out.println("Inventory Saved Successfully");
					return true;
				}else {
					System.out.println("Not saved");
					return true;
				}
			}
				
		}else {
			System.out.println("Dto is null");
		}
		return false;
		
	}

	@Override
	public boolean updateLibrary(LibraryDto dto) {
		
		return this.libraryRep.updateLibrary(dto);
	}

	@Override
	public boolean deleteLibrary(String lib) {
		
		return this.libraryRep.deleteLibrary(lib);
	}

	@Override
	public void displayLibrary() {
		this.libraryRep.displayLibrary();
		
	}

	@Override
	public void searchLibrary(String lib) {
		this.libraryRep.searchLibrary(lib);
		
	}

}
