package com.xworkz.encapassign;

import com.xworkz.encapassign.things.Optical;

public class OpticalRunner {

	public static void main(String []args) {
		Optical opt = new Optical("Convex Lens", "Glass", 1, 700, "short sightedness");
		System.out.println(opt.toString());
	}
}
