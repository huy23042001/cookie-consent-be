package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		System.setProperty("jna.library.path", "/usr/lib/x86_64-linux-gnu/");
		SpringApplication.run(DemoApplication.class, args);
	}

}
