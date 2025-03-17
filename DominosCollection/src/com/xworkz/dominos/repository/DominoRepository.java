package com.xworkz.dominos.repository;

import com.xworkz.dominos.dto.DominosDto;

public interface DominoRepository {

	boolean addDominos(DominosDto dto);
	
	boolean updateDominos(DominosDto dto);
	
	boolean deleteDominos(String values);
	
	void displayDominos();
	
	void searchDominos(String values);
	
}
