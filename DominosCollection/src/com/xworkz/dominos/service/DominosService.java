package com.xworkz.dominos.service;

import com.xworkz.dominos.dto.DominosDto;

public interface DominosService {

	boolean addDominos(DominosDto dto);
	
	boolean updateDominos(DominosDto dto);
	
	boolean deleteDominos(String values);
	
	void displayDominos();
	
	void searchDominos(String values);
}
