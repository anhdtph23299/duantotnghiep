package com.laptrinhjavaweb.converter;

import com.laptrinhjavaweb.dto.ChucVuDTO;
import com.laptrinhjavaweb.entity.ChucVu;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChucVuConverter {
    @Autowired
    private ModelMapper modelMapper;

    public ChucVuDTO convertToDTO (ChucVu entity){
        ChucVuDTO result = modelMapper.map(entity, ChucVuDTO.class);
        return result;
    }

    public ChucVu convertToEntity (ChucVuDTO dto){
        ChucVu result = modelMapper.map(dto, ChucVu.class);
        return result;
    }
}
