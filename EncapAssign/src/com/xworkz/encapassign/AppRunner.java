package com.xworkz.encapassign;

import com.xworkz.encapassign.things.Application;

public class AppRunner {

	public static void main(String []args) {
		Application app = new Application("Call of Duty", "Gameing app", "Activision", "season 9", "Running");
		System.out.println(app.toString());
	}
}
