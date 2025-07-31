package com.example.FirstSpringApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstSpringAppApplication.class, args);
		Phone myPhone = context.getBean(Phone.class);
		myPhone.action();
		Phone friendsPhone = context.getBean(Phone.class);
		friendsPhone.action();


	}
}
