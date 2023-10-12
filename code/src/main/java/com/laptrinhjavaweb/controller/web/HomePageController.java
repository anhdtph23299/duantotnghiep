package com.laptrinhjavaweb.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;

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

    @GetMapping("/faqs")
    public String faqs(){
        return "web/faqs";
    }
}
