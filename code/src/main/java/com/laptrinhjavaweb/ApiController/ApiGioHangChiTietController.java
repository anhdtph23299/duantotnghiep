package com.laptrinhjavaweb.ApiController;

import com.laptrinhjavaweb.repository.GioHangChiTietRepository;
import com.laptrinhjavaweb.util.base.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/user/ghct")
public class ApiGioHangChiTietController {

    @Autowired
    GioHangChiTietRepository gioHangChiTietRepo;

    @GetMapping("/{id}")
    public ResponseObject dsGioHangChiTietByKhachHang(@PathVariable(name = "id")Long idkh){
        return new ResponseObject(gioHangChiTietRepo.dsGioHangChiTietByIdKh(idkh));
    }

    @GetMapping("/subtotal/{id}")
    public ResponseObject totalGioHangByKhachHang(@PathVariable(name = "id")Long idkh){
        return new ResponseObject(gioHangChiTietService.tongTien(idkh));
    }

    @GetMapping("/thaydoisoluong")
    public ResponseObject totalGioHangByKhachHang(@RequestParam(name = "sl")Integer soLuong
            ,@RequestParam(name = "idsp")Long idsp,@RequestParam(name = "idgh")Long idgh){
        return new ResponseObject(gioHangChiTietService.thayDoiSoLuong(idsp,idgh,soLuong));
    }
}
