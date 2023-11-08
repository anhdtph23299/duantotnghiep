package com.laptrinhjavaweb.ApiController;


import com.laptrinhjavaweb.service.HoaDonChiTietService;
import com.laptrinhjavaweb.service.HoaDonService;
import com.laptrinhjavaweb.util.base.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin/hoadonchitiet")
public class ApiHoaDonChiTietController {

    @Autowired
    private HoaDonChiTietService hoaDonChiTietService;

    @GetMapping("/detail/{id}")
    public ResponseObject getHoaDonChiTiet(@PathVariable(name = "id")Long idhd){
        return new ResponseObject(hoaDonChiTietService.getDsHoaDonChiTiet(idhd));
    }
}
