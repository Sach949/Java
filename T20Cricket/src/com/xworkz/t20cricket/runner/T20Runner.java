package com.xworkz.t20cricket.runner;

import com.xworkz.t20cricket.dto.T20CricketDto;
import com.xworkz.t20cricket.service.T20Service;
import com.xworkz.t20cricket.service.T20ServiceImpl;

public class T20Runner {

	public static void main(String[] args) {
		System.out.println("Main method");
		
		T20CricketDto t20Cricket = new T20CricketDto();
		t20Cricket.setMatchNumber(1);
		t20Cricket.setSeriesName("Nihadas Trophy");
		t20Cricket.setSponsorName("Paytm");
		t20Cricket.setPlayedBtw("India and Bangladesh");
		t20Cricket.setTotalOversInAnInnings(20);
		t20Cricket.setNoOfOversBowlerCanBowl(4);
		t20Cricket.setOversInPowerPlay(0);
		
		T20CricketDto t20Cricket1 = new T20CricketDto();
		t20Cricket1.setMatchNumber(2);
		t20Cricket1.setSeriesName("BGT");
		t20Cricket1.setSponsorName("Dream11");
		t20Cricket1.setPlayedBtw("India and Australia");
		t20Cricket1.setTotalOversInAnInnings(20);
		t20Cricket1.setNoOfOversBowlerCanBowl(4);
		t20Cricket1.setOversInPowerPlay(6);
		
		T20CricketDto t20Cricket2 = new T20CricketDto();
		t20Cricket2.setMatchNumber(3);
		t20Cricket2.setSeriesName("bilateral");
		t20Cricket2.setSponsorName("Chaini Khaini");
		t20Cricket2.setPlayedBtw("India and Pakistan");
		t20Cricket2.setTotalOversInAnInnings(20);
		t20Cricket2.setNoOfOversBowlerCanBowl(4);
		t20Cricket2.setOversInPowerPlay(4);
		
		System.out.println("T20 cricket rules are: "+t20Cricket);
		
		T20Service t20Service = new T20ServiceImpl();
		t20Service.validateAndSave(t20Cricket);
		
		System.out.println("\n-------Save-------\n");
		t20Service.saveT20(t20Cricket);
		t20Service.validateAndSave(t20Cricket1);
		t20Service.validateAndSave(t20Cricket2);
		
		System.out.println("\n-------Read-------\n");
		t20Service.readT20();
	}
}