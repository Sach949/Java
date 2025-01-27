public class DigilockerServiceimpl extends DigilockerService{

	@Override
	public String validateAndSave(DigilockerDto dto) {
		
		if(dto != null) {
			if(dto.getLockerId() > 0) {
				System.out.println("Validate and save");
			}else {
				System.err.println("Invalid locker Id");
			}
			
			if(dto.getUserName() != null && dto.getUserName().length() >3) {
				System.out.println("Validate and save user name");
			}else {
				System.err.println("user name is null or less than 3 char");
			}
			
			if(dto.getEmail() != null && dto.getEmail().length() >3) {
				System.out.println("Validate and save user name Email");
			}else {
				System.err.println("user name Email is null or less than 3 char");
			}
			
			int digit = getDigitCount(dto.getPhoneNumber());
			if(digit ==10) {
				System.out.println("Validate and save mobile number");
			}else {
				System.err.println("Phone number is invalid or less than 10 digit");
			}
			
			long aadhar = getAadhartCount(dto.getAadharNumber());
			if(aadhar == 12) {
				System.out.println("Validate and save Aadhar number");
			}else {
				System.err.println("Aadhar number is invalid or less than 12 digit");
			}
			
			if(dto.getPassword() != null && dto.getPassword().length() >7 ) {
				System.out.println("Validate and save password");
			}else {
				System.err.println("Password is null or less than 7 char");
			}
			
			if(dto.getTotalStorageCapacityInMB() >= 1000) {
				System.out.println("Validate and save Total Storage");
			}else {
				System.err.println("Total Storage is less than 1000 MB");
			}
			
			if(dto.getTotalStorageCapacityInMB() > 0) {
				System.out.println("Validate and save Used Storage");
			}else {
				System.err.println("Used Storage is less 0 or invalid");
			}
			
			if(dto.getCreateDate() != null && dto.getCreateDate().length() > 8 ) {
				System.out.println("Validate and save date");
			}else {
				System.err.println("Date is null or less than 8 char");
			}
			
			if(dto.isVerified()) {
				System.out.println("Locker is verified and saved");
			}else {
				System.err.println("Locker is not verified");
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
		//aadhar number
		public static long getAadhartCount(long number) {
			int count =0;
			while(number != 0) {
				number /=12;
				count++;
			}
			return count;
		}
	
}