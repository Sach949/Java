package com.xworkz.vehicle.repository;

import com.xworkz.vehicle.dto.VehicleRentalDto;

public class VehicleRepositoryImpl implements VehicleRentalRepository{

	private VehicleRentalDto[] vehicleRentalDto = new VehicleRentalDto[2];
	private int index = 0;
	
	
	@Override
	public boolean onSave(VehicleRentalDto dto) {
		if(this.index < this.vehicleRentalDto.length) {
			vehicleRentalDto[index] = dto;
			this.index++;
			System.out.println("Vehicle Saved successfully");
			return true;
		}
		return false;
	}

	@Override
	public VehicleRentalDto[] readData() {
		
		return vehicleRentalDto;
	}

	@Override
	public boolean deleteData(int id) {
		if(id>0) {
			for(int i =0; i < this.vehicleRentalDto.length; i++) {
				if(vehicleRentalDto[i] != null && vehicleRentalDto[i].getVehicleId() ==id) {
					System.out.println("Id match found");
					this.vehicleRentalDto[i] = null;
					System.out.println("Deleted successfully");
					return true;
				}else {
					System.out.println("Id match is not found");
				}
			}
		}else {
			System.out.println("Id is 0");
		}
		return false;
	}

	@Override
	public boolean updateData(VehicleRentalDto dto) {
		for(int i=0; i<this.vehicleRentalDto.length; i++) {
			if(vehicleRentalDto[i] != null && this.vehicleRentalDto[i].getVehicleId() == dto.getVehicleId()) {
				System.out.println("Id match found");
				this.vehicleRentalDto[i] = dto;
				System.out.println("Updated Successfully");
				System.out.println("Updated details are: "+dto);
			}else {
				System.out.println("Id match is not found");
			}
		}
		return false;
	}

}
