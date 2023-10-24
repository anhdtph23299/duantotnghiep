package com.laptrinhjavaweb.ApiController;

import com.laptrinhjavaweb.dto.KhachHangDto;
import com.laptrinhjavaweb.dto.LoginDto;
import com.laptrinhjavaweb.dto.LoginMessage;
import com.laptrinhjavaweb.dto.NhanVienDto;
import com.laptrinhjavaweb.entity.KhachHang;
import com.laptrinhjavaweb.entity.NhanVien;
import com.laptrinhjavaweb.service.KhachHangService;
import com.laptrinhjavaweb.service.NhanVienService;
import com.laptrinhjavaweb.util.base.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiLogin {
    @Autowired
    private NhanVienService nhanVienService;
    @Autowired
    private KhachHangService khachHangService;
    //    login nhan vienn
    @PostMapping("/admin/nhan-vien/register")
    public ResponseObject saveNhanVien(@RequestBody NhanVienDto nhanVienDto){
        NhanVien nhanVien = nhanVienService.addNhanVien(nhanVienDto);
        return new ResponseObject(nhanVien);
    }
    @PostMapping("/admin/login")
    public ResponseObject loginNhanVien(@RequestBody LoginDto loginDto){
        LoginMessage loginMessage = nhanVienService.loginKhachHang(loginDto);
        return new ResponseObject(loginMessage);
    }
    //    login
    @PostMapping("/khach-hang/register")
    public ResponseObject saveKhachHang(@RequestBody KhachHangDto khachHangDto){
        KhachHang khachHang = khachHangService.addKhachHang(khachHangDto);
        return new ResponseObject(khachHang);
    }
    @PostMapping("/login")
    public ResponseObject loginKhachHang(@RequestBody LoginDto loginDto){
        LoginMessage loginMessage = khachHangService.loginKhachHang(loginDto);
        return new ResponseObject(loginMessage);
    }
}
