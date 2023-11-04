package com.saiprajit123.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.saiprajit123.demo.repository")
public class CocoColaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CocoColaApplication.class, args);
		
	}

}
