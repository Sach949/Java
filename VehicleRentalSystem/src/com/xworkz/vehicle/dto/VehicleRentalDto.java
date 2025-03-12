package com.xworkz.vehicle.dto;

public class VehicleRentalDto {

	private int vehicleId;
	private String vehicleName;
	private String vehicleType;
	private double rentalPrice;
	private String AvailabilityStatus;
	private String VehicleRegNo;
	
	public VehicleRentalDto() {
		System.out.println("Default constructor");
	}

	public VehicleRentalDto(int vehicleId, String vehicleName, String vehicleType, double rentalPrice,
			String availabilityStatus, String vehicleRegNo) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
		this.vehicleType = vehicleType;
		this.rentalPrice = rentalPrice;
		AvailabilityStatus = availabilityStatus;
		VehicleRegNo = vehicleRegNo;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public double getRentalPrice() {
		return rentalPrice;
	}

	public void setRentalPrice(double rentalPrice) {
		this.rentalPrice = rentalPrice;
	}

	public String getAvailabilityStatus() {
		return AvailabilityStatus;
	}

	public void setAvailabilityStatus(String availabilityStatus) {
		AvailabilityStatus = availabilityStatus;
	}

	public String getVehicleRegNo() {
		return VehicleRegNo;
	}

	public void setVehicleRegNo(String vehicleRegNo) {
		VehicleRegNo = vehicleRegNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((AvailabilityStatus == null) ? 0 : AvailabilityStatus.hashCode());
		result = prime * result + ((VehicleRegNo == null) ? 0 : VehicleRegNo.hashCode());
		long temp;
		temp = Double.doubleToLongBits(rentalPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + vehicleId;
		result = prime * result + ((vehicleName == null) ? 0 : vehicleName.hashCode());
		result = prime * result + ((vehicleType == null) ? 0 : vehicleType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VehicleRentalDto other = (VehicleRentalDto) obj;
		if (AvailabilityStatus == null) {
			if (other.AvailabilityStatus != null)
				return false;
		} else if (!AvailabilityStatus.equals(other.AvailabilityStatus))
			return false;
		if (VehicleRegNo == null) {
			if (other.VehicleRegNo != null)
				return false;
		} else if (!VehicleRegNo.equals(other.VehicleRegNo))
			return false;
		if (Double.doubleToLongBits(rentalPrice) != Double.doubleToLongBits(other.rentalPrice))
			return false;
		if (vehicleId != other.vehicleId)
			return false;
		if (vehicleName == null) {
			if (other.vehicleName != null)
				return false;
		} else if (!vehicleName.equals(other.vehicleName))
			return false;
		if (vehicleType == null) {
			if (other.vehicleType != null)
				return false;
		} else if (!vehicleType.equals(other.vehicleType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "VehicleRentalDto [vehicleId=" + vehicleId + ", vehicleName=" + vehicleName + ", vehicleType="
				+ vehicleType + ", rentalPrice=" + rentalPrice + ", AvailabilityStatus=" + AvailabilityStatus
				+ ", VehicleRegNo=" + VehicleRegNo + "]";
	}
	
	
}
