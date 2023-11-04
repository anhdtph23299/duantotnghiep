package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.KhachHangDTO;

public interface IKhachHangService {

    KhachHangDTO findByMaKHAndTrangthai(String maKhachHang, int trangThai);
}
