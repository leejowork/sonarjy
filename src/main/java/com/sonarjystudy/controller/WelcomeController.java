package com.sonarjystudy.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

	
	@GetMapping("/jesus")
	public ResponseEntity<String> welcomeMap(){
		return new ResponseEntity<>("jesus welcome",HttpStatus.OK);
	}
}
