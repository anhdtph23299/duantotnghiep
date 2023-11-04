package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.NhanVienDTO;

public interface IUserService {
    NhanVienDTO findOneByUserNameAndStatus(String maNhanVien, int status);
}
