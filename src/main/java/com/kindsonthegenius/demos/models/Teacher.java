package com.kindsonthegenius.demos.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {
	
	@Id
	private Integer teacherId;
	private String name;
	private String title;
	
	public Teacher() {
		
	}
	
	public Teacher(Integer teacherId, String name, String title) {
		super();
		this.teacherId = teacherId;
		this.name = name;
		this.title = title;
	}

	public Integer getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	

}
