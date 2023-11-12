package com.laptrinhjavaweb.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/sanpham")
public class SanPhamController {

    @GetMapping("/sanpham")
    public String sanpham(){
        return "admin/sanpham/sanpham";
    }

    @GetMapping("/createSP")
    public String createSP(){
        return "admin/sanpham/createSP";
    }

    @GetMapping("/updateSP")
    public String updateSP(){
        return "admin/sanpham/updateSP";
    }
}
