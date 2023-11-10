package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.KhachHangDTO;

public interface IKhachHangService {

    KhachHangDTO findByMaAndTrangthai(String ma, int trangThai);

    KhachHangDTO save(KhachHangDTO khachHangDTO);

    KhachHangDTO findByMaAndMatkhau(String ma, String matkhau);
}
