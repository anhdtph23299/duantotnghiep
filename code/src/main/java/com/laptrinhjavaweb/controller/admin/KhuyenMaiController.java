package com.laptrinhjavaweb.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/khuyen-mai")
public class KhuyenMaiController {

    @GetMapping("")
    public String khuyen_mai(){
        return "admin/khuyen-mai/view";
    }

    @GetMapping("/detail")
    public String detail(){
        return "admin/khuyen-mai/detail-discount";
    }

    @GetMapping("/create")
    public String create(){
        return "admin/khuyen-mai/create";
    }

    @PostMapping("/save")
    public String save(){
        return "admin/khuyen-mai/view";
    }

    @GetMapping("/delete")
    public String delete(){
        return "admin/khuyen-mai/view";
    }

    @GetMapping("/edit")
    public String edit(){
        return "admin/khuyen-mai/create";
    }

    @PostMapping("/update")
    public String update(){
        return "admin/khuyen-mai/view";
    }
}
