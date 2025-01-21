package com.xworkz.person.things;

import java.util.Objects;

public class PersonDetails {

	private int id;
	private String name;
	private int age;
	private String fahterName;
	private String address;
	private int mobileNo;

	// constructor
	public PersonDetails() {
		System.out.println("Default constructor");
	}

	public PersonDetails(int id, String name, int age, String fahterName, String address, int mobileNo) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.fahterName = fahterName;
		this.address = address;
		this.mobileNo = mobileNo;
	}

// getters and setters
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFahterName() {
		return fahterName;
	}

	public void setFahterName(String fahterName) {
		this.fahterName = fahterName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "PersonDetails [id=" + id + ", name=" + name + ", age=" + age + ", fahterName=" + fahterName
				+ ", address=" + address + ", mobileNo=" + mobileNo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, age, fahterName, id, mobileNo, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonDetails other = (PersonDetails) obj;
		return Objects.equals(address, other.address) && age == other.age
				&& Objects.equals(fahterName, other.fahterName) && id == other.id && mobileNo == other.mobileNo
				&& Objects.equals(name, other.name);
	}
	
	

}
