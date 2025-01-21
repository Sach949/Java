public class LinkedProfile {

	public void deleteLinkedProfile(int id) {
		if (id>0) {
			for(int i = 0; i < details.length; i++) {
				if(details[i] !=null && details[i].getId()==id) {
					System.out.println("Id match is found");
					details[i] = null;
					System.out.println("Deleted successfully");
				}else {
					System.out.println("Id match is not found");
				}
			}
		}else {
			System.out.println("Is is 0 or invalid");
		}
	}
	
	public void updateLinkedProfile(LinkedAccount account) {
		if(account !=null) {
			for(int i = 0; i < SnacksDetails.length; i++) {
				if(details[i] !=null && details[i].getId()==acocunt.getId()) {
					System.out.println("Id match is found");
					details[i] = account;
					System.out.println("Updated successfully");
					System.out.println("Updated Details are: "+account);
				}else {
					System.out.println("Id match is not found");
				}
			}
		}else {
			System.out.println("Is is 0 or invalid");
		}
	}
	
	public void searchLinkedProfile(int id) {
		if (id>0) {
			for(int i = 0; i < details.length; i++) {
				if(details[i] !=null && details[i].getId()==id) {
					System.out.println("Id match is found");
					System.out.println("Matche ID Details are: "+details[i]);
				}else {
					System.out.println("Id match is not found");
				}
			}
		}else {
			System.out.println("Is is 0 or invalid");
		}
	}
}
