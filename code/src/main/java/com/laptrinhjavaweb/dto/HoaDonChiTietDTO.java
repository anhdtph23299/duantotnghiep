package com.laptrinhjavaweb.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class HoaDonChiTietDTO {

    private Long id;

    private HoaDonDTO hoaDonDTO;

    private BienTheDTO bienTheDTO;

    private SanPhamDTO sanPhamDTO;

    private Integer soLuong;

    private Double donGia;

    private Double thanhTien;
}
