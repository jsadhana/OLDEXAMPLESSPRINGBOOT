package com.hcl.spring.config;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.hcl.spring.model.Person;

public interface PersonClient {
	List<Person> getAllPerson();

	Person getById(Long id);

	
}
