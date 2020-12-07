package com.example.login.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.login.model.loginDao;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class hello {

	@GetMapping(path = "/helloWorld")
	public String helloWorld() {
		/*
		 * return String.format("%s %s", loginDao.selectName(),
		 * LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		 */
		 return String.format("%s", loginDao.selectName()); 
	}
}