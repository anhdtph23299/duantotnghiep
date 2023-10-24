package com.laptrinhjavaweb.dto;

import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString

public class KhachHangDto {
    private Long id;
    private String maKH;
    private String tenKH;
    private String sdt;
    private String email;
    private Boolean gioiTinh;
    private Date ngaySinh;
    private Integer trangThai;
    private String diaChi;
    private String cccd;
    private String moTa;
    private String matKhau;
}
