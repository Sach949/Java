package com.xworkz.features.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.features.dto.BasketBallDto;

public class BasketBallRunner {

	public static void main(String[] args) {
		List<BasketBallDto> list = new ArrayList<BasketBallDto>();
		list.add(new BasketBallDto("Sonu", "NYT", 1500));
		list.add(new BasketBallDto("Vishal", "Hyderabad", 900));
		list.add(new BasketBallDto("Anuj", "Pune", 1100));
		list.add(new BasketBallDto("Kamal", "Mumbai", 1200));
		list.add(new BasketBallDto("Abhijit", "Delhi", 700));
		list.add(new BasketBallDto("Vikas", "Chennai", 600));
		
		List<String> nameList = new ArrayList<String>();
		list.stream().filter(points->{
			if(points.getTotalPoints() >1000) {
				nameList.add(points.getName());
				return true;
			}
			return false;
		}).collect(Collectors.toList());
		
		
		
		System.out.println("\n---Comparator----");
		Collections.sort(list);
		list.forEach(System.out::println);
//		System.out.println(list);
		
		System.out.println("\n---Comparator----");
		Comparator<BasketBallDto> comp = new Comparator<BasketBallDto>() {
			
			@Override
			public int compare(BasketBallDto o1, BasketBallDto o2) {
				if(o1.getTotalPoints() > o2.getTotalPoints()) {
					return -1;
				}
				if(o1.getTotalPoints() < o2.getTotalPoints()) {
					return 1;
				}
				return 0;
			}
		};
		
		
		Collections.sort(list, comp);
		list.forEach(System.out::println);
		//System.out.println(list);
	}
}
