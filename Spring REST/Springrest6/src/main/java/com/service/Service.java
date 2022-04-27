package com.service;

import org.springframework.stereotype.Component;

@Component
public class Service {

	public int Addition(int a, int b) {
		System.out.println(a + b);
		return a + b;
	}
	
	public int Subtraction(int a, int b) {
		System.out.println(a - b);
		return a - b;
	}
	
	public int Multiplication(int a, int b) {
		System.out.println(a * b);
		return a * b;
	}
	
	public double Division(int a, int b) {
		System.out.println(a / b);
		return a / b;
	}
}

