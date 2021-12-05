package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.*"})
public class DemoSprinbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSprinbootApplication.class, args);
	}

}
