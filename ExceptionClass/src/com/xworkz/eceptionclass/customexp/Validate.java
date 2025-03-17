package com.xworkz.eceptionclass.customexp;

public class Validate {

	public void validateMethod(String valid){
		if(valid !=null && valid.length()>3) {
			    System.out.println("Validated");
		}else {
			throw new ValidationVoilateException("Excepton occured as Valid is null");
		}
	}
}
