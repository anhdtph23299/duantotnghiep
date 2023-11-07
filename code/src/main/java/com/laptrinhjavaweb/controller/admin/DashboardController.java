package com.laptrinhjavaweb.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class DashboardController {

    @GetMapping("/dashboards")
    public String dashboard() {
        return "admin/dashboard";
    }

    @GetMapping("/khachhang")
    public String khachhang() {
        return "admin/khachhang";
    }

    @GetMapping("/createKH")
    public String createKH() {
        return "admin/createKH";
    }

    @GetMapping("/updateKH/{id}")
    public String updateKH() {
        return "admin/updateKH";
    }

    @GetMapping("/nhanvien")
    public String nhanvien() {
        return "admin/nhanvien";
    }

    @GetMapping("/createNV")
    public String createNV() {
        return "admin/createNV";
    }

    @GetMapping("/updateNV/{id}")
    public String updateNV() {
        return "admin/updateNV";
    }

    @GetMapping("/detailNV/{id}")
    public String detailNV() {
        return "admin/detailNV";
    }

    @GetMapping("/profile")
    public String profile() {
        return "admin/profile";
    }

    @GetMapping("/setting_profile")
    public String setting_profile() {
        return "admin/setting_profile";
    }

    @GetMapping("/setting_banner")
    public String setting_banner() {
        return "admin/banner";
    }

    @GetMapping("/hoadon")
    public String hoadon() {
        return "admin/hoadon";
    }

    @GetMapping("/tichdiem")
    public String tichdiem() {
        return "admin/tichdiem";
    }

}


