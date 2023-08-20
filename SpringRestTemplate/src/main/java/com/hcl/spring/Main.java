package com.hcl.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpStatus;

import com.hcl.spring.config.AppConfig;
import com.hcl.spring.config.PersonClient;
import com.hcl.spring.config.PersonClientImpl;
import com.hcl.spring.model.Country;
import com.hcl.spring.model.Person;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		PersonClientImpl client = (PersonClientImpl) applicationContext.getBean(PersonClientImpl.class);

		System.out.println("Getting list of all people:");

		for (Country p : client.getAllPerson()) {
			System.out.println(p.getCountryName());
		}

		System.out.println("\nGetting person with ID 2");

		Country personById = client.getById(2);

		System.out.println(personById.getCountryName());

		
 
		applicationContext.close();
	}
}
