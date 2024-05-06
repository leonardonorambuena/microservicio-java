package com.example.testingweb;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	public String greet() {
		String password = "123456";
		return "Hello, World";
	}
}
