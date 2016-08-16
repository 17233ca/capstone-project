package com.as.business;

import java.io.Serializable;

public class GetMarksVO implements Serializable{

	private String course;
	private String marks;
	
	public GetMarksVO() {
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}
	
	
	
}
