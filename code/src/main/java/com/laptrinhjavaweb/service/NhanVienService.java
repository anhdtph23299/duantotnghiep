package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.entity.NhanVien;

import java.util.List;

public interface NhanVienService {

    List<NhanVien> getDsNhanVien();

    NhanVien insert(NhanVien nhanVien);

    void delete(Long id);
}
