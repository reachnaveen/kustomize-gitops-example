package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class HelloController {

	@Value("${welcome.message}")
    	private String greeterMessageFormat; 

	@RequestMapping("/")
	public String index() {
		return "Hello Green " + greeterMessageFormat;
	}

}
