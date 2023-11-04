package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.entity.KhachHang;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.InputStream;
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


    void importCustomersFromExcel(InputStream inputStream);

    Workbook exportCustomersToExcel(List<KhachHang> customers);
}
