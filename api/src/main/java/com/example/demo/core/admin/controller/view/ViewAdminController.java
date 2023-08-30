package com.example.demo.core.admin.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view/admin")
public class ViewAdminController {
    //Chỉ chuyển các view nên chỉ dùng GetMapping
    @GetMapping("/")
    public String home(){
     return "admin/trangchu";
    }

    @GetMapping("/sanpham")
    public String viewSanPham(){
        return "";
    }

}
