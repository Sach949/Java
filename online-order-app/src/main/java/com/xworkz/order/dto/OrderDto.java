package com.xworkz.order.dto;

import java.util.Objects;

public class OrderDto {

	private int id;
	private String name;
	private String email;
	private int mobile;
	private String prodName;
	private int qty;
	private int price;
	private String addr;
	
	public OrderDto() {
		
	}
	
	public OrderDto(int id, String name, String email, int mobile, String prodName, int qty, int price, String addr) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.prodName = prodName;
		this.qty = qty;
		this.price = price;
		this.addr = addr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "OrderDto [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", prodName="
				+ prodName + ", qty=" + qty + ", price=" + price + ", addr=" + addr + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(addr, email, id, mobile, name, price, prodName, qty);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderDto other = (OrderDto) obj;
		return Objects.equals(addr, other.addr) && Objects.equals(email, other.email) && id == other.id
				&& mobile == other.mobile && Objects.equals(name, other.name) && price == other.price
				&& Objects.equals(prodName, other.prodName) && qty == other.qty;
	}
	
	
	
}
