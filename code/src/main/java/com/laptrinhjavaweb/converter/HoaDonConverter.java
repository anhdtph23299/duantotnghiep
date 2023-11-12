package com.laptrinhjavaweb.converter;

import com.laptrinhjavaweb.dto.HoaDonChiTietDTO;
import com.laptrinhjavaweb.dto.HoaDonDTO;
import com.laptrinhjavaweb.entity.HoaDon;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class HoaDonConverter {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private HoaDonChiTietConverter hoaDonChiTietConverter;

    public HoaDonDTO convertToDTO (HoaDon entity){
        HoaDonDTO result = modelMapper.map(entity, HoaDonDTO.class);
        List<HoaDonChiTietDTO> hoaDonChiTietDTOS = entity.getHoaDonChiTiets().stream().map(
                item -> hoaDonChiTietConverter.convertToDTO(item)
        ).collect(Collectors.toList());
        result.setHoaDonChiTietDTO(hoaDonChiTietDTOS);
        result.setTongSoLuong(10);
        return result;
    }
    
}
