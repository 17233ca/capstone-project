package com.as.business;

import java.io.Serializable;

public class SetMarksVO implements Serializable{

	private String userId;
	private String course;
	private int marks;
	
	public SetMarksVO() {
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
}
