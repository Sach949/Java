package com.xworkz.assign.things;

public class ShopOperation {

	ShopDetails[] details = new ShopDetails[5];
	int index = 0;
	
	public String saveShopOperation(ShopDetails shopDetails) {
		if(details != null) {
			System.out.println("Array is not null");
		}
		if(index < details.length) {
			details[index] = shopDetails;
			index++;
			System.out.println("Shop Details are: "+shopDetails);
		}else {
			System.out.println("Array is full");
			return "Saved Succesfully";
		}
		return "Not saved";
	}
	
	public void readShopOperation() {
		for(int i = 0;  i < details.length; i++) {
			System.out.println("Shop details at "+i+" position: "+details[i]);
		}
	}
	
}

