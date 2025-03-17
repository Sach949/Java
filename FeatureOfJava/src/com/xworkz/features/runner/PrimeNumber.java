package com.xworkz.features.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumber {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(9);
		list.add(11);
		list.add(26);
		list.add(17);
		System.out.println("List is: "+list);
		
		List<Integer> prime = list.stream().filter(PrimeNumber::isPrime).collect(Collectors.toList());
		System.out.println("List of prime number is: "+prime);
		
		//name >5
		List<String> nameList = new ArrayList<String>();
		nameList.add("Vishwanath");
		nameList.add("Shweta");
		nameList.add("Aman");
		nameList.add("Rajkumar");
		nameList.add("Neeraj");
		nameList.add("Kumar");

		Predicate<String> predicate = (word)->{
			if(word.contains("e")) {
				return true;
			}
			return false;
		};
		System.out.println("\n-----Word checking-------");
		nameList.stream().filter(predicate).forEach(od->System.out.println(od));
		
		System.out.println("\n-----Length checking-------");
		Stream<String> str1 = Stream.of("Vishwanath","Srinivas","Aman","Rajkumar","Raj","Kumar");
		str1.filter(name->name.length()>5).forEachOrdered(check-> System.out.println(check));
		
	}
	
	public static boolean isPrime(int number) {
		if(number < 2) {
			return false;
		}
		return IntStream.rangeClosed(2, (int) Math.sqrt(number)).allMatch(n-> number%n!=0);
	}
	
	
}
