package com.example.gradle.control;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public interface loginrepository {
	  List<Map<String, Object>> getlogin();
}
