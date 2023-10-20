package com.laptrinhjavaweb.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/giaoca")
public class GiaoCaController {

    @GetMapping("/moca")
    public String moca(){
        return "admin/giaoca/moca";
    }

    @GetMapping("/dongca")
    public String dongca(){
        return "admin/giaoca/dongca";
    }
}
