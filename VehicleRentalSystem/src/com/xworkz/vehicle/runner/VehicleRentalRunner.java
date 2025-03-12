package com.xworkz.vehicle.runner;

import com.xworkz.vehicle.constant.AvialabilityStatusConstant;
import com.xworkz.vehicle.constant.VehicleTypeConstant;
import com.xworkz.vehicle.dto.VehicleRentalDto;
import com.xworkz.vehicle.service.VehicleRentalService;
import com.xworkz.vehicle.service.VehicleServiceImpl;

public class VehicleRentalRunner {

	public static void main(String[] args) {
		System.out.println("Main Method");
		
		VehicleRentalDto vehicleRentalDto = new VehicleRentalDto();
		vehicleRentalDto.setVehicleId(1001);;
		vehicleRentalDto.setVehicleName("Innova");
		vehicleRentalDto.setVehicleType(VehicleTypeConstant.SUV.toString());
		vehicleRentalDto.setRentalPrice(3000);
		vehicleRentalDto.setAvailabilityStatus(AvialabilityStatusConstant.AVAILABLE.toString());
		vehicleRentalDto.setVehicleRegNo("KA0239WE45");
		
		VehicleRentalDto vehicleRentalDto1 = new VehicleRentalDto();
		vehicleRentalDto1.setVehicleId(1001);;
		vehicleRentalDto1.setVehicleName("Innova");
		vehicleRentalDto1.setVehicleType(VehicleTypeConstant.SUV.toString());
		vehicleRentalDto1.setRentalPrice(3000);
		vehicleRentalDto1.setAvailabilityStatus(AvialabilityStatusConstant.AVAILABLE.toString());
		vehicleRentalDto1.setVehicleRegNo("KA0239WE45");
		
		
		VehicleRentalService service = new VehicleServiceImpl();
		if(service.onSave(vehicleRentalDto)) {
			System.out.println("Vehicle Validated successfully");
		}else {
			System.out.println("Vehicle Validation is not successfull");
		}
		if(service.onSave(vehicleRentalDto1)) {
			System.out.println("Vehicle Validated successfully");
		}else {
			System.out.println("Vehicle Validation is not successfull");
		}
		
		System.out.println("\n---Read--\n");
		VehicleRentalDto[] dtos = service.readData();
		for(VehicleRentalDto vrDto: dtos) {
			System.out.println(vrDto);
		}
		
		System.out.println("\n---Update--\n");
		VehicleRentalDto updateVehicle = new VehicleRentalDto();
		updateVehicle.setVehicleId(1001);;
		updateVehicle.setVehicleName("Innova");
		updateVehicle.setVehicleType(VehicleTypeConstant.SUV.toString());
		updateVehicle.setRentalPrice(3000);
		updateVehicle.setAvailabilityStatus(AvialabilityStatusConstant.AVAILABLE.toString());
		updateVehicle.setVehicleRegNo("KA0239WE45");
		
		service.updateData(updateVehicle);
		
		System.out.println("\n---Read--\n");
		VehicleRentalDto[] update = service.readData();
		for(VehicleRentalDto vrDto: update) {
			System.out.println(vrDto);
		}
		
		System.out.println("\n---Delete--\n");
		service.deleteData(1001);
		System.out.println("\n---Read--\n");
		VehicleRentalDto[] delete = service.readData();
		for(VehicleRentalDto vrDto: delete) {
			System.out.println(vrDto);
		}
	}
}