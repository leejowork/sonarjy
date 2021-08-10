package com.sonarjystudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

	
	@GetMapping("/jesus")
	public String welcomeMap(){
		return "jesus welcome";
	}
}
