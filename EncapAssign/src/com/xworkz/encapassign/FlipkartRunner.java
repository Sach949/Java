package com.xworkz.encapassign;

import com.xworkz.encapassign.things.Flipkart;

public class FlipkartRunner {

	public static void main(String []args) {
		Flipkart cart = new Flipkart("Bansal", "Delhi", "Online shopping platform", 100, "e-commerce company");
		System.out.println(cart.toString());
	}
}
