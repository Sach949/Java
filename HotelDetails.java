public class HotelDetails {

	private int regId;
	private String name;
	private String location;
	private int noOfRooms;
	private double ratings;
	private boolean hasSwimmingPool;
	
	
	public HotelDetails() {
		System.out.println("Default Constructor");
	}


	public HotelDetails(int regId, String name, String location, int noOfRooms, double ratings,
			boolean hasSwimmingPool) {
		super();
		this.regId = regId;
		this.name = name;
		this.location = location;
		this.noOfRooms = noOfRooms;
		this.ratings = ratings;
		this.hasSwimmingPool = hasSwimmingPool;
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


	public int getNoOfRooms() {
		return noOfRooms;
	}


	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}


	public double getRatings() {
		return ratings;
	}


	public void setRatings(double ratings) {
		this.ratings = ratings;
	}


	public boolean isHasSwimmingPool() {
		return hasSwimmingPool;
	}


	public void setHasSwimmingPool(boolean hasSwimmingPool) {
		this.hasSwimmingPool = hasSwimmingPool;
	}


	@Override
	public String toString() {
		return "HotelDetails [regId=" + regId + ", name=" + name + ", location=" + location + ", noOfRooms=" + noOfRooms
				+ ", ratings=" + ratings + ", hasSwimmingPool=" + hasSwimmingPool + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (hasSwimmingPool ? 1231 : 1237);
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + noOfRooms;
		long temp;
		temp = Double.doubleToLongBits(ratings);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + regId;
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
		HotelDetails other = (HotelDetails) obj;
		if (hasSwimmingPool != other.hasSwimmingPool)
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
		if (noOfRooms != other.noOfRooms)
			return false;
		if (Double.doubleToLongBits(ratings) != Double.doubleToLongBits(other.ratings))
			return false;
		if (regId != other.regId)
			return false;
		return true;
	}

}
