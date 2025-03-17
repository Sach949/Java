package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.collection.dto.ExamFormReg;

public class ExamRunner {

	public static void main(String[] args) {
		
		List<ExamFormReg> list  =new ArrayList<ExamFormReg>();
		
		ExamFormReg reg= new ExamFormReg("Nilesh", "Male", "Never married",true, 90);
		//add
		list.add(reg);
		list.add(new ExamFormReg("Vaishali", "Female", "married",true, 95));
		System.out.println(list);
		
		//update  using set
		list.set(0, new ExamFormReg("Rupa", "Female", "No", true, 97));
		System.out.println(list);
		
		//read using get
		list.get(1);
		System.out.println(list);
		
		//searching
		System.out.println(list.contains(reg));
		
		System.out.println(list.isEmpty()); 
		
		list.remove(1);
		System.out.println(list);
		
		//Collections.sort(reg);
	}
}
