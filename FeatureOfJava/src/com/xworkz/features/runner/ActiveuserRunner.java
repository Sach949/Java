package com.xworkz.features.runner;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.features.dto.ActiveUsersDto;
import com.xworkz.features.service.ActiveUserServiceImpl;

public class ActiveuserRunner {

	public static void main(String[] args) {
		List<ActiveUsersDto> userList = new ArrayList<ActiveUsersDto>();
		userList.add(new ActiveUsersDto(1, "Srinivasulu", false));
		userList.add(new ActiveUsersDto(1, "Purushottam", true));
		userList.add(new ActiveUsersDto(1, "Anuj", false));
		userList.add(new ActiveUsersDto(1, "Aman", true));
		userList.add(new ActiveUsersDto(1, "Abhishek", true));
		
		System.out.println("-----Status Check------");
		userList.stream().filter(user->user.isActive()==true).forEach(od->System.out.println(od));
		
		System.out.println("\n-----Name >5 Check------");
		userList.stream().filter(user->user.getName().length()>5).forEach(od->System.out.println(od));
		
	}
}
