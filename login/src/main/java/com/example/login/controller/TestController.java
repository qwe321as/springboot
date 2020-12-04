package com.example.login.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.login.model.login;

@RestController
public class TestController {

    @RequestMapping("/test1")
    public login test1(){

        login login = new login();

        login.setId("테스트아이디");
        return login;

    }
    
    @ResponseBody
    @RequestMapping("/test2")
    public login test2(){
    	
    	login login = new login();
    	
    	login.setId("테스트아이디");
    	return login;
    	
    }
    
}