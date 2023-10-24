package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.KhachHangDto;
import com.laptrinhjavaweb.dto.LoginDto;
import com.laptrinhjavaweb.dto.LoginMessage;
import com.laptrinhjavaweb.entity.KhachHang;

import java.util.List;

public interface KhachHangService {

    List<KhachHang> getDsKhachHang();

    KhachHang findById(Long id);

    String update(KhachHang khachHang);
    KhachHang insert(KhachHang khachHang);

    void delete(Long id);

    List<KhachHang> getSearchKhachHang( String maKH, String tenKH, String email, String sdt, String diaChi, String cccd);

//    login
    KhachHang addKhachHang(KhachHangDto khachHangDto);
    LoginMessage loginKhachHang(LoginDto loginDto);

}
