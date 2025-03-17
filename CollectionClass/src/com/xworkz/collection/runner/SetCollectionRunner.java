package com.xworkz.collection.runner;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollectionRunner {

	public static void main(String[] args) {
		
		System.out.println("-------HashSet-----\n");
		Set<String> list = new HashSet<String>();
		
		list.add("Vinay");
		list.add("Arjun");
		list.add("Shubham");
		list.add("neeraj");
		list.add("Mintu");
		list.add("rohit");
		System.out.println("hash Set is -> "+list);
		
		list.clear();
		System.out.println("\nAfter clearing hash Set is -> "+list);
		
		System.out.println("Is hash set is empty-> "+list.isEmpty());
		
		System.out.println("-------Linked Hashset-----\n");
		Set<String> linkedSet = new LinkedHashSet<String>();
		linkedSet.add("Orange");
		linkedSet.add("Grapes");
		linkedSet.add("banana");
		linkedSet.add("apple");
		linkedSet.add("Papaya");
		System.out.println("\nLinked set is -> "+linkedSet);
		
		
		System.out.println("Does linked set contain kiwis -> "+linkedSet.contains("Kiwis"));
		linkedSet.clear();
		System.out.println("\nAfter clearing linked Set is -> "+list);
		System.out.println("Is linked set is empty-> "+linkedSet.isEmpty());
		
		
		System.out.println("-------Tree Set-----\n");
		Set<String> tree = new TreeSet<String>();
		tree.add("Eucliptus");
		tree.add("mango");
		tree.add("Guava");
		tree.add("Neem");
		tree.add("Banayan");
		System.out.println("\nTree set is -> "+tree);
		
		System.out.println("Does mango tree  is there -> "+tree.equals(tree));
		
		System.out.println("Is tree is empty-> "+tree.isEmpty());
		
		tree.remove("Eucliptus");
		System.out.println("\nAfter Remove Tree set is -> "+tree);
		
		
		
	}
}
