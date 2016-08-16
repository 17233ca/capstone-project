package com.as.business;

import java.io.Serializable;

public class VideoUploadFacultyVO implements Serializable{

	private String course;
	private String title;
	private String link;
	private String descriptor;
	
	public VideoUploadFacultyVO() {
	}

	
	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getDescriptor() {
		return descriptor;
	}

	public void setDescriptor(String descriptor) {
		this.descriptor = descriptor;
	}
	
	
	
	
}
