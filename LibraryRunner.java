public class LibraryRunner {

	public static void main(String[] args) {
		System.out.println("Main method");
		
		LibraryDto libraryDto = new LibraryDto();
		libraryDto.setLibraryId(100);
		libraryDto.setLibraryName("akash");
		libraryDto.setLibrarianName("Amit");
		libraryDto.setAddress("Banglore");
		libraryDto.setNumberOfBooks(51);
		libraryDto.setOpeningHours("From 8 am");
		libraryDto.setDigitalLibrary(true);
		libraryDto.setContactNumber(201365412);
		
		System.out.println("Library details are: "+libraryDto);
		
		LibraryService libraryService = new LibraryServiceImpl();
		libraryService.validateAndSave(libraryDto);
	}
	
}