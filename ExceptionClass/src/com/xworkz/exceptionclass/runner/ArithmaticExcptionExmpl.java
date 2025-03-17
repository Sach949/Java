package com.xworkz.exceptionclass.runner;

public class ArithmaticExcptionExmpl {

	public static void main(String[] args) {
		calculatePercent(12,0);
	}
	
	public static int calculatePercent(int obtainedMarks, int totalMarks) {

		
		//System.out.println("Total percent is: "+percent);
		try {
			int percent = (obtainedMarks / totalMarks) * 100;
			System.out.println("Total percent is: "+percent);
			System.exit(1);
			
		} catch (ArithmeticException e) {
			System.err.println("Percent is zero");
			System.err.println(e);
		}finally {
			System.out.println("Invalid");
		}
		return 0;
	
	}
}