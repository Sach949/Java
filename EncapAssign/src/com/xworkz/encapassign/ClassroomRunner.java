package com.xworkz.encapassign;

import com.xworkz.encapassign.things.Classroom;

public class ClassroomRunner {

	public static void main(String []args) {
		Classroom cls = new Classroom("8th Class", 24, "Maths", 48, true);
		System.out.println(cls.toString());
	}
}
