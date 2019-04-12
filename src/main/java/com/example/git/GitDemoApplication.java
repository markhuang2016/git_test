package com.example.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {

	public static void main(String[] args) {
		System.out.println("hello git");
		SpringApplication.run(GitDemoApplication.class, args);
	}

}
