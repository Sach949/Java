package com.xworkz.features.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.features.dto.UniversityDto;

public class UniversityRunner {

	public static void main(String[] args) {
		List<UniversityDto> list = new ArrayList<UniversityDto>();
		list.add(new UniversityDto("Nithin", "VTU", 500, 81));
		list.add(new UniversityDto("Suman", "BHU", 700, 85));
		list.add(new UniversityDto("Vikas", "JNU", 890, 86));
		list.add(new UniversityDto("Abhay", "KIIT", 500, 78));
		list.add(new UniversityDto("Srinivas", "ICE", 650, 89));
		list.add(new UniversityDto("Anurag", "NSUT", 400, 75));
		list.add(new UniversityDto("Gaurav", "MU", 663, 74));
		list.add(new UniversityDto("Subhash", "DU", 900, 88));
		list.add(new UniversityDto("Abhishek", "AKTU", 750, 52));
		list.add(new UniversityDto("Manish", "BU", 910, 90));
		list.add(new UniversityDto("Shekhar", "ITT Delhi", 560, 45));
		list.add(new UniversityDto("Nandini", "IIM", 755, 87));
		list.add(new UniversityDto("Pushpa", "AIIMS", 500, 60));
		
		Collections.sort(list);
		list.forEach(System.out::println);
		//System.out.println(list);
		
		
		System.out.println("\n---Comparator----\n");
		Comparator<UniversityDto> comp = new Comparator<UniversityDto>() {
			
			@Override
			public int compare(UniversityDto o1, UniversityDto o2) {
				if(o1.getMarks() < o2.getMarks()) {
					return 1;
				}
				if(o1.getMarks() > o2.getMarks()) {
					return -1;
				}
				return 0;
			}
		};
		Collections.sort(list, comp);
		list.forEach(System.out::println);
		
		System.out.println("\n---Top 5 students based on marks----\n");
		List<UniversityDto> top5Students = list.stream().sorted(Comparator
				.comparingInt(UniversityDto::getMarks).reversed()).limit(5).collect(Collectors.toList());
		top5Students.forEach(System.out::println);
		
		//System.out.println(list);
		
		
		System.out.println("\n---Based on Percent----\n");
		Comparator<UniversityDto> percents = new Comparator<UniversityDto>() {
			
			@Override
			public int compare(UniversityDto o1, UniversityDto o2) {
				if(o1.getPercentage() < o2.getPercentage()) {
					return 1;
				}
				if(o1.getPercentage() > o2.getPercentage()) {
					return -1;
				}
				return 0;
			}
		};
		
		Collections.sort(list, percents);
		list.forEach(System.out::println);
	}
}