package com.xworkz.vehicle.repository;

import com.xworkz.vehicle.dto.VehicleRentalDto;

public interface VehicleRentalRepository {

	boolean onSave(VehicleRentalDto dto);
	
	VehicleRentalDto[] readData();
	
	boolean deleteData(int id);
	boolean updateData(VehicleRentalDto dto);
}
