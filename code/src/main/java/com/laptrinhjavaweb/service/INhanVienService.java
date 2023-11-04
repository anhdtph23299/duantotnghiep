package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.NhanVienDTO;

public interface INhanVienService {
    NhanVienDTO findByMaNVAndTrangthai(String maNhanVien, int status);
}
