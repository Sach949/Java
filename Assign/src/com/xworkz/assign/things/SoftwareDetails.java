package com.xworkz.assign.things;

import java.util.Objects;

public class SoftwareDetails {

    private String softwareName;
    private String versionName;
    private String softwareType;
    private String usedFor;
	private String developer;
    
    
    public SoftwareDetails() {
    	System.out.println("Default Constructor");
    }
    
	public SoftwareDetails(String softwareName, String versionName, String softwareType, String usedFor, String developer) {
		super();
		this.softwareName = softwareName;
		this.versionName = versionName;
		this.softwareType = softwareType;
		this.usedFor = usedFor;
		this.developer = developer;
	}

	public String getSoftwareName() {
		return softwareName;
	}

	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}

	public String getVersionName() {
		return versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

	public String getSoftwareType() {
		return softwareType;
	}

	public void setSoftwareType(String softwareType) {
		this.softwareType = softwareType;
	}

	public String getUsedFor() {
		return usedFor;
	}

	public void setUsedFor(String usedFor) {
		this.usedFor = usedFor;
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	@Override
	public String toString() {
		return "SoftwareDetails [softwareName=" + softwareName + ", versionName=" + versionName + ", softwareType="
				+ softwareType + ", price=" + usedFor + ", developer=" + developer + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(developer, softwareName, softwareType, usedFor, versionName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SoftwareDetails other = (SoftwareDetails) obj;
		return Objects.equals(developer, other.developer) && Objects.equals(softwareName, other.softwareName)
				&& Objects.equals(softwareType, other.softwareType) && Objects.equals(usedFor, other.usedFor)
				&& Objects.equals(versionName, other.versionName);
	}

	
}
