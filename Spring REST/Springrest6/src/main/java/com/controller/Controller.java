package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.service.Service;

@RestController
@ResponseBody
public class Controller {
	
	@Autowired
	private Service service;
	
	@GetMapping("/addition/{num1}/{num2}")
	public String Addition(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
		System.out.println("Number1 = " +num1+ "/nNumber2 = " +num2);
		return ("Addition of " +num1+ "and" +num2+ "=" + service.Addition(num1,num2));
	}
	
	@GetMapping("/subtraction/{num1}/{num2}")
	public String Subtraction(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
		System.out.println("Number1 = " +num1+ "/nNumber2 = " +num2);
		return ("Subtraction of " +num1+ "by" +num2+ "=" + service.Subtraction(num1,num2));
	}
	
	@GetMapping("/multiplication/{num1}/{num2}")
	public String Multiplication(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
		System.out.println("Number1 = " +num1+ "/nNumber2 = " +num2);
		return ("Multiplication of " +num1+ "and" +num2+ "=" + service.Multiplication(num1,num2));
	}
	
	@GetMapping("/division/{num1}/{num2}")
	public String Division(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
		System.out.println("Number1 = " +num1+ "/nNumber2 = " +num2);
		return ("Division of " +num1+ "by" +num2+ "=" + service.Division(num1,num2));
	}
	
	
}
