public class DigilockerDto {

	private int lockerId;
	private String userName;
	private String email;
	private int phoneNumber;
	private long aadharNumber;
	private String password;
	private int totalStorageCapacityInMB;
	private int usedStorageInMB;
	private String createDate;
	private boolean isVerified;
	
	public DigilockerDto() {
		
	}

	public DigilockerDto(int lockerId, String userName, String email, int phoneNumber, long aadharNumber,
			String password, int totalStorageCapacityInMB, int usedStorageInMB, String createDate, boolean isVerified) {
		super();
		this.lockerId = lockerId;
		this.userName = userName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.aadharNumber = aadharNumber;
		this.password = password;
		this.totalStorageCapacityInMB = totalStorageCapacityInMB;
		this.usedStorageInMB = usedStorageInMB;
		this.createDate = createDate;
		this.isVerified = isVerified;
	}

	public int getLockerId() {
		return lockerId;
	}

	public void setLockerId(int lockerId) {
		this.lockerId = lockerId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public long getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getTotalStorageCapacityInMB() {
		return totalStorageCapacityInMB;
	}

	public void setTotalStorageCapacityInMB(int totalStorageCapacityInMB) {
		this.totalStorageCapacityInMB = totalStorageCapacityInMB;
	}

	public int getUsedStorageInMB() {
		return usedStorageInMB;
	}

	public void setUsedStorageInMB(int usedStorageInMB) {
		this.usedStorageInMB = usedStorageInMB;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public boolean isVerified() {
		return isVerified;
	}

	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

	@Override
	public String toString() {
		return "DigilockerDto [lockerId=" + lockerId + ", userName=" + userName + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", aadharNumber=" + aadharNumber + ", password=" + password
				+ ", totalStorageCapacityInMB=" + totalStorageCapacityInMB + ", usedStorageInMB=" + usedStorageInMB
				+ ", createDate=" + createDate + ", isVerified=" + isVerified + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (aadharNumber ^ (aadharNumber >>> 32));
		result = prime * result + ((createDate == null) ? 0 : createDate.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + (isVerified ? 1231 : 1237);
		result = prime * result + lockerId;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + phoneNumber;
		result = prime * result + totalStorageCapacityInMB;
		result = prime * result + usedStorageInMB;
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
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
		DigilockerDto other = (DigilockerDto) obj;
		if (aadharNumber != other.aadharNumber)
			return false;
		if (createDate == null) {
			if (other.createDate != null)
				return false;
		} else if (!createDate.equals(other.createDate))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (isVerified != other.isVerified)
			return false;
		if (lockerId != other.lockerId)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phoneNumber != other.phoneNumber)
			return false;
		if (totalStorageCapacityInMB != other.totalStorageCapacityInMB)
			return false;
		if (usedStorageInMB != other.usedStorageInMB)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
		
}
