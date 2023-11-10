package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.NhanVienDTO;

public interface INhanVienService {
    NhanVienDTO findByMaAndTrangthai(String ma, Integer trangthai);

    NhanVienDTO updateTrangThai(String ma, Integer trangthai);

    NhanVienDTO findByMaAndMatkhau(String ma, String matkhau);
}
