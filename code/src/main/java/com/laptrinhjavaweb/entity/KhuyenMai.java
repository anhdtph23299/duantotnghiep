package com.laptrinhjavaweb.entity;

import com.laptrinhjavaweb.entity.base.PrimaryEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
@Entity
@ToString
@Table(name = "khuyenmai")
public class KhuyenMai extends PrimaryEntity {
    @Column(name = "makm")
    private String maKM;
    @Column(name = "tenkm")
    private String tenKM;
    @Column(name = "loaikm")
    private int loaiKM;
    @Column(name = "loaigiamgia")
    private int loaiGiamGia;
    @Column(name = "soluong")
    private int soLuong;
    @Column(name = "giatrigiam")
    private Float giaTriGiam;
    @Column(name = "giatridontoithieu")
    private Float giaTriDonToiThieu;
    @Column(name = "giatrigiamtoida")
    private Float giaTriGiamToiDa;
    @Column(name = "ngaybatdau")
    private Date ngayBatDau;
    @Column(name = "ngayketthuc")
    private Date ngayKetThuc;
    @Column(name = "trangthai")
    private int trangThai;
    @Column(name = "ngaytao")
    private Date ngayTao;
    @Column(name = "nguoitao")
    private Long nguoiTao;
    @Column(name = "ngaysua")
    private Date ngaySua;
    @Column(name = "nguoisua    ")
    private Long nguoiSua;
    @Column(name = "mota")
    private String moTa;
}