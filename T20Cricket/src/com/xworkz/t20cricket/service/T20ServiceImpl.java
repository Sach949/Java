package com.xworkz.t20cricket.service;

import com.xworkz.t20cricket.dto.T20CricketDto;

public class T20ServiceImpl extends T20Service {

	private T20CricketDto[] t20Dto = new T20CricketDto[2];
	private int index = 0;

	@Override
	public String validateAndSave(T20CricketDto dto) {

		if (dto != null) {
			if (dto.getMatchNumber() > 0) {
				System.out.println("validate and save match");
			} else {
				System.err.println("Invalid match number");
			}

			if (dto.getSeriesName() != null && dto.getSeriesName().length() > 3) {
				System.out.println("validate and save series name");
			} else {
				System.err.println("Either series name is null or less than 3 char");
			}

			if (dto.getSponsorName() != null && dto.getSponsorName().length() > 3) {
				System.out.println("validate and save Sponsor name");
			} else {
				System.err.println("Either Sponsor name is null or less than 3 char");
			}

			if (dto.getPlayedBtw() != null && dto.getPlayedBtw().length() > 3) {
				System.out.println("validate and save Match played between name");
			} else {
				System.err.println("Either Played between field name is null or less than 3 char");
			}

			if (dto.getTotalOversInAnInnings() >= 5) {
				System.out.println("An Innings of match is played");
			} else {
				System.err.println("Match is incomplete or called off");
			}

			if (dto.getNoOfOversBowlerCanBowl() <= 4) {
				System.out.println("A bowler can bowl max of 4 overs in an Innings");
			} else {
				System.err.println("Bowler can't bowl more than 4 overs");
			}

			if (dto.getOversInPowerPlay() <= 6 && dto.getOversInPowerPlay() >= 1) {
				System.out.println("Maximum 6 overs & min 1 over in powerplay");
			} else {
				System.err.println("Powerplay can't be more than 6 overs and less than 1");
			}

		} else {
			System.err.println("Dto is null");
		}
		return "Not saved";
	}

	public String saveT20(T20CricketDto dto) {

		if (this.index < this.t20Dto.length) {
			t20Dto[index] = dto;
			index++;
			System.out.println("T20 details are: " + dto);
			return "Saved successfully";
		} else {
			System.out.println("\nCannot Save because Array is full !!");

		}
		return "Not saved";
	}

	public void readT20() {
		for (int i = 0; i < t20Dto.length; i++) {
			System.out.println("T20 details at " + i + " position: " + t20Dto[i]);
		}
	}
}