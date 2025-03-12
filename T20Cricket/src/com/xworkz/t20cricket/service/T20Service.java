package com.xworkz.t20cricket.service;

import com.xworkz.t20cricket.dto.T20CricketDto;

public abstract class T20Service {

	public abstract String validateAndSave(T20CricketDto dto);

	public abstract String saveT20(T20CricketDto dto);

	public abstract void readT20();
}