package com.study.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("101")
	private int id;
	
	@Value("Tausif")
	private String name;
	
//	@Autowired   				// IOC me school ka obj hai tau inject that....
//	@Qualifier("vikas")		//qualifier tells which bean to inject...
	private School school;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, School school) {
		super();
		this.id = id;
		this.name = name;
		this.school = school;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public School getSchool() {
		return school;
	}

	@Autowired
	public void setSchool(School school) {
		System.out.println("Setter Method");
		this.school = school;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + school;
	}

}

//		object which will be created by spring is called bean.
//		
