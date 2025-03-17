package com.xworkz.dominos.repository;

import java.util.LinkedList;

import com.xworkz.dominos.dto.DominosDto;

public class DominosRepositoryImpl implements DominoRepository {

	private LinkedList<DominosDto> list = new LinkedList<DominosDto>();
	
	
	@Override
	public boolean addDominos(DominosDto dto) {
		list.add(dto);
		System.out.println("Dominos is added : "+list);
		return false;
	}

	@Override
	public boolean updateDominos(DominosDto dto) {
		for (DominosDto dom : list) {
			if (dom.getPizzaName() != null && dom.getPizzaName().equals(dto.getPizzaName())) {
				System.out.println("Pizza is found");
				dom.setLocation(dto.getLocation());
				dom.setPizzaType(dto.getPizzaType());
				dom.setPrice(dto.getPrice());
				System.out.println("Pizza updated");
				return true;
			} else {
				System.out.println("Pizza does not exist");
			}
		}

		return false;
	}

	@Override
	public boolean deleteDominos(String values) {
		if (values != null) {
			for (DominosDto dom : list) {
				if (dom.getPizzaName() != null && dom.getPizzaName() == values) {
					list.remove(dom);
					System.out.println("Removed the Pizza : " + dom);
					return true;
				} else {
					System.out.println("Pizza does not exist");
				}
			}
		} else {
			System.out.println("Pizza is null");
		}
		return false;
	}

	@Override
	public void displayDominos() {
		if (list.isEmpty()) {
			System.out.println("Pizza is empty");
		} else {
			for (DominosDto dom : list) {
				System.out.println("Pizza is: " + dom);
			}
		}
		
	}

	@Override
	public void searchDominos(String values) {
		for (DominosDto dom : list) {
			if (dom.getPizzaName() != null && dom.getPizzaName() == values) {
				System.out.println("Pizza is found: " + dom);

			} else {
				System.out.println("No match is found for the Pizza");
			}
		}
	}
		
		
}
