package com.xworkz.exceptionclass.runner;

import com.xworkz.eceptionclass.customexp.Validate;

public class ValidateExceptionRunner {

	public static void main(String[] args) {
		Validate val = new Validate();
		val.validateMethod(null);
	}
}
