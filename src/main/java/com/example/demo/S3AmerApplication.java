package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ImportAutoConfiguration
public class S3AmerApplication {

	public static void main(String[] args) {
		SpringApplication.run(S3AmerApplication.class, args);
	}

}
