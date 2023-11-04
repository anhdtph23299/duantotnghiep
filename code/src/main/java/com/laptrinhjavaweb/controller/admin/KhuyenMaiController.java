package com.laptrinhjavaweb.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/khuyen-mai")
public class KhuyenMaiController {

    @GetMapping("")
    public String khuyen_mai() {
        return "admin/discount/view";
    }

<<<<<<< HEAD
    @GetMapping("/detail/{id}")
    public String detail(){
=======
    @GetMapping("/detail")
    public String detail() {
>>>>>>> 05656fde4f7200afb113438fb319a54853650308
        return "admin/discount/detail-discount";
    }

    @GetMapping("/create")
    public String create() {
        return "admin/discount/create";
    }

    @PostMapping("/save")
    public String save() {
        return "admin/discount/view";
    }

<<<<<<< HEAD
    @GetMapping("/delete/{id}")
    public String delete(){
        return "admin/discount/view";
    }

    @GetMapping("/edit/{id}")
    public String edit(){
        return "admin/discount/edit";
    }

    @PostMapping("/update/{id}")
    public String update(){
=======
    @GetMapping("/delete")
    public String delete() {
        return "admin/discount/view";
    }

    @GetMapping("/edit")
    public String edit() {
        return "admin/discount/create";
    }

    @PostMapping("/update")
    public String update() {
>>>>>>> 05656fde4f7200afb113438fb319a54853650308
        return "admin/discount/view";
    }
}
