package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.LoginDto;
import com.laptrinhjavaweb.dto.LoginMessage;
import com.laptrinhjavaweb.dto.NhanVienDto;
import com.laptrinhjavaweb.entity.NhanVien;

import java.util.List;

public interface NhanVienService {

    List<NhanVien> getDsNhanVien();

    NhanVien findById(Long id);

    String update(NhanVien nhanVien);

    NhanVien insert(NhanVien nhanVien);

    void delete(Long id);

    List<NhanVien> getSearchNhanVien(String maNV, String tenNV, String email, String sdt);

    //  login
    NhanVien addNhanVien(NhanVienDto dto);
    LoginMessage loginKhachHang(LoginDto loginDto);


}
