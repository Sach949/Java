package com.xworkz.features.runner;

import java.time.Duration;
import java.time.LocalTime;

public class TimeCalculation {

	public static void main(String[] args) {
		LocalTime time = LocalTime.of(12, 0, 0);
		LocalTime ttime2 = LocalTime.of(14, 0, 0);
		Duration duration = Duration.between(time, ttime2);
		System.out.println(duration);
	}
}
