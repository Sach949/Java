public class LibraryDto {

	private int libraryId;
	private String libraryName;
	private String librarianName;
	private String address;
	private int numberOfBooks;
	private String openingHours;
	private boolean isDigitalLibrary;
	private String contactNumber;
	
	public LibraryDto() {
		
	}

	public LibraryDto(int libraryId, String libraryName, String librarianName, String address, int numberOfBooks,
			String openingHours, boolean isDigitalLibrary, String contactNumber) {
		super();
		this.libraryId = libraryId;
		this.libraryName = libraryName;
		this.librarianName = librarianName;
		this.address = address;
		this.numberOfBooks = numberOfBooks;
		this.openingHours = openingHours;
		this.isDigitalLibrary = isDigitalLibrary;
		this.contactNumber = contactNumber;
	}

	public int getLibraryId() {
		return libraryId;
	}

	public void setLibraryId(int libraryId) {
		this.libraryId = libraryId;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public String getLibrarianName() {
		return librarianName;
	}

	public void setLibrarianName(String librarianName) {
		this.librarianName = librarianName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumberOfBooks() {
		return numberOfBooks;
	}

	public void setNumberOfBooks(int numberOfBooks) {
		this.numberOfBooks = numberOfBooks;
	}

	public String getOpeningHours() {
		return openingHours;
	}

	public void setOpeningHours(String openingHours) {
		this.openingHours = openingHours;
	}

	public boolean isDigitalLibrary() {
		return isDigitalLibrary;
	}

	public void setDigitalLibrary(boolean isDigitalLibrary) {
		this.isDigitalLibrary = isDigitalLibrary;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "LibraryDto [libraryId=" + libraryId + ", libraryName=" + libraryName + ", librarianName="
				+ librarianName + ", address=" + address + ", numberOfBooks=" + numberOfBooks + ", openingHours="
				+ openingHours + ", isDigitalLibrary=" + isDigitalLibrary + ", contactNumber=" + contactNumber + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((contactNumber == null) ? 0 : contactNumber.hashCode());
		result = prime * result + (isDigitalLibrary ? 1231 : 1237);
		result = prime * result + ((librarianName == null) ? 0 : librarianName.hashCode());
		result = prime * result + libraryId;
		result = prime * result + ((libraryName == null) ? 0 : libraryName.hashCode());
		result = prime * result + numberOfBooks;
		result = prime * result + ((openingHours == null) ? 0 : openingHours.hashCode());
		return result;
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
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (contactNumber == null) {
			if (other.contactNumber != null)
				return false;
		} else if (!contactNumber.equals(other.contactNumber))
			return false;
		if (isDigitalLibrary != other.isDigitalLibrary)
			return false;
		if (librarianName == null) {
			if (other.librarianName != null)
				return false;
		} else if (!librarianName.equals(other.librarianName))
			return false;
		if (libraryId != other.libraryId)
			return false;
		if (libraryName == null) {
			if (other.libraryName != null)
				return false;
		} else if (!libraryName.equals(other.libraryName))
			return false;
		if (numberOfBooks != other.numberOfBooks)
			return false;
		if (openingHours == null) {
			if (other.openingHours != null)
				return false;
		} else if (!openingHours.equals(other.openingHours))
			return false;
		return true;
	}
	
}
