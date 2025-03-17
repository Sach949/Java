package com.xworkz.features.dto;

import java.time.LocalDate;
import java.util.Objects;

public class OrdersDto {

	private int orderId;
	private LocalDate orderDate;
	private double ammount;
	private String productName;
	private String prodCategory;
	private int prodPrice;
	private int transactionId;
	private String transactionType;
	public OrdersDto(int orderId, LocalDate orderDate, double ammount, String productName, String prodCategory,
			int prodPrice, int transactionId, String transactionType) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.ammount = ammount;
		this.productName = productName;
		this.prodCategory = prodCategory;
		this.prodPrice = prodPrice;
		this.transactionId = transactionId;
		this.transactionType = transactionType;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public double getAmmount() {
		return ammount;
	}
	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProdCategory() {
		return prodCategory;
	}
	public void setProdCategory(String prodCategory) {
		this.prodCategory = prodCategory;
	}
	public int getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	@Override
	public String toString() {
		return "OrdersDto [orderId=" + orderId + ", orderDate=" + orderDate + ", ammount=" + ammount + ", productName="
				+ productName + ", prodCategory=" + prodCategory + ", prodPrice=" + prodPrice + ", transactionId="
				+ transactionId + ", transactionType=" + transactionType + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(ammount, orderDate, orderId, prodCategory, prodPrice, productName, transactionId,
				transactionType);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrdersDto other = (OrdersDto) obj;
		return Double.doubleToLongBits(ammount) == Double.doubleToLongBits(other.ammount)
				&& Objects.equals(orderDate, other.orderDate) && orderId == other.orderId
				&& Objects.equals(prodCategory, other.prodCategory) && prodPrice == other.prodPrice
				&& Objects.equals(productName, other.productName) && transactionId == other.transactionId
				&& Objects.equals(transactionType, other.transactionType);
	}
	
	
	
	
	
	
	
	
}
