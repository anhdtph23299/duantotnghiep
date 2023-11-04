package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.converter.NhanVienConverter;
import com.laptrinhjavaweb.dto.NhanVienDTO;
import com.laptrinhjavaweb.entity.NhanVienEntity;
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
    public NhanVienDTO findByMaNVAndTrangthai (String maNhanVien, int status) {
        NhanVienEntity nhanVienEntity = nhanVienRepository.findByMaNVAndTrangthai(maNhanVien, status);
        if(nhanVienEntity == null){
            return null;
        }
        return nhanVienConverter.convertToDTO(nhanVienEntity);
    }
}
