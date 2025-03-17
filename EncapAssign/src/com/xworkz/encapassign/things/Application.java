package com.xworkz.encapassign.things;

public class Application extends Object{

	protected String appName;
	protected String forpurpose;
	protected String developedBy;
	protected String version;
	protected String status;
	
	public Application(String appName, String forPurpose, String developedBy, String version, String status) {
		this.appName = appName;
		this.forpurpose = forPurpose;
		this.developedBy = developedBy;
		this.version = version;
		this.status = status;

	}
	
	@Override
	public String toString() {
		return "Name of the app is: "+this.appName+"\nPurpose: "+forpurpose+
				"\nDeveleoped By: "+developedBy+"\nVersion: "+version+"\nStatus: "+status;
	}
}
