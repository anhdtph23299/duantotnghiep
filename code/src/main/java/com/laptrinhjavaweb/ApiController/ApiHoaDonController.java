package com.laptrinhjavaweb.ApiController;

import com.laptrinhjavaweb.entity.HoaDon;
import com.laptrinhjavaweb.service.HoaDonService;
import com.laptrinhjavaweb.util.base.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin/hoadon")
public class ApiHoaDonController {

    @Autowired
    private HoaDonService hoaDonService;

    @GetMapping
    public ResponseObject getHoaDon(){
        return new ResponseObject(hoaDonService.getDsHoaDon());
    }



    @GetMapping("/getDateTime")
    @ResponseBody
    public String getDateTime() {
        String dateTime = hoaDonService.getCurrentDateTime();
        return dateTime;
    }
}
