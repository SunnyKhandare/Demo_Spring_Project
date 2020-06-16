package com.First_Spring.Demo_Spring_Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoSpringProjectApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(DemoSpringProjectApplication.class, args);

		/*
		String[] bean_names = applicationContext.getBeanDefinitionNames();

		for ( String name : bean_names ) {

			System.out.println( name );
		} */
	}

}
