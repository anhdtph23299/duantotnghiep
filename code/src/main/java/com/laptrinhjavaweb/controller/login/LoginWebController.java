package com.laptrinhjavaweb.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class LoginWebController {

    @GetMapping("/login")
    public String login(){
        return "loginWeb/login";
    }

    @GetMapping("/register")
    public String register(){
        return "loginWeb/register";
    }

    @GetMapping("/changePass")
    public String changePass(){
        return "loginWeb/changePass";
    }
}
