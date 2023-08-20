package com.hcl.spring.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hcl.spring.model.Country;
import com.hcl.spring.model.Person;

@Service
public class PersonClientImpl {// implements PersonClient {

	@Autowired
	RestTemplate restTemplate;

	final String ROOT_URI = "http://localhost:2020/JAXRSJsonCRUDExample/rest/countries";

	public List<Country> getAllPerson() {
		ResponseEntity<Country[]> response = restTemplate.getForEntity(ROOT_URI, Country[].class);
		return Arrays.asList(response.getBody());

	}

	public Country getById(int i) {
		ResponseEntity<Country> response = restTemplate.getForEntity(ROOT_URI + "/"+i, Country.class);
		return response.getBody();
	}

	
}
