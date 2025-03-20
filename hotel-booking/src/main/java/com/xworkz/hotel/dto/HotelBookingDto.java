package com.xworkz.hotel.dto;

import java.util.Objects;

public class HotelBookingDto {

	private String name;
	private String email;
	private int mobile;
	private String idCard;
	
	public HotelBookingDto() {
		System.out.println("Default const");
	}
	
	
	
	public HotelBookingDto(String name, String email, int mobile, String idCard) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.idCard = idCard;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getMobile() {
		return mobile;
	}



	public void setMobile(int mobile) {
		this.mobile = mobile;
	}



	public String getIdCard() {
		return idCard;
	}



	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}



	@Override
	public String toString() {
		return "HotelBookingDto [name=" + name + ", email=" + email + ", mobile=" + mobile + ", idCard=" + idCard + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(email, idCard, mobile, name);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HotelBookingDto other = (HotelBookingDto) obj;
		return Objects.equals(email, other.email) && Objects.equals(idCard, other.idCard) && mobile == other.mobile
				&& Objects.equals(name, other.name);
	}
	
	
	
}
