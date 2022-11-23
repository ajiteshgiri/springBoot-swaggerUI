package com.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@GetMapping("all")
	public String getAllData() {
		
		return "Hello Ajitesh";
	}

}
