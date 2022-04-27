package com.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.service.Service;

@RestController
public class Controller {
	
	@Autowired
	private Service service;
	
	@GetMapping(path="/creditcard/{id}")
	public String creditcard(@PathVariable("id") long number) {
		boolean ans =service.isValid(number);
		
		if(ans==true) {
			return "CreditCard is Valid";
		}
		else {
			return "Credit Card is invalid";
		}
	}

}
