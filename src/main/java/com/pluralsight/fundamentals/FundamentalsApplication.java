package com.pluralsight.fundamentals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication // it bootstraps our application by starting spring. creates an instance of Spring application context. expose cmd line arg as spring properties
public class FundamentalsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FundamentalsApplication.class, args); // to identify primary spring component. args to expose cmd line components
		System.out.println("Hello Pluralsight!");
	}



}