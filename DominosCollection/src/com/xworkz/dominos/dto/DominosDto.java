package com.xworkz.dominos.dto;

import java.util.Objects;

public class DominosDto {

	private String pizzaName;
	private String pizzaType;
	private String location;
	private String price;
	
	public DominosDto(String pizzaName, String pizzaType, String location, String price) {
		super();
		this.pizzaName = pizzaName;
		this.pizzaType = pizzaType;
		this.location = location;
		this.price = price;
	}
	public String getPizzaName() {
		return pizzaName;
	}
	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}
	public String getPizzaType() {
		return pizzaType;
	}
	public void setPizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		return Objects.hash(location, pizzaName, pizzaType, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DominosDto other = (DominosDto) obj;
		return Objects.equals(location, other.location) && Objects.equals(pizzaName, other.pizzaName)
				&& Objects.equals(pizzaType, other.pizzaType) && Objects.equals(price, other.price);
	}
	@Override
	public String toString() {
		return "DominosDto [pizzaName=" + pizzaName + ", pizzaType=" + pizzaType + ", location=" + location + ", price="
				+ price + "]";
	}
	
	
	
	
	
}
