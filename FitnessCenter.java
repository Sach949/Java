public class FitnessCenterDto {

	private int regId;
	private String name;
	private String location;
	private String isJumbaAvailable;
	private int totalMemberships;
	
	
	public FitnessCenterDto() {
		
	}


	public FitnessCenterDto(int regId, String name, String location, String isJumbaAvailable, int totalMemberships) {
		super();
		this.regId = regId;
		this.name = name;
		this.location = location;
		this.isJumbaAvailable = isJumbaAvailable;
		this.totalMemberships = totalMemberships;
	}


	public int getRegId() {
		return regId;
	}


	public void setRegId(int regId) {
		this.regId = regId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getIsJumbaAvailable() {
		return isJumbaAvailable;
	}


	public void setIsJumbaAvailable(String isJumbaAvailable) {
		this.isJumbaAvailable = isJumbaAvailable;
	}


	public int getTotalMemberships() {
		return totalMemberships;
	}


	public void setTotalMemberships(int totalMemberships) {
		this.totalMemberships = totalMemberships;
	}


	@Override
	public String toString() {
		return "FitnessCenter [regId=" + regId + ", name=" + name + ", location=" + location + ", isJumbaAvailable="
				+ isJumbaAvailable + ", totalMemberships=" + totalMemberships + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isJumbaAvailable == null) ? 0 : isJumbaAvailable.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + regId;
		result = prime * result + totalMemberships;
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
		FitnessCenterDto other = (FitnessCenterDto) obj;
		if (isJumbaAvailable == null) {
			if (other.isJumbaAvailable != null)
				return false;
		} else if (!isJumbaAvailable.equals(other.isJumbaAvailable))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (regId != other.regId)
			return false;
		if (totalMemberships != other.totalMemberships)
			return false;
		return true;
	}
	
	
}
