package com.example.gradle.control;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class loginController {
	
	@Autowired
	private loginSer loginser;

	@GetMapping("/login")
	public List<Map<String, Object>> getlogin() {
		return loginser.getlogin();
	}
}
