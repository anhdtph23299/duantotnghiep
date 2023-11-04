package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.NhanVienDTO;

public interface INhanVienService {

    NhanVienDTO findByMaNVAndTrangThai(String maNhanVien, int status);
}
