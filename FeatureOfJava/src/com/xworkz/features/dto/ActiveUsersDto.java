package com.xworkz.features.dto;

import java.util.Objects;

public class ActiveUsersDto {

	private int id;
	private String name;
	private boolean isActive;
	
	@Override
	public int hashCode() {
		return Objects.hash(id, isActive, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ActiveUsersDto other = (ActiveUsersDto) obj;
		return id == other.id && isActive == other.isActive && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "ActiveUsersDto [id=" + id + ", name=" + name + ", isActive=" + isActive + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public ActiveUsersDto(int id, String name, boolean isActive) {
		super();
		this.id = id;
		this.name = name;
		this.isActive = isActive;
	}
	
	
}
