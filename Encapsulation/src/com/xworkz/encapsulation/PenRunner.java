package com.xworkz.encapsulation;

import com.xworkz.encapsulation.things.Pen;

public class PenRunner {

	 public static void main(String[] args) {
		 System.out.println("main method started");
		 
		 Pen pen = new Pen();
		 pen.setPenName("Writo meter");
		 pen.getPenName();
	 }
}
