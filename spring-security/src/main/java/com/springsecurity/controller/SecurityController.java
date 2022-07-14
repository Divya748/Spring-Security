package com.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SecurityController {
	
	
	@GetMapping("/")
	public String homePage() {
		return "home-page";
	}
	
	@GetMapping("/admin")
	public String adminPage() {
		return "admin-page";
	}
	
	@GetMapping("/User")
	public String userPage() {
		return "home-page";
	}

}
