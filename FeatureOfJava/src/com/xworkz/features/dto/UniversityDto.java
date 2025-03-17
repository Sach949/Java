package com.xworkz.features.dto;

public class UniversityDto implements Comparable<UniversityDto> {

	private String name;
	private String universityName;
	private int marks;
	private int percentage;
	public UniversityDto(String name, String universityName, int marks, int percentage) {
		super();
		this.name = name;
		this.universityName = universityName;
		this.marks = marks;
		this.percentage = percentage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + marks;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + percentage;
		result = prime * result + ((universityName == null) ? 0 : universityName.hashCode());
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
		UniversityDto other = (UniversityDto) obj;
		if (marks != other.marks)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (percentage != other.percentage)
			return false;
		if (universityName == null) {
			if (other.universityName != null)
				return false;
		} else if (!universityName.equals(other.universityName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "UniversityDto [name=" + name + ", universityName=" + universityName + ", marks=" + marks
				+ ", percentage=" + percentage + "]";
	}
	
//	@Override
//	public int compareTo(UniversityDto o) {
//		if(this.getMarks() < o.getMarks() && this.getPercentage() < o.getPercentage()) {
//			return -1;
//		}
//		if(this.getMarks() > o.getMarks() && this.getPercentage() > o.getPercentage()) {
//			return 1;
//		}
//		return 0;
//	}
	
	@Override
	public int compareTo(UniversityDto o) {
		if(this.getMarks() < o.getMarks()) {
			return 1;
		}
		if(this.getMarks() > o.getMarks()) {
			return -1;
		}
		return 0;
	}
	
}