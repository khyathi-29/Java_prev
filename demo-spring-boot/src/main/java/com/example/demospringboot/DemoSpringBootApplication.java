package com.example.demospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringBootApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoSpringBootApplication.class, args);
		System.out.println("Hello inside main");
		System.out.println("Hello inside main 2");
	}

}
