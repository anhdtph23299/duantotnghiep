package com.laptrinhjavaweb.dto;

import com.laptrinhjavaweb.entity.NhanVien;
import com.laptrinhjavaweb.entity.SanPhamGiamGia;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class KhuyenMaiDto {
    private Long id;
    private String maKM;
    private String tenKM;
    private Integer loaiKM;
    private Integer loaiGiamGia;
    private Float giaTriGiam;
    private Date ngayBatDau;
    private Date ngayKetThuc;
    private Date ngayTao;
    private Integer soLuong;
    private Float giaTriDonToiThieu;
    private Float giaTriGiamToiDa;
    private String moTa;
    private NhanVien nguoiTao;
    private Date ngaySua;
    private NhanVien nguoisua;
    private Integer trangThai;
    private List<SanPhamGiamGia> dsSanPhamKhuyenMai = new ArrayList<>();
}
