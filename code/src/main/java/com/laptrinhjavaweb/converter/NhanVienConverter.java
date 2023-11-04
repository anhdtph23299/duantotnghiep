package com.laptrinhjavaweb.converter;

import com.laptrinhjavaweb.dto.NhanVienDTO;
import com.laptrinhjavaweb.entity.NhanVien;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NhanVienConverter {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ChucVuConverter chucVuConverter;

    public NhanVienDTO convertToDTO (NhanVien entity){
        NhanVienDTO result = modelMapper.map(entity, NhanVienDTO.class);
        result.setChucVuDTO(chucVuConverter.convertToDTO(entity.getChucVu()));
        return result;
    }

    public NhanVien convertToEntity (NhanVienDTO dto) {
        NhanVien result = modelMapper.map(dto, NhanVien.class);
        result.setChucVu(chucVuConverter.convertToEntity(dto.getChucVuDTO()));
        return result;
    }
}
