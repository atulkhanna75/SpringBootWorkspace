package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWithViewAsThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithViewAsThymeleafApplication.class, args);
		System.out.println("Server running");
	}

}
