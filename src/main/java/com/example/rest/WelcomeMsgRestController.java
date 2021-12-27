package com.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeMsgRestController {
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		String msg = "Welcome To Badal's World...!!";
		return msg;
	}

}
