package com.study.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		Student s1 = context.getBean("student", Student.class); // here 'student' is a name of bean, it has to be same
																// as class name with first letter small
		System.out.println(s1);
	}
}
