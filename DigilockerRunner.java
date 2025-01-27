public class DigilockerRunner {

	public static void main(String[] args) {
		System.out.println("Main method");
		
		DigilockerDto  digilockerDto = new DigilockerDto();
		digilockerDto.setLockerId(100);
		digilockerDto.setUserName("Aman");
		digilockerDto.setEmail(null);
		digilockerDto.setPhoneNumber(2136540000);
		digilockerDto.setAadharNumber(123654789002L);
		digilockerDto.setPassword(null);
		digilockerDto.setTotalStorageCapacityInMB(1000);
		digilockerDto.setUsedStorageInMB(10);
		digilockerDto.setCreateDate("12-10-2019");
		digilockerDto.setVerified(true);
		
		System.out.println("Locker Details are: "+digilockerDto);
		
		DigilockerService digilockerService = new DigilockerServiceimpl();
		digilockerService.validateAndSave(digilockerDto);
	}
}