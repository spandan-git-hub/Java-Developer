package com.example.notWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class NotWebApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(NotWebApplication.class, args);

		Dev obj = context.getBean(Dev.class);
		
		obj.run();
	}
}
