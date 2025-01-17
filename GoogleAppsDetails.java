package com.xworkz.assign.things;

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
		final int prime = 31;
		int result = 1;
		result = prime * result + ((appName == null) ? 0 : appName.hashCode());
		result = prime * result + ((appVersion == null) ? 0 : appVersion.hashCode());
		result = prime * result + totalUsers;
		result = prime * result + ((usedFor == null) ? 0 : usedFor.hashCode());
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
		GoogleAppsDetails other = (GoogleAppsDetails) obj;
		if (appName == null) {
			if (other.appName != null)
				return false;
		} else if (!appName.equals(other.appName))
			return false;
		if (appVersion == null) {
			if (other.appVersion != null)
				return false;
		} else if (!appVersion.equals(other.appVersion))
			return false;
		if (totalUsers != other.totalUsers)
			return false;
		if (usedFor == null) {
			if (other.usedFor != null)
				return false;
		} else if (!usedFor.equals(other.usedFor))
			return false;
		return true;
	}
	
	
}