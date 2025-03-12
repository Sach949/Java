package com.xworkz.vehicle.service;

import com.xworkz.vehicle.dto.VehicleRentalDto;

public interface VehicleRentalService {

	public abstract boolean onSave(VehicleRentalDto dto);
	
	VehicleRentalDto[] readData();
	
	boolean duplicateCheck(VehicleRentalDto dto);
	
	boolean deleteData(int id);
	
	boolean updateData(VehicleRentalDto dto);
}
