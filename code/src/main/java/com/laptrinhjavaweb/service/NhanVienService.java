package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.entity.NhanVien;

import java.util.List;

public interface NhanVienService {

    List<NhanVien> getDsNhanVien();

    NhanVien findById(Long id);

    String update(NhanVien nhanVien);

    NhanVien insert(NhanVien nhanVien);

    void delete(Long id);
}
