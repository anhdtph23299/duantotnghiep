package com.example.demo.core.user.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/view/khachhang")
public class ViewKhachHangController {

    @GetMapping("")
    public String index(){
        return "admin/khachhang/index";
    }
}
