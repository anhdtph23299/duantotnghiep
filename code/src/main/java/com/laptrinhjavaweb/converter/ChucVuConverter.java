package com.laptrinhjavaweb.converter;

import com.laptrinhjavaweb.dto.ChucVuDTO;
import com.laptrinhjavaweb.entity.ChucVuEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChucVuConverter {
    @Autowired
    private ModelMapper modelMapper;

    public ChucVuDTO convertToDTO (ChucVuEntity entity){
        ChucVuDTO result = modelMapper.map(entity, ChucVuDTO.class);
        return result;
    }

    public ChucVuEntity convertToEntity (ChucVuDTO dto){
        ChucVuEntity result = modelMapper.map(dto, ChucVuEntity.class);
        return result;
    }
}
