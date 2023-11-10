package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.converter.NhanVienConverter;
import com.laptrinhjavaweb.dto.NhanVienDTO;
import com.laptrinhjavaweb.entity.NhanVienEntity;
import com.laptrinhjavaweb.repository.NhanVienRepository;
import com.laptrinhjavaweb.service.INhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NhanVienService implements INhanVienService {

    @Autowired
    private NhanVienRepository nhanVienRepository;

    @Autowired
    private NhanVienConverter nhanVienConverter;

    @Override
    public NhanVienDTO findByMaAndTrangthai (String ma, Integer trangthai) {
        NhanVienEntity nhanVienEntity = nhanVienRepository.findByMaAndTrangthai(ma, trangthai);
        if(nhanVienEntity == null){
            return null;
        }
        return nhanVienConverter.convertToDTO(nhanVienEntity);
    }

    @Override
    @Transactional
    public NhanVienDTO updateTrangThai(String ma, Integer trangthai) {
        try{
            NhanVienEntity nhanVienEntity = nhanVienRepository.findByMa(ma);
            if(nhanVienEntity == null){
                return null;
            }
            nhanVienEntity.setTrangthai(trangthai);
            nhanVienRepository.save(nhanVienEntity);
            NhanVienDTO nhanVienDTO = nhanVienConverter.convertToDTO(nhanVienEntity);
            nhanVienDTO.setId(nhanVienEntity.getId());
            return nhanVienDTO;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }

    @Override
    public NhanVienDTO findByMaAndMatkhau(String ma, String matkhau) {
        NhanVienEntity nhanVienEntity = nhanVienRepository.findByMaAndMatkhau(ma, matkhau);
        if(nhanVienEntity == null){
            return null;
        }
        return nhanVienConverter.convertToDTO(nhanVienEntity);
    }
}
