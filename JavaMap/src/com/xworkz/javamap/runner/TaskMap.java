package com.xworkz.javamap.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.xworkz.taskmap.dto.EmployeeDto;


public class TaskMap {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Pramendra");
		list.add("Keshava");
		list.add("Srinivas");
		list.add("Aman");
		list.add("Srinivas");
		System.out.println("List is: "+list);
		
		//Removal of duplicate value
		Set<String> set = new HashSet<String>(list);
		List<String> checkList = new ArrayList<String>(set);
		System.out.println("\nList of removal of duplicate value: "+checkList);
		
		//merging of integer
		System.out.println("\n------Merging of Two integer list---------");
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(25);
		intList.add(45);
		intList.add(74);
		intList.add(10);
		intList.add(12);
		System.out.println("\nList 1 is: "+intList);
		
		List<Integer> intList2 = new ArrayList<Integer>();
		intList2.add(10);
		intList2.add(12);
		intList2.add(85);
		intList2.add(96);
		intList2.add(30);
		System.out.println("\nList 2 is: "+intList2);
		
		Set<Integer> s = new LinkedHashSet<Integer>(intList);
		s.addAll(intList2);
		List<Integer> mergerList = new ArrayList<Integer>(s);
		System.out.println("\nAfter merging list is: "+mergerList);
		
		System.out.println("\n------2nd Largest no in the list---------");
		System.out.println("\nList 2 is: "+intList2);
		
		Comparator<Integer> comp = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1 < o2) {
					return 1;
				}
				if(o1 >o2) {
					return -1;
				}
				return 0;
			}
		};
		Collections.sort(intList2, comp);
		System.out.println("\n2nd Largest no is: "+intList2.get(1)); 
		
		System.out.println("\n------Common element in the list using set---------");
		Set<Integer> set1 = new HashSet<Integer>(intList);
		Set<Integer> set2 = new HashSet<Integer>(intList2);
		
		if(set1.retainAll(set2)) {
			System.out.println("\nList using set is: "+set1);
		}else {
			System.out.println("No common element");
		}
		
		System.out.println("\n------Common element in the list---------");
		intList.retainAll(intList2);
		System.out.println("\nList is: "+intList);
		
		System.out.println("\n------Unique value using set in the list---------");
		List<String> word = new ArrayList<String>();
		word.add("Sachin");
		word.add("Poonam");
		word.add("Akhilesh");
		word.add("Poonam");
		word.add("Sachin");
		System.out.println("List of word is: "+word);
		Set<String> setWord = new HashSet<String>(word);
		List<String> wordList = new  ArrayList<String>(setWord);
		System.out.println("List after set is: "+wordList);
		
		System.out.println("\n------Repeated value in the list---------");
		List<Integer> rep = new ArrayList<Integer>();
		rep.add(25);
		rep.add(45);
		rep.add(74);
		rep.add(25);
		rep.add(12);
		rep.add(45);
		rep.add(25);
		rep.add(12);
		rep.add(45);
		System.out.println("\nList 1 is: "+rep);
		
		Set<Integer> repSet = new HashSet<Integer>();
		
		Integer value = null;
		for(int num : rep) {
			if(repSet.contains(num)) {
				value = num;
				break;
			}
			repSet.add(num);
		}
		
		System.out.println(value);
		
		System.out.println("\n------Storing emp record in hashmap---------");
		Map<Integer,EmployeeDto> map = new HashMap<Integer, EmployeeDto>();
		map.put(101, new EmployeeDto(1, "Sunil", 500));
		map.put(102, new EmployeeDto(2, "Aman", 400));
		map.put(103, new EmployeeDto(3, "Kususma", 700));
		map.put(104, new EmployeeDto(4, "Abhay", 350));
		
		System.out.println(map);
		List<EmployeeDto> empList = new ArrayList<EmployeeDto>(map.values());
		
		Comparator<EmployeeDto> emp = new Comparator<EmployeeDto>() {
			
			@Override
			public int compare(EmployeeDto o1, EmployeeDto o2) {
				if(o1.getSalary() < o2.getSalary()) {
					return -1;
				}
				if(o1.getSalary() > o2.getSalary()) {
					return 1;
				}
				return 0;
			}
		};
		
		
		Collections.sort(empList, emp);
		System.out.println(empList);
		
		
//		System.out.println("\n----First non-repeating charatcer------");
//		Map<Integer, String> map2 = new HashMap<Integer, String>();
//		map2.put(1, "Priya");
//		map2.put(2, "Trump");
//		map2.put(3, "Putin");
//		map2.put(4, "Nisha");
//		map2.put(5, "Vicky");
//		System.err.println(map2);
		
		
		
		
		
		
		//unique character check
		System.out.println("\n----unique character check------");
		String str1 = "Srinivas";
		String str2 = "Listen";
		System.out.println("\nIs str1 unique: "+duplicateCheck(str1));
		System.out.println("\nIs str2 unique: "+duplicateCheck(str2));
		
	}
	
	public static boolean duplicateCheck(String str)
	{
		Set<Character> charSet = new HashSet<Character>();
		for(char ch: str.toCharArray() ) {
			if(!charSet.add(ch)) {
				return false;
			}
		}

		return true;
	}
}
