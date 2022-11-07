package com.practice.firstspringbootapp;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class FirstSpringbootAppApplication {

	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Coach theCoach = context.getBean("weightCoach", Coach.class);
		System.out.println(theCoach.getExercise());
		System.out.println(theCoach.getMeal());
	}

}
