package com.example.HelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@RequestMapping("/")  
	public String hello()   
	{  
	return "Hello world from Spring Boot App";  
	}  
}
