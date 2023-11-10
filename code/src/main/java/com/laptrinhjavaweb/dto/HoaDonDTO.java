package com.laptrinhjavaweb.dto;

import com.laptrinhjavaweb.entity.KhachHang;
import com.laptrinhjavaweb.entity.NhanVien;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class HoaDonDTO {

    private Long id;

    private String maHoaDon;

    private NhanVien nhanVien;

    private KhachHang khachHang;

    private Date ngayDat;

    private Double tongTienHang;

    private Integer PhuongThucThanhToan;

    private Integer trangThai;

}
