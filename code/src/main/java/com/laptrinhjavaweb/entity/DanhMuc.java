package com.laptrinhjavaweb.entity;

import com.laptrinhjavaweb.entity.base.PrimaryEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
@Builder
@Entity
@ToString
@Table(name = "danhmuc")
public class DanhMuc extends PrimaryEntity {

    @Column(name = "slug")
    private String slug;

    @Column(name = "ten")
    private String ten;

    @Column(name = "hienthitrangchu")
    private int hienThiTrangChu;

    @Column(name = "ngaytao")
    private Date ngayTao;

    @ManyToOne
    @JoinColumn(name = "idnv",insertable = false,updatable = false)
    private NhanVien nhanVienTao;

    @Column(name = "ngaysua")
    private Date ngaySua;

    @ManyToOne
    @JoinColumn(name = "idnv",insertable = false,updatable = false)
    private NhanVien nhanVienSua;

    @Column(name = "trangthai")
    private int trangThai;

    @ManyToOne
    @JoinColumn(name = "iddanhmuc",insertable = false,updatable = false)
    private DanhMuc danhMuc;

    @OneToMany(mappedBy = "danhMuc", cascade = CascadeType.REMOVE)
    private List<DanhMuc> danhMucList = new ArrayList<>();

    @OneToMany(mappedBy = "danhMuc", cascade = CascadeType.REMOVE)
    private List<SanPham> SanPhams = new ArrayList<>();

}
