package com.xworkz.collection.runner;

import java.util.LinkedList;


public class LinkedListRunner {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Vaishali");
		list.add("Suman");
		list.add("Mohan");
		list.add("Gaurav");
		System.out.println("List is: "+list);
		
		System.out.println("\n------Remove-----\n");
		list.remove();
		System.out.println("After remove List is: "+list);
		
		list.contains("Suman");
		System.out.println("\nAfter contain List is: "+list);
		
		list.set(0, "Sanjay");
		System.out.println("\nAfter set List is: "+list);
		
		list.get(2);
		System.out.println("\nAfter get List is: "+list);
		
		//list.peek();
		System.out.println("\nAfter peek List is: "+list.peek());
		System.out.println("\nList is: "+list);
		
		list.poll();
		System.out.println("\nAfter poll List is: "+list);
		
		list.addLast("Amar");
		System.out.println("\nAfter addlast List is: "+list);
	}
}
