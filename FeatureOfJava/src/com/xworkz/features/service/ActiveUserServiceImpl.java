package com.xworkz.features.service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.features.dto.ActiveUsersDto;
import com.xworkz.features.dto.OrdersDto;

public class ActiveUserServiceImpl {

	public List<ActiveUsersDto> getUserActivelist(List<ActiveUsersDto> dto){
		
		return dto.stream().filter(ActiveUsersDto::isActive).collect(Collectors.toList());
		
	}
	
//	public List<OrdersDto> getOrderDate(List<OrdersDto> dto){
//		LocalDate sevenDays = LocalDate.now().minusDays(7);
//		return dto.stream().filter(order->order.getOrderDate().isAfter(sevenDays))
//				.collect(Collectors.toList());
//	}
}
