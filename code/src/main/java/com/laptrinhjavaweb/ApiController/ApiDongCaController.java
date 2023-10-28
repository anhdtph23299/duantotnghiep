package com.laptrinhjavaweb.ApiController;

import com.laptrinhjavaweb.service.DongCaService;
import com.laptrinhjavaweb.util.base.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin/dongca")
public class ApiDongCaController {

    @Autowired
    private DongCaService dongCaService;

    @GetMapping
    public ResponseObject getDongCa(){
        return new ResponseObject(dongCaService.getDongCa());
    }

    @GetMapping("/getDateTime")
    @ResponseBody
    public String getDateTime() {
        String dateTime = dongCaService.getCurrentDateTime();
        return dateTime;
    }
}
