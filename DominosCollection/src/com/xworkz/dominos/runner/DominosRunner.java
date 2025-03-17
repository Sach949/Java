package com.xworkz.dominos.runner;

import com.xworkz.dominos.dto.DominosDto;
import com.xworkz.dominos.service.DominosService;
import com.xworkz.dominos.service.DominosServiceImpl;

public class DominosRunner {

	public static void main(String[] args) {
		
		DominosDto dominosDto = new DominosDto("Paneer", "Veg", "Whitefield", "200");
		DominosDto dominosDto1 = new DominosDto("Capsicum", "Veg", "Indiranagar", "200");
		DominosDto dominosDto2 = new DominosDto("Volcanos", "Veg", "Pune", "500");
		DominosDto dominosDto3 = new DominosDto("Veg loaded", "Veg", "Whitefield", "600");
		
		DominosService dominosService = new DominosServiceImpl();
		System.out.println("\n----Added---\n");
		dominosService.addDominos(dominosDto);
		dominosService.addDominos(dominosDto1);
		dominosService.addDominos(dominosDto2);
		dominosService.addDominos(dominosDto3);
		
		
		System.out.println("\n----Display---\n");
		dominosService.displayDominos();
		
		System.out.println("\n----update---\n");
		DominosDto update = new DominosDto("Chicken", "Non-Veg", "CV raman nagar", "300");
		dominosService.updateDominos(update);
		
		System.out.println("\n----Display---\n");
		dominosService.displayDominos();
		
		System.out.println("\n----Delete---\n");
		dominosService.deleteDominos("Paneer");
		
		
		System.out.println("\n----Display---\n");
		dominosService.displayDominos();
		
		System.out.println("\n----Search---\n");
		dominosService.searchDominos("Chicken");
	}
}
