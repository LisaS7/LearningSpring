package com.practice.firstspringbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class FirstSpringbootAppApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("weightCoach", Coach.class);
		System.out.println(theCoach.getExercise());
		System.out.println(theCoach.getMeal());
		SpringApplication.run(FirstSpringbootAppApplication.class, args);
	}

}
