package com.xworkz.javamap.runner;

import java.util.PriorityQueue;

import com.xworkz.taskmap.dto.CustomerDto;

public class CustomerPrioityrunner {

	public static void main(String[] args) {
		PriorityQueue<CustomerDto> priorityQueue = new PriorityQueue<CustomerDto>();
		priorityQueue.add(new CustomerDto(11, "Manoj", 1));
		priorityQueue.add(new CustomerDto(10, "Suman", 5));
		priorityQueue.add(new CustomerDto(12, "Varsha", 3));
		priorityQueue.add(new CustomerDto(13, "Ankit", 4));
		priorityQueue.add(new CustomerDto(14, "Vishal", 2));
		System.out.println(priorityQueue);
		
		while (!priorityQueue.isEmpty()) {
			System.out.println("List afer priority: "+priorityQueue.poll());
		}
		
		
	}
}
