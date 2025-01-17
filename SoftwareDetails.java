package com.xworkz.assign.things;

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
		final int prime = 31;
		int result = 1;
		result = prime * result + ((developer == null) ? 0 : developer.hashCode());
		result = prime * result + ((softwareName == null) ? 0 : softwareName.hashCode());
		result = prime * result + ((softwareType == null) ? 0 : softwareType.hashCode());
		result = prime * result + ((usedFor == null) ? 0 : usedFor.hashCode());
		result = prime * result + ((versionName == null) ? 0 : versionName.hashCode());
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
		SoftwareDetails other = (SoftwareDetails) obj;
		if (developer == null) {
			if (other.developer != null)
				return false;
		} else if (!developer.equals(other.developer))
			return false;
		if (softwareName == null) {
			if (other.softwareName != null)
				return false;
		} else if (!softwareName.equals(other.softwareName))
			return false;
		if (softwareType == null) {
			if (other.softwareType != null)
				return false;
		} else if (!softwareType.equals(other.softwareType))
			return false;
		if (usedFor == null) {
			if (other.usedFor != null)
				return false;
		} else if (!usedFor.equals(other.usedFor))
			return false;
		if (versionName == null) {
			if (other.versionName != null)
				return false;
		} else if (!versionName.equals(other.versionName))
			return false;
		return true;
	}
    
}
