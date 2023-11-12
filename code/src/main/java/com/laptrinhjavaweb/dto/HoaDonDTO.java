package com.laptrinhjavaweb.dto;

import com.laptrinhjavaweb.entity.KhachHang;
import com.laptrinhjavaweb.entity.NhanVien;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
public class HoaDonDTO {

    private Long id;

    private String maHoaDon;

    private NhanVienDTO nhanVienDTO;

    private KhachHangDTO khachHangDTO;

    private Date ngayDat;

    private Double tongTienHang;

    private Integer PhuongThucThanhToan;

    private Integer trangThai;

    private List<HoaDonChiTietDTO> hoaDonChiTietDTO;

    private Integer tongSoLuong;

}
