package com.example.login.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.login.model.login;

@RestController
public class loginmain {
	@GetMapping(path = "/main")
	public login loginmain(String id) {
		login login = new login();
		
		login.setId(id);
	return login;	
	}
}
