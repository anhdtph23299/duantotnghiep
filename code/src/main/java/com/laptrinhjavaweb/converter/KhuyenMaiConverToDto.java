package com.laptrinhjavaweb.converter;

import com.laptrinhjavaweb.dto.KhuyenMaiDto;
import com.laptrinhjavaweb.entity.KhuyenMai;
import org.springframework.stereotype.Component;

@Component
public class KhuyenMaiConverToDto {
    public KhuyenMaiDto convertToDto(KhuyenMai km){
        KhuyenMaiDto dto = new KhuyenMaiDto();
        dto.setId(km.getId());
        dto.setDsSanPhamKhuyenMai(km.getDsSanPhamKhuyenMai());
        dto.setMaKM(km.getMaKM());
        dto.setTenKM(km.getTenKM());
        dto.setLoaiKM(km.getLoaiKM());
        dto.setGiaTriGiam(km.getGiaTriGiam());
        dto.setNgayBatDau(km.getNgayBatDau());
        dto.setNgayKetThuc(km.getNgayKetThuc());
        dto.setNgayTao(km.getNgayTao());
        dto.setSoLuong(km.getSoLuong());
        dto.setGiaTriDonToiThieu(km.getGiaTriDonToiThieu());
        dto.setGiaTriGiamToiDa(km.getGiaTriGiamToiDa());
        dto.setMoTa(km.getMoTa());
        dto.setNguoiTao(km.getNguoiTao());
        dto.setNgaySua(km.getNgaySua());
        dto.setNguoisua(km.getNguoisua());
        dto.setTrangThai(km.getTrangThai());
        return dto;
    }
}
