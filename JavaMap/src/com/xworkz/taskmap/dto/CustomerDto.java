package com.xworkz.taskmap.dto;

import java.util.Objects;

public class CustomerDto implements Comparable<CustomerDto>{

	private int id;
	private String custName;
	private int priority;
	public CustomerDto(int id, String custName, int priority) {
		super();
		this.id = id;
		this.custName = custName;
		this.priority = priority;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	@Override
	public int hashCode() {
		return Objects.hash(custName, id, priority);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerDto other = (CustomerDto) obj;
		return Objects.equals(custName, other.custName) && id == other.id && priority == other.priority;
	}
	@Override
	public String toString() {
		return "CustomerDto [id=" + id + ", custName=" + custName + ", priority=" + priority + "]";
	}
	
	
	@Override
	public int compareTo(CustomerDto o) {
		if(this.priority < o.getPriority()) {
			return -1;
		}
		if(this.priority > o.getPriority()) {
			return 1;
		}
		return 0;
	}
	
	
	
}
