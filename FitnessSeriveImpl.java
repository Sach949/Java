public class FitnessSeriveImpl extends FitnessService{

	@Override
	public String validateAndSave(FitnessCenterDto dto) {
		if(dto != null) {
			if(dto.getRegId() >0) {
				System.out.println("Validate and save fitness Center");
			}else{
				System.err.println("Invalid Reg Id");
			}
			
			if(dto.getName() != null && dto.getName().length() >3) {
				System.out.println("Validate and save fitness Center name");
			}else{
				System.err.println("Name is null or less than 3 char");
			}
			
			if(dto.getLocation() != null && dto.getLocation().length() >3) {
				System.out.println("Validate and save fitness Center Location");
			}else{
				System.err.println("Location is null or less than 3 char");
			}
			
			if(dto.getIsJumbaAvailable() != null) {
				System.out.println("Validate and save Response regarding jumbo");
			}else {
				System.err.println("Response is null");
			}
			
			if(dto.getTotalMemberships() >= 10) {
				System.out.println("Validate and save membership");
			}else {
				System.err.println("Less than 10 members");
			}
			
			
		}else {
			System.err.println("DTO is null");
		}
		return "Not saved";
	}

	
}
