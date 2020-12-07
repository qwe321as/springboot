package com.example.gradle.control;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class loginServiceImpl implements loginSer {
@Autowired
private loginrepository loginrepository;

@Override
public List<Map<String, Object>> getlogin() {
	return loginrepository.getlogin();
}
}
