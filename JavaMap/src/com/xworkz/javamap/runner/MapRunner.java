package com.xworkz.javamap.runner;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import javax.security.auth.login.AccountException;

public class MapRunner {

	public static void main(String[] args) {
		
		Map<Integer, String> rollNo = new TreeMap<Integer, String>();
		rollNo.put(4, "Sachin");
		rollNo.put(2, "Mohan");
		rollNo.put(3, "Sagar");
		rollNo.put(1, "Vaishali");
		rollNo.put(5, "Ankita");
		rollNo.put(6, "Arpita");
		System.out.println(rollNo);
		
		System.out.println(rollNo.values());
		System.out.println(rollNo.keySet());
		System.out.println("Value at given key is: "+rollNo.get(1));
		System.out.println(rollNo.containsKey(3));
		System.out.println(rollNo.remove(5));
		System.out.println(rollNo.values());
		System.out.println(rollNo.replace(6, "Shubham"));
		System.out.println(rollNo.values());
		System.out.println(rollNo.size());
		rollNo.clear();
		System.out.println(rollNo.values());
		System.out.println(rollNo.isEmpty());
		
		System.out.println("\n-----HashMap-------\n");
		Map<Long, String> acoountNo = new HashMap<Long, String>();
		acoountNo.put(123654l, "Sachin");
		acoountNo.put(123655l, "Varshitha");
		acoountNo.put(123656l, "vandana");
		acoountNo.put(123854l, "Suraj");
		acoountNo.put(123754l, "Mamta");
		
		System.out.println(acoountNo);
		System.out.println(acoountNo.values());
		System.out.println(acoountNo.keySet());
		System.out.println("Value at given key is: "+acoountNo.get(1));
		System.out.println(acoountNo.containsKey(123754l));
		System.out.println(acoountNo.remove(2));
		System.out.println(acoountNo.values());
		System.out.println(acoountNo.replace(123656l, "Ajay"));
		System.out.println(acoountNo.values());
		System.out.println(acoountNo.size());
		acoountNo.clear();
		System.out.println(acoountNo.values());
		System.out.println(acoountNo.isEmpty());
		 
		System.out.println("\n-----LinkedMap-------\n");
		Map<Integer, String> carId = new LinkedHashMap<Integer, String>();
		carId.put(5, "Dezire");
		carId.put(6, "Creta");
		carId.put(3, "Seltos");
		carId.put(1, "Scorpio");
		carId.put(4, "Safari");
		carId.put(2, "Ertiga");
		System.out.println(carId);
		System.out.println(carId.isEmpty());
		System.out.println(carId.values());
		System.out.println(carId.keySet());
		System.out.println("Value at given key is: "+carId.get(4));
		System.out.println(carId.containsKey(7));
		System.out.println(carId.remove(2));
		System.out.println(carId.values());
		System.out.println(carId.replace(1, "Ajay"));
		System.out.println(carId.values());
		System.out.println(carId.size());
		carId.clear();
		System.out.println(carId.values());
		System.out.println(carId.isEmpty());
		
		
	}
}
