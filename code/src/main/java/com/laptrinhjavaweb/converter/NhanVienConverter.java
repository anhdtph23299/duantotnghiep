package com.laptrinhjavaweb.converter;

import com.laptrinhjavaweb.dto.NhanVienDTO;
import com.laptrinhjavaweb.entity.NhanVienEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NhanVienConverter {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ChucVuConverter chucVuConverter;

    public NhanVienDTO convertToDTO (NhanVienEntity entity){
        NhanVienDTO result = modelMapper.map(entity, NhanVienDTO.class);
        result.setChucVuDTO(chucVuConverter.convertToDTO(entity.getChucVu()));
        return result;
    }

    public NhanVienEntity convertToEntity (NhanVienDTO dto) {
        NhanVienEntity result = modelMapper.map(dto, NhanVienEntity.class);
        result.setChucVu(chucVuConverter.convertToEntity(dto.getChucVuDTO()));
        return result;
    }
}
