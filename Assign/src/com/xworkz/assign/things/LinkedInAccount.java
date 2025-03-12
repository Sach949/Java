package com.xworkz.assign.things;

import java.util.Objects;

public class LinkedInAccount {

    private int profileId;
    private String name;
    private String currentJobTitle;
    private String location;
    private int connections;
    
    public LinkedInAccount() {
    	System.out.println("Defualt Constructor");
    }
    
    
	public LinkedInAccount(int profileId, String name, String currentJobTitle, String location, int connections) {
		super();
		this.profileId = profileId;
		this.name = name;
		this.currentJobTitle = currentJobTitle;
		this.location = location;
		this.connections = connections;
	}


	public int getProfileId() {
		return profileId;
	}


	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCurrentJobTitle() {
		return currentJobTitle;
	}


	public void setCurrentJobTitle(String currentJobTitle) {
		this.currentJobTitle = currentJobTitle;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public int getConnections() {
		return connections;
	}


	public void setConnections(int connections) {
		this.connections = connections;
	}


	@Override
	public String toString() {
		return "LinkedInAccount [profileId=" + profileId + ", name=" + name + ", currentJobTitle=" + currentJobTitle
				+ ", location=" + location + ", connections=" + connections + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(connections, currentJobTitle, location, name, profileId);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinkedInAccount other = (LinkedInAccount) obj;
		return connections == other.connections && Objects.equals(currentJobTitle, other.currentJobTitle)
				&& Objects.equals(location, other.location) && Objects.equals(name, other.name)
				&& profileId == other.profileId;
	}
    
	
    
}
