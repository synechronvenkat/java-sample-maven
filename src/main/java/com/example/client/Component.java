package com.example.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
@org.springframework.stereotype.Component
public class Component {
	
	@Autowired
	
	private RestTemplate restTemplate;
	
	public void call()
	{
		System.out.println(restTemplate);
		ResponseEntity<Employee> details=restTemplate.getForEntity("http://localhost:8080/getEmpDetails", Employee.class);
		System.out.println(details.getBody().getName());
		
	}
	
	

}
