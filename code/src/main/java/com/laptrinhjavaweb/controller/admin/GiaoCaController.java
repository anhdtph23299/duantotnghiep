package com.laptrinhjavaweb.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/giaoca")
public class GiaoCaController {

    @GetMapping("/moca")
    public String moca(){
        return "admin/giaoca/moca";
    }

    @GetMapping("/dongca")
    public String dongca(){
        return "admin/giaoca/dongca";
    }

    @GetMapping("/thongke")
    public String thongke(){
        return "admin/giaoca/thongkegiaoca";
    }

    @GetMapping("/calamviec")
    public String calamviec(){
        return "admin/giaoca/calamviec";
    }

    @GetMapping("/createCLV")
    public String createCLV(){
        return "admin/giaoca/createCLV";
    }

    @GetMapping("/updateCLV/{id}")
    public String updateCLV(){
        return "admin/giaoca/updateCLV";
    }

    @GetMapping("/detailCLV/{id}")
    public String detailCLV(){
        return "admin/giaoca/detailCLV";
    }


}
