package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.converter.NhanVienConverter;
import com.laptrinhjavaweb.entity.NhanVienEntity;
import com.laptrinhjavaweb.repository.NhanVienRepository;
import com.laptrinhjavaweb.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private NhanVienRepository nhanVienRepository;

    @Autowired
    private NhanVienConverter userConverter;

    @Override
    public com.laptrinhjavaweb.dto.NhanVienDTO findOneByUserNameAndStatus(String maNhanVien, int status) {
        NhanVienEntity nhanVien = nhanVienRepository.findByMaNVAndTrangthai(maNhanVien, status);
        return userConverter.convertToDTO(nhanVien);
    }
}
