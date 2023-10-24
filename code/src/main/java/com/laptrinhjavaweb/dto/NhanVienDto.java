package com.laptrinhjavaweb.dto;

import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString


public class NhanVienDto {


    private Long idNV;

    private String maNV;

    private String tenNV;

    private String sdt;

    private String email;

    private Boolean gioiTinh;

    private Date ngaySinh;

    private String hinhAnh;

    private int trangThai;

    private String diaChi;

    private String cccd;

    private Date ngayCap;

    private String noiCap;

    private String matKhau;

}
