package com.laptrinhjavaweb.ApiController;

import com.laptrinhjavaweb.model.request.ThayDoiSoLuongGioHangRequest;
import com.laptrinhjavaweb.repository.GioHangChiTietRepository;
import com.laptrinhjavaweb.service.GioHangChiTietService;
import com.laptrinhjavaweb.util.base.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/user/ghct")
public class ApiGioHangChiTietController {

    @Autowired
    GioHangChiTietService gioHangChiTietService;

    @GetMapping("/{id}")
    public ResponseObject dsGioHangChiTietByKhachHang(@PathVariable(name = "id")Long idkh){
        return new ResponseObject(gioHangChiTietService.dsGioHangChiTietByIdKh(idkh));
    }

    @GetMapping("/subtotal/{id}")
    public ResponseObject totalGioHangByKhachHang(@PathVariable(name = "id")Long idkh){
        return new ResponseObject(gioHangChiTietService.tongTien(idkh));
    }

    @PostMapping("/thaydoisoluong")
    public ResponseObject totalGioHangByKhachHang(@RequestBody ThayDoiSoLuongGioHangRequest request){
        return new ResponseObject(gioHangChiTietService.thayDoiSoLuong(request));
    }
}
