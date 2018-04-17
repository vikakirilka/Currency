package org.ITstep.pojo;

public class Currency {

	private String name;
	private int course;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	public Currency(String name, int course) {
		super();
		this.name = name;
		this.course = course;
	}
	public Currency() {
		// TODO Auto-generated constructor stub
	}
	
	

}
