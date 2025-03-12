package com.xworkz.assign.things;

import java.util.Objects;

public class GoogleAppsDetails {

	private String appName;
	private String appVersion;
	private int totalUsers;
	private String usedFor;
	
	public GoogleAppsDetails() {
		System.out.println("Defualt Constructor");
	}

	public GoogleAppsDetails(String appName, String appVersion, int totalUsers, String usedFor) {
		super();
		this.appName = appName;
		this.appVersion = appVersion;
		this.totalUsers = totalUsers;
		this.usedFor = usedFor;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public int getTotalUsers() {
		return totalUsers;
	}

	public void setTotalUsers(int totalUsers) {
		this.totalUsers = totalUsers;
	}

	public String getUsedFor() {
		return usedFor;
	}

	public void setUsedFor(String usedFor) {
		this.usedFor = usedFor;
	}

	@Override
	public String toString() {
		return "GoogleAppsDetails [appName=" + appName + ", appVersion=" + appVersion + ", totalUsers=" + totalUsers
				+ ", usedFor=" + usedFor + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(appName, appVersion, totalUsers, usedFor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GoogleAppsDetails other = (GoogleAppsDetails) obj;
		return Objects.equals(appName, other.appName) && Objects.equals(appVersion, other.appVersion)
				&& totalUsers == other.totalUsers && Objects.equals(usedFor, other.usedFor);
	}

	
	
}