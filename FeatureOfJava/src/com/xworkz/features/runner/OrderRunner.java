package com.xworkz.features.runner;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.xworkz.features.dto.OrdersDto;

public class OrderRunner {

	public static void main(String[] args) {
		
		List<OrdersDto> order = new ArrayList<OrdersDto>();
		order.add(new OrdersDto(1, LocalDate.of(2025, 02, 20),50000, "Mobile", "Electronics", 25000, 123, "Credit"));
		order.add(new OrdersDto(2, LocalDate.of(2025, 02, 21),5000, "Matress", "Bed", 2500, 456, "Debit"));
		order.add(new OrdersDto(3, LocalDate.of(2025, 02, 06),750, "Java Book", "Books", 250, 145, "Credit"));
		order.add(new OrdersDto(4, LocalDate.of(2025, 02, 22),41000,"TV", "Electronics", 14000, 896, "Credit"));
		order.add(new OrdersDto(5, LocalDate.of(2025, 01, 01),21000,"Charger", "Electronics", 1500, 201, "Debit"));
		
		System.out.println("\n-----Order placed chaek------");
		LocalDate sevenDays = LocalDate.now().minusDays(7);
		Predicate<OrdersDto> pred = (orderList)->orderList.getOrderDate().isAfter(sevenDays);
		order.stream().filter(pred).forEach(od->System.out.println(od));
		
		System.out.println("\n-----Category check------");
		Predicate<OrdersDto> category = (orderList)->orderList.getProdCategory()=="Electronics";
		order.stream().filter(category).forEach(od->System.out.println(od));
		
		System.out.println("\n-----Transaction check------");
		Predicate<OrdersDto> transaction = (orderList)->orderList.getTransactionType()=="Credit";
		order.stream().filter(transaction).forEach(od->System.out.println(od));
		
		System.out.println("\n-----Amount check------");
		Predicate<OrdersDto> amount = (orderList)->orderList.getAmmount()>10000;
		order.stream().filter(amount).forEach(od->System.out.println(od));
		
		System.out.println("\n-----Getting first 3 item from the list------");
		List<OrdersDto> list = new ArrayList<OrdersDto>();
		order.stream().filter(odList->{
			if(odList.getOrderId() >0 && odList.getOrderDate() != null 
					&& odList.getAmmount()>0) {
				list.add(0, odList);
				//list.add(odList.getOrderDate());
				return true;
				}
			return false;
			
		}).collect(Collectors.toList());
		
		System.out.println(list);
		
	}
}
