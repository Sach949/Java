package com.xworkz.encapassign.things;

public class Classroom {

	protected String className;
	protected int totalSeats;
	protected String firstSession;
	protected int totalStudents;
	protected boolean haveBlackboard;
	
	public Classroom(String className, int totalSeats, String firstSession, int totalStudents, boolean haveBlackboard) {
		this.className = className;
		this.totalSeats = totalSeats;
		this.firstSession = firstSession;
		this.totalStudents = totalStudents;
		this.haveBlackboard = haveBlackboard;
	}
	
	@Override
	public String toString() {
		return "Name of the classroom: "+this.className+"\nTotal seats: "+this.totalSeats+"\nFirst Session subject: "+this.firstSession
				+"\nTotal students in the class: "+this.totalStudents+"\nClass Has Blackboard: "+this.haveBlackboard;
		
	}
}
