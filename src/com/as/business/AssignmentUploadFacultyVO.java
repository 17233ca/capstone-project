package com.as.business;

import java.io.InputStream;


public class AssignmentUploadFacultyVO {

	private String assignmentCourse;
	private InputStream filePath;
	private String dueDate;
	private String time;
	private String dayTime;
	
	public AssignmentUploadFacultyVO() {
	}

	public String getAssignmentCourse() {
		return assignmentCourse;
	}

	public void setAssignmentCourse(String assignmentCourse) {
		this.assignmentCourse = assignmentCourse;
	}

	public InputStream getFilePath() {
		return filePath;
	}

	public void setFilePath(InputStream filePath) {
		this.filePath = filePath;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDayTime() {
		return dayTime;
	}

	public void setDayTime(String dayTime) {
		this.dayTime = dayTime;
	}

	
	
	
	
}
