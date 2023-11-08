package com.laptrinhjavaweb.controller.admin;

import com.laptrinhjavaweb.dto.MyUserDetail;
import com.laptrinhjavaweb.security.utils.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/giaodich")
public class HoaDonController {

    @GetMapping("/hoadon")
    public String hoadons(){
//        MyUserDetail myUserDetail = SecurityUtils.getPrincipal();
//        if(myUserDetail.getTrangThai() == 0){
//            return "redirect: /admin/giaoca/moca?isNotOpenShift";
//        }
        return "admin/hoadon/hoadon";
    }

    @GetMapping("/themhoadon")
    public String themhoadon(){
        return "admin/hoadon/themhoadon";
    }

    @GetMapping("/detailhoadon/{id}")
    public String detailhoadon(){
        return "admin/hoadon/detailhoadon";
    }
}
