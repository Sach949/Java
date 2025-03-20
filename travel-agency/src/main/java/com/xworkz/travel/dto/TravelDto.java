package com.xworkz.travel.dto;

import java.util.Objects;

public class TravelDto {

	private String name;
	private String email;
	private int mobile;
	private String idCard;
	private String dest;
	private String addr;
	private String loc;
	private String pack;
	
	public TravelDto() {
		
	}
	
	
	public TravelDto(String name, String email, int mobile, String idCard, String dest, String addr, String loc,
			String pack) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.idCard = idCard;
		this.dest = dest;
		this.addr = addr;
		this.loc = loc;
		this.pack = pack;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getMobile() {
		return mobile;
	}


	public void setMobile(int mobile) {
		this.mobile = mobile;
	}


	public String getIdCard() {
		return idCard;
	}


	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}


	public String getDest() {
		return dest;
	}


	public void setDest(String dest) {
		this.dest = dest;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	public String getLoc() {
		return loc;
	}


	public void setLoc(String loc) {
		this.loc = loc;
	}


	public String getPack() {
		return pack;
	}


	public void setPack(String pack) {
		this.pack = pack;
	}


	@Override
	public String toString() {
		return "TravelDto [name=" + name + ", email=" + email + ", mobile=" + mobile + ", idCard=" + idCard + ", dest="
				+ dest + ", addr=" + addr + ", loc=" + loc + ", pack=" + pack + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(addr, dest, email, idCard, loc, mobile, name, pack);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TravelDto other = (TravelDto) obj;
		return Objects.equals(addr, other.addr) && Objects.equals(dest, other.dest)
				&& Objects.equals(email, other.email) && Objects.equals(idCard, other.idCard)
				&& Objects.equals(loc, other.loc) && mobile == other.mobile && Objects.equals(name, other.name)
				&& Objects.equals(pack, other.pack);
	}
	
	
	
	
}
