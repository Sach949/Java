package com.xworkz.vehicle.service;

import com.xworkz.vehicle.dto.VehicleRentalDto;
import com.xworkz.vehicle.repository.VehicleRentalRepository;
import com.xworkz.vehicle.repository.VehicleRepositoryImpl;
import com.xworkz.vehicle.util.VehicleRentalUtil;

public class VehicleServiceImpl implements VehicleRentalService{

	private VehicleRentalRepository repository = new VehicleRepositoryImpl();
	
	
	@Override
	public boolean onSave(VehicleRentalDto dto) {
		System.out.println("Dto is: "+dto);
		
		if(dto != null) {
			if(VehicleRentalUtil.validate(dto.getVehicleName()) 
					&& VehicleRentalUtil.validate(dto.getVehicleType()) 
					&& VehicleRentalUtil.validate(dto.getVehicleRegNo()) 
					&& VehicleRentalUtil.validate(dto.getAvailabilityStatus())) {
				System.out.println("Validation is done");
				if(!this.duplicateCheck(dto)) {
					System.out.println("No duplicate data is found");
					if(this.repository.onSave(dto)) {
						System.out.println("Vehicle rental Saved Successfully");
						return true;
					}else {
						System.out.println("not saved");
						return true;
					}
				}
				 else {
						System.out.println("duplicate data found");
					
					}
				
				if(!this.duplicateCheck(dto)) {
					System.out.println("No duplicate data found");
					if(this.repository.updateData(dto)) {
						System.out.println("Updated Successfully");
						return true;
					}
				}
				return true;
			}	
		}
		return false;
	}

	@Override
	public VehicleRentalDto[] readData() {
		
		return this.repository.readData();
	}

	@Override
	public boolean duplicateCheck(VehicleRentalDto dto) {
		VehicleRentalDto[] dtos = this.repository.readData();
		if(dtos != null) {
			for(VehicleRentalDto rentalDto : dtos) {
				if(rentalDto != null && rentalDto.equals(dto)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean deleteData(int id) {
		
		return this.repository.deleteData(id);
	}

	@Override
	public boolean updateData(VehicleRentalDto dto) {
		
		return this.repository.updateData(dto);
	}

}