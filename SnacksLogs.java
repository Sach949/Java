public class SnacksLogs {

	SnacksDetails[] details = new SnacksDetails[5];
	int index = 0;
	
	public String saveSnakcsLogs(SnacksDetails snacksDetails) {
		
		if(details != null) {
			System.out.println("Array is not null");
			if(index < details.length) {
				details[index] = snacksDetails;
				index++;
				System.out.println("Saved details are: "+snacksDetails);
				return "saved successfully";
			}else {
				System.out.println("Array is full");
			}
		}else {
			System.out.println("Array is null");
		}
		
		return"Not Saved";
	}
	
	public void deleteSnacksLogs(int id) {
		if(id>0){
			for(int i =0; i<details.length; i++) {
				if(details[i] != null && details[i].getSnacksId() ==id) {
					System.out.println("Id match is found");
					details[i] = null;
					System.out.println("Deleted successfully");
				}else {
					System.out.println("Id match is not found");
				}
			}
		}else {
			System.out.println("Id is 0 or invalid");
		}
	}
	
	public void updateSnacksLogs(SnacksDetails snacks) {
		if(snacks != null) {
			for(int i = 0; i <details.length; i++) {
				if(details[i] != null && details[i].getSnacksId() == snacks.getSnacksId()) {
					System.out.println("Id match is found");
					details[i] = snacks;
					System.out.println("Updated successfully");
				}else {
					System.out.println("Id match is not found");
				}
			}
		}else {
			System.out.println("Snacks is null");
		}
	}
	
	public void searchSnacksLogs(int id) {
		if(id>0){
			for(int i =0; i<details.length; i++) {
				if(details[i] != null && details[i].getSnacksId() ==id) {
					System.out.println("Id match is found");
				}else {
					System.out.println("Id match is not found");
				}
			}
		}else {
			System.out.println("Id is 0 or invalid");
		}
	}
	
	public void readsnacksLogs() {
		for(int i = 0; i <details.length; i++) {
			System.out.println("Snacks Details at "+i+" position are: "+details[i]);
		}
	}
}