package com.laptrinhjavaweb.controller.thongTinWeb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web")
public class ThongTinWebController {

    @GetMapping("/thongtinweb")
    public String all() {
        return "thongtinWeb/thongTinWeb";
    }


}
