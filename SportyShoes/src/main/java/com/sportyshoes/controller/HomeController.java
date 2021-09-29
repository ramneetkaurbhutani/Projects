package com.sportyshoes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String indexMapping() {
		return "<h1>Welcome to Sporty Shoes</h1>";
	}
	
}
