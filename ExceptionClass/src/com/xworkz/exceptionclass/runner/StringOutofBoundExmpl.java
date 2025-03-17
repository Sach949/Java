package com.xworkz.exceptionclass.runner;

public class StringOutofBoundExmpl {

	public static void main(String[] args) {
		String name = "Suraj";
		try {
			System.out.println(name.charAt(5));
			System.exit(1);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
			System.err.println(e.getMessage());
		}finally {
			System.out.println("Enter Valid index number");
		}
	}
}