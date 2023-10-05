package com.laptrinhjavaweb.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/dashboards")
public class DashboardController {

    @GetMapping
    public String dashboard(){
        return "admin/dashboard";
    }

    @GetMapping("/khachhang")
    public String khachhang(){
        return "admin/khachhang";
    }

    @GetMapping("/createKH")
    public String createKH(){
        return "admin/createKH";
    }

    @GetMapping("/updateKH")
    public String updateKH(){
        return "admin/updateKH";
    }

    @GetMapping("/nhanvien")
    public String nhanvien(){
        return "admin/nhanvien";
    }

    @GetMapping("/addnv")
    public String addnv(){
        return "admin/createNV";
    }

    @GetMapping("/updateNV")
    public String updateNV(){
        return "admin/updateNV";
    }
}
