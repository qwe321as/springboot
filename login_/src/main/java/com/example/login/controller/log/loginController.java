package com.example.login.controller.log;


import com.example.login.service.log.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class loginController {

private loginService loginService;
    @Autowired
    loginController(
            loginService loginService
    ) {
        this.loginService = loginService;
    }

    @GetMapping("/login")
    @ResponseBody
    public List<Map<String, Object>> getlogin() {
        return loginService.getlogin();
    }
}
