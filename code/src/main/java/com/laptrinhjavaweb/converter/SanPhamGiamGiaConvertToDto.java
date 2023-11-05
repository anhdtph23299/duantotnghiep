package com.laptrinhjavaweb.converter;

import com.laptrinhjavaweb.dto.SanPhamGiamGiaDto;
import com.laptrinhjavaweb.entity.SanPhamGiamGia;
import org.springframework.stereotype.Component;

@Component
public class SanPhamGiamGiaConvertToDto {
    public SanPhamGiamGia convertToEntity(SanPhamGiamGiaDto dto){
        SanPhamGiamGia spgg = new SanPhamGiamGia();
        spgg.setKhuyenMai(dto.getKhuyenMai());
        spgg.setSanPhamThuocTinh(dto.getSanPhamEntity());
        return spgg;
    }
    public SanPhamGiamGiaDto convertToDto(SanPhamGiamGia sp){
        SanPhamGiamGiaDto dto =new SanPhamGiamGiaDto();
        dto.setSanPhamEntity(sp.getSanPhamThuocTinh());
        dto.setKhuyenMai(sp.getKhuyenMai());
        return dto;
    }
}
