package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	String message = System.getenv("welcome.message");

	@RequestMapping("/")
	public String index() {
		return "Hello GitHub Action " + message;
	}

}
