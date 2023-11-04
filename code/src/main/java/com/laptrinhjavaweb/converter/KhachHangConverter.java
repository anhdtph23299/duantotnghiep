package com.laptrinhjavaweb.converter;

import com.laptrinhjavaweb.dto.KhachHangDTO;
import com.laptrinhjavaweb.entity.KhachHang;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class KhachHangConverter {

    @Autowired
    private ModelMapper modelMapper;

    public KhachHangDTO convertToDTO (KhachHang entity){
        KhachHangDTO result = modelMapper.map(entity, KhachHangDTO.class);
        return result;
    }
}
