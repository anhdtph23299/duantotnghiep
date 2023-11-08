package com.laptrinhjavaweb.converter;

import com.laptrinhjavaweb.dto.HoaDonDTO;
import com.laptrinhjavaweb.entity.HoaDon;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HoaDonConverter {

    @Autowired
    private ModelMapper modelMapper;

    public HoaDonDTO convertToDTO (HoaDon entity){
        HoaDonDTO result = modelMapper.map(entity, HoaDonDTO.class);
        return result;
    }
    
}
