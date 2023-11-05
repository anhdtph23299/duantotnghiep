package com.laptrinhjavaweb.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginWebController {

    @GetMapping("/login")
    public String login(){
        return "loginWeb/login";
    }

    @GetMapping("/register")
    public String register(){
        return "loginWeb/register";
    }

    @GetMapping("/forgotpassword")
    public String forgotpassword(){
        return "loginWeb/forgotpassword";
    }
}
