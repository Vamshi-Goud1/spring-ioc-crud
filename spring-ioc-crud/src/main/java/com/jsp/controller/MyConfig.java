package com.jsp.controller;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.jsp")
public class MyConfig {

	public EntityManagerFactory create() {
		return Persistence.createEntityManagerFactory("vg");
	}
	
}
