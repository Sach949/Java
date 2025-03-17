package com.xworkz.dominos.service;

import com.xworkz.dominos.dto.DominosDto;
import com.xworkz.dominos.repository.DominoRepository;
import com.xworkz.dominos.repository.DominosRepositoryImpl;
import com.xworkz.dominos.util.DominosUtil;


public class DominosServiceImpl implements DominosService{

	private DominoRepository dominoRep = new DominosRepositoryImpl();
	
	@Override
	public boolean addDominos(DominosDto dto) {
		System.out.println("Dto is: "+dto);
		if(dto != null) {
			if(DominosUtil.validate(dto.getPizzaName()) 
					&& DominosUtil.validate(dto.getLocation())
					&& DominosUtil.validate(dto.getPizzaType())) {
				System.out.println("Validation is done");
				
				if(this.dominoRep.addDominos(dto)) {
					System.out.println("Pizza Saved Successfully");
					return true;
				}else {
					System.out.println("Not saved");
					return true;
				}
			}
				
		}else {
			System.out.println("Dto is null");
		}
		return false;
	}

	@Override
	public boolean updateDominos(DominosDto dto) {
		
		return this.dominoRep.updateDominos(dto);
	}

	@Override
	public boolean deleteDominos(String values) {
		
		return this.dominoRep.deleteDominos(values);
	}

	@Override
	public void displayDominos() {
		this.dominoRep.displayDominos();
		
	}

	@Override
	public void searchDominos(String values) {
		this.dominoRep.deleteDominos(values);
		
	}

}
