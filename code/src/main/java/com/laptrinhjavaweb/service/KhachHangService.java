package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.entity.KhachHang;

import java.util.List;

public interface KhachHangService {

    List<KhachHang> getDsKhachHang();

    String insert(KhachHang khachHang);

    void delete(Long id);

}
