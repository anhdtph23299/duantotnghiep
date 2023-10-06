package com.laptrinhjavaweb.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

    @GetMapping("/trang-chu")
    public String homePage(){
        return "web/homepage";
    }

    @GetMapping("/shop")
    public String shop(){
        return "web/shop";
    }

    @GetMapping("/detail")
    public String detail(){
        return "web/detail";
    }

    @GetMapping("/checkout")
    public String checkout(){
        return "web/checkout";
    }

    @GetMapping("/cart")
    public String cart(){
        return "web/cart";
    }

    @GetMapping("/contact")
    public String contact(){
        return "web/contact";
    }

    @GetMapping("/shop_us")
    public String gioithieu(){
        return "web/shop_us";
    }
}
