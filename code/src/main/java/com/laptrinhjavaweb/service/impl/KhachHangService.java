package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.converter.KhachHangConverter;
import com.laptrinhjavaweb.dto.KhachHangDTO;
import com.laptrinhjavaweb.entity.KhachHangEntity;
import com.laptrinhjavaweb.repository.KhachHangRepository;
import com.laptrinhjavaweb.service.IKhachHangService;
import com.laptrinhjavaweb.utils.GenerateStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class KhachHangService implements IKhachHangService {

    @Autowired
    private KhachHangRepository khachHangRepository;

    @Autowired
    private KhachHangConverter khachHangConverter;

    @Override
    public KhachHangDTO findByMaAndTrangthai(String ma, int trangThai) {
        KhachHangEntity khachHangEntity = khachHangRepository.findByMaAndTrangthai(ma, trangThai);
        if(khachHangEntity == null){
            return null;
        }
        return khachHangConverter.convertToDTO(khachHangEntity);
    }

    @Override
    @Transactional
    public KhachHangDTO save(KhachHangDTO khachHangDTO) {
        khachHangDTO.setMa(GenerateStringUtils.generateMa(khachHangDTO.getTen()));
        KhachHangEntity khachHangEntity = khachHangConverter.convertToEntity(khachHangDTO);
        khachHangRepository.save(khachHangEntity);
        khachHangDTO.setId(khachHangEntity.getId());
        return khachHangDTO;
    }

    @Override
    public KhachHangDTO findByMaAndMatkhau(String ma, String matkhau) {
        KhachHangEntity khachHangEntity = khachHangRepository.findByMaAndMatkhau(ma, matkhau);
        if(khachHangEntity == null){
            return null;
        }
        return khachHangConverter.convertToDTO(khachHangEntity);
    }

}
