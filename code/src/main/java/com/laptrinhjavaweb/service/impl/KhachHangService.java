package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.converter.KhachHangConverter;
import com.laptrinhjavaweb.dto.KhachHangDTO;
import com.laptrinhjavaweb.entity.KhachHang;
import com.laptrinhjavaweb.repository.KhachHangRepository;
import com.laptrinhjavaweb.service.IKhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KhachHangService implements IKhachHangService {

    @Autowired
    private KhachHangRepository khachHangRepository;

    @Autowired
    private KhachHangConverter khachHangConverter;

    @Override
    public KhachHangDTO findByMaKHAndTrangThai(String maKhachHang, int trangThai) {
        KhachHang khachHangEntity = khachHangRepository.findByMaKHAndTrangThai(maKhachHang, trangThai);
        if(khachHangEntity == null){
            return null;
        }
        return khachHangConverter.convertToDTO(khachHangEntity);
    }
}
