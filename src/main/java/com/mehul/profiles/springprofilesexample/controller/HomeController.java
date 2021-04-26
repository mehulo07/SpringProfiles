package com.mehul.profiles.springprofilesexample.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Value("${spring.message}")
	private String message;
	
	@GetMapping("/checkEnvironment")
	public String getMessage() {
		return message;
	}
}
