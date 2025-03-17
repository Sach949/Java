package com.xworkz.exceptionclass.runner;

import java.io.File;

public class ExceptionExampl {

	public static void main(String[] args) {
		
		String str = "Pune";
		String s = null;
		
		System.out.println(str.charAt(0));
		//System.out.println(s.charAt(0));
		//System.out.println(s.indexOf(s)); 
		
		try {
			System.out.println(s.charAt(0));
			
		}catch(NullPointerException e) {
			System.out.println(e);
		}finally {
			System.out.println("Finally block");
		}
		
		File file = new File("/VALIDATE");
		System.out.println(file.getPath());
		//String str1 = "Helllo";
		System.out.println(file);
	}
	
}
