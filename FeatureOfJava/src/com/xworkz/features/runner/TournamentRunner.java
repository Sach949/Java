package com.xworkz.features.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.xworkz.features.constant.Profession;
import com.xworkz.features.dto.TournamentDto;

public class TournamentRunner {

	public static void main(String[] args) {
		
		List<TournamentDto> dto = new ArrayList<TournamentDto>();
		dto.add(new TournamentDto("Sachin", Profession.CRICKET, 1000, 463, 0, null, "India", 0));
		dto.add(new TournamentDto("Kohli", Profession.CRICKET, 11000, 350, 0, null, "India", 0));
		dto.add(new TournamentDto("Rohit", Profession.CRICKET, 14000, 287, 0, null, "India", 0));
		dto.add(new TournamentDto("Rayadu", Profession.CRICKET, 250, 12, 0, null, "India", 0));
		dto.add(new TournamentDto("Nehra", Profession.CRICKET, 290, 280, 0, null, "India", 0));
		
		
		List<String> list = new ArrayList<String>();
		dto.stream  ().filter(runs->{
			if(runs.getRuns() >300) {
				list.add(runs.getName());
				return true;
			}
			
			return false;
		}).collect(Collectors.toList());
		
		Collections.sort(dto);
//		list.forEach(System.out::println);
		System.out.println(list);
		
//		System.out.println("\n-------using Comparable-------");
//		Collections.sort(list);
//		System.out.println(list);
		
		
		Comparator<TournamentDto> comp = new Comparator<TournamentDto>() {
			
			@Override
			public int compare(TournamentDto o1, TournamentDto o2) {
				if(o1.getRuns() < o2.getRuns()) {
					return -1;
				}
				if(o1.getRuns() > o2.getRuns()) {
					return 1;
				}
				return 0;
			}
		};
		//dto.stream().filter()
		System.out.println("\n-------Using comparator-----");
		Collections.sort(dto, comp);
		System.out.println(dto);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		List<String> list = new ArrayList<String>();
//		dto.stream  ().filter(runs->{
//			if(runs.getRuns() >300) {
//				list.add(runs.getName());
//				return true;
//			}
//			
//			return false;
//		}).collect(Collectors.toList());
//		Collections.sort(list);
//		list.forEach(System.out::println);
		
//		 List<TournamentDto> list = dto.stream().filter(runs->runs.getRuns()>300)
//		.sorted(Comparator.comparing(TournamentDto::getName).reversed()).collect(Collectors.toList());
//		
//		list.forEach(System.out::println);

	}
}
