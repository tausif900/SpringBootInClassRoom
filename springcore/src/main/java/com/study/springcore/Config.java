package com.study.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.study.springcore")
public class Config {

	@Bean		//bean is a method level annotation.
	public School national() {
		return new School(123, "KJ.Khilnani");
	}

	@Bean
	public School vikas() {
		return new School(124, "Vikas School");
	}
}
