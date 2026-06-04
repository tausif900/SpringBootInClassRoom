package com.study.springcore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class School {

	@Value("123")
	private int id;
	
	@Value("KJ.Khilnani")
	private String schoolName;

	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

	public School(int id, String schoolName) {
		super();
		this.id = id;
		this.schoolName = schoolName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@Override
	public String toString() {
		return id + " " + schoolName;
	}

}
