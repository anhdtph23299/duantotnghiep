package com.laptrinhjavaweb.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class LoginAdminController {

    @GetMapping("/login")
    public String login(){
        return "loginAdmin/login";
    }

    @GetMapping("/forgotpassword")
    public String forgotPassword(){
        return "loginAdmin/forgotpassword";
    }

    @GetMapping("/changePassword")
    public String changePassword(){
        return "loginAdmin/changePass";
    }
}
