package com.example.Spring1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello")
	//Antwortet auf localhost/hello GET request
	//Browser GET /hello -> TomCat -> Spring Dispatcher -> HelloController
	public String helloWorld() {
		return "Hello World";
	}
	
}
