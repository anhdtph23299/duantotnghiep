package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.converter.NhanVienConverter;
import com.laptrinhjavaweb.dto.NhanVienDTO;
import com.laptrinhjavaweb.entity.NhanVien;
import com.laptrinhjavaweb.repository.NhanVienRepository;
import com.laptrinhjavaweb.service.INhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NhanVienService implements INhanVienService {

    @Autowired
    private NhanVienRepository nhanVienRepository;

    @Autowired
    private NhanVienConverter nhanVienConverter;

    @Override
    public NhanVienDTO findByMaNVAndTrangThai (String maNhanVien, int status) {
        NhanVien nhanVienEntity = nhanVienRepository.findByMaNVAndTrangThai(maNhanVien, status);
        if(nhanVienEntity == null){
            return null;
        }
        return nhanVienConverter.convertToDTO(nhanVienEntity);
    }
}
