package com.laptrinhjavaweb.controller.thongTinWeb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web")
public class ThongTinWebController {

    @GetMapping("/all")
    public String all() {
        return "thongtinWeb/all";
    }

    @GetMapping("/account")
    public String account() {
        return "thongtinWeb/account";
    }

    @GetMapping("/chothanhtoan")
    public String chothanhtoan() {
        return "thongtinWeb/chothanhtoan";
    }

    @GetMapping("/hoanthanh")
    public String hoanthanh() {
        return "thongtinWeb/hoanthanh";
    }

    @GetMapping("/vanchuyen")
    public String vanchuyen() {
        return "thongtinWeb/vanchuyen";
    }

    @GetMapping("/danggiao")
    public String danggiao() {
        return "thongtinWeb/danggiao";
    }

    @GetMapping("/dahuy")
    public String dahuy() {
        return "thongtinWeb/dahuy";
    }


}