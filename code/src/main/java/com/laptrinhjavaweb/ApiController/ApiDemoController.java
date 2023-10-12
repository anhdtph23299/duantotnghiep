package com.laptrinhjavaweb.ApiController;

import com.laptrinhjavaweb.service.DemoService;
import com.laptrinhjavaweb.util.base.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class ApiDemoController {

    @Autowired
    DemoService demoService;
    @GetMapping("")
    public ResponseObject helloworld(){
        return new ResponseObject(demoService.getall());
    }
}
