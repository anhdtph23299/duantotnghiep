package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.KhachHangDTO;

public interface IKhachHangService {

    KhachHangDTO findByMaKHAndTrangThai(String maKhachHang, int trangThai);
}
