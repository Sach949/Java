package com.xworkz.library.repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.library.dto.LibraryDto;

public class LibraryRepositoryImpl implements LibraryRepository {

	private List<LibraryDto> list = new ArrayList<LibraryDto>();
	

	@Override
	public boolean addLibrary(LibraryDto dto) {
		list.add(dto);
		System.out.println("Successfully added the movie titled: " + dto);

		return false;

	}

	@Override
	public boolean updateLibrary(LibraryDto dto) {

		for (LibraryDto lib : list) {
			if (lib.getLibraryName() != null && lib.getLibraryName().equals(dto.getLibraryName())) {
				System.out.println("Library is found");
				lib.setLocation(dto.getLocation());
				lib.setNoOfBooks(dto.getNoOfBooks());
				System.out.println("Library updated");
				return true;
			} else {
				System.out.println("Library does not exist");
			}
		}

		return false;
	}

	@Override
	public boolean deleteLibrary(String lib) {
		if (lib != null) {
			for (LibraryDto libr : list) {
				if (libr.getLibraryName() != null && libr.getLibraryName() == lib) {
					list.remove(libr);
					System.out.println("Removed the library : " + libr);
					return true;
				} else {
					System.out.println("library does not exist");
				}
			}
		} else {
			System.out.println("library is null");
		}
		return false;
	}

	@Override
	public void displayLibrary() {
		if (list.isEmpty()) {
			System.out.println("List is empty");
		} else {
			for (LibraryDto lib : list) {
				System.out.println("Library is: " + lib);
			}
		}

	}

	@Override
	public void searchLibrary(String lib) {

		for (LibraryDto libDto : list) {
			if (libDto.getLibraryName() != null && libDto.getLibraryName() == lib) {
				System.out.println("Library is found: " + libDto);

			} else {
				System.out.println("No match is found for the Library");
			}
		}
	}

}
