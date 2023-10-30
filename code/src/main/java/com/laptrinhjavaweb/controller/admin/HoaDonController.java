package com.laptrinhjavaweb.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/giaodich")
public class HoaDonController {

    @GetMapping("/hoadon")
    public String hoadons(){
        return "admin/hoadon/hoadon";
    }

    @GetMapping("/themhoadon")
    public String themhoadon(){
        return "admin/hoadon/themhoadon";
    }

    @GetMapping("/detailhoadon")
    public String detailhoadon(){
        return "admin/hoadon/detailhoadon";
    }
}
