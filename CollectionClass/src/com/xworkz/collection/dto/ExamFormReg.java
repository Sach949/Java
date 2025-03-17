package com.xworkz.collection.dto;

import java.util.Objects;

public class ExamFormReg {

	private String name;
	private String gender;
	private String maritalStatus;
	private boolean isEligible;
	private int marksInGraduation;
	
	public ExamFormReg() {
		
	}

	public ExamFormReg(String name, String gender, String maritalStatus, boolean isEligible, int marksInGraduation) {
		super();
		this.name = name;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.isEligible = isEligible;
		this.marksInGraduation = marksInGraduation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public boolean isEligible() {
		return isEligible;
	}

	public void setEligible(boolean isEligible) {
		this.isEligible = isEligible;
	}

	public int getMarksInGraduation() {
		return marksInGraduation;
	}

	public void setMarksInGraduation(int marksInGraduation) {
		this.marksInGraduation = marksInGraduation;
	}

	@Override
	public String toString() {
		return "ExamFormReg [name=" + name + ", gender=" + gender + ", maritalStatus=" + maritalStatus + ", isEligible="
				+ isEligible + ", marksInGraduation=" + marksInGraduation + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(gender, isEligible, maritalStatus, marksInGraduation, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExamFormReg other = (ExamFormReg) obj;
		return Objects.equals(gender, other.gender) && isEligible == other.isEligible
				&& Objects.equals(maritalStatus, other.maritalStatus) && marksInGraduation == other.marksInGraduation
				&& Objects.equals(name, other.name);
	}
	
	
	
}
