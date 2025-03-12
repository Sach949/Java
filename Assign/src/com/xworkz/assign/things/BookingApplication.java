package com.xworkz.assign.things;

public class BookingApplication {

	private String appName;
	private String typesOfBooking;
	private String devName;
	private int totalUsers;
	private int avgBooking;
	
	public BookingApplication() {
		System.out.println("Default constructor");
	}

	public BookingApplication(String appName, String typesOfBooking, String devName, int totalUsers, int avgBooking) {
		super();
		this.appName = appName;
		this.typesOfBooking = typesOfBooking;
		this.devName = devName;
		this.totalUsers = totalUsers;
		this.avgBooking = avgBooking;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getTypesOfBooking() {
		return typesOfBooking;
	}

	public void setTypesOfBooking(String typesOfBooking) {
		this.typesOfBooking = typesOfBooking;
	}

	public String getDevName() {
		return devName;
	}

	public void setDevName(String devName) {
		this.devName = devName;
	}

	public int getTotalUsers() {
		return totalUsers;
	}

	public void setTotalUsers(int totalUsers) {
		this.totalUsers = totalUsers;
	}

	public int getAvgBooking() {
		return avgBooking;
	}

	public void setAvgBooking(int avgBooking) {
		this.avgBooking = avgBooking;
	}

	@Override
	public String toString() {
		return "BookingApplication [appName=" + appName + ", typesOfBooking=" + typesOfBooking + ", devName=" + devName
				+ ", totalUsers=" + totalUsers + ", avgBooking=" + avgBooking + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((appName == null) ? 0 : appName.hashCode());
		result = prime * result + avgBooking;
		result = prime * result + ((devName == null) ? 0 : devName.hashCode());
		result = prime * result + totalUsers;
		result = prime * result + ((typesOfBooking == null) ? 0 : typesOfBooking.hashCode());
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
		BookingApplication other = (BookingApplication) obj;
		if (appName == null) {
			if (other.appName != null)
				return false;
		} else if (!appName.equals(other.appName))
			return false;
		if (avgBooking != other.avgBooking)
			return false;
		if (devName == null) {
			if (other.devName != null)
				return false;
		} else if (!devName.equals(other.devName))
			return false;
		if (totalUsers != other.totalUsers)
			return false;
		if (typesOfBooking == null) {
			if (other.typesOfBooking != null)
				return false;
		} else if (!typesOfBooking.equals(other.typesOfBooking))
			return false;
		return true;
	}
	
}
