package com.xworkz.exceptionclass.runner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExmpl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			
			int a = sc.nextInt();
			System.out.println("Enter number: "+a);
			
		} catch (InputMismatchException e) {
			System.err.println(e);
			System.err.println(e.getMessage());
		}finally {
			System.out.println("Enter correct value");
		}
		
	}
}
