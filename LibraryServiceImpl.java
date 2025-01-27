public class LibraryServiceImpl extends LibraryService{

	@Override
	public String validateAndSave(LibraryDto dto) {
		
		if(dto != null) {
			if(dto.getLibraryId() >0 ) {
				System.out.println("Validate and save");
			}else {
				System.err.println("Invalid library id");
			}
			
			if(dto.getLibraryName() != null && dto.getLibraryName().length() >3) {
				System.out.println("Validate and save library name");
			}else {
				System.err.println("Library name is null or less than 3 char");
			}
			
			if(dto.getLibrarianName() != null && dto.getLibraryName().length() >3) {
				System.out.println("Validate and save librarian name");
			}else {
				System.err.println("librarian name is null or less than 3 char");
			}
			
			if(dto.getAddress() != null && dto.getAddress().length() >3) {
				System.out.println("Validate and save address");
			}else {
				System.err.println("Address is null or less than 3 char");
			}
			
			if(dto.getNumberOfBooks() > 50) {
				System.out.println("Validate and save Books");
			}else {
				System.err.println("Number of books is less than 50");
			}
			
			if(dto.getOpeningHours() != null && dto.getOpeningHours().length() >3) {
				System.out.println("Validate and save opening hours");
			}else {
				System.err.println("opening hours is null or less than 3 char");
			}
			
			if(dto.isDigitalLibrary()) {
				System.out.println("Validate and save about digital library");
			}else {
				System.err.println("Response is null");
			}
			
			int digit = getDigitCount(dto.getContactNumber());
			if(digit == 10) {
				System.out.println("Validate and save contact number");
			}else {
				System.err.println("Invalid contact number");
			}	
			
		}else {
			System.err.println("Dto is null");
		}
		
		
		return "not saved";
	}
	
	//contact number
	public static int getDigitCount(int number) {
		int count =0;
		while(number != 0) {
			number /=10;
			count++;
		}
		return count;
	}

	
}
