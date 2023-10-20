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
@Entity
@ToString
@Table(name = "danhmuc")
public class DanhMuc extends PrimaryEntity {

    @Column(name = "slug")
    private String slug;

    @Column(name = "tenDM")
    private String tenDM;

    @Column(name = "hienthitrangchu")
    private Integer hienThiTrangChu;

    @Column(name = "ngaytao")
    private Date ngayTao;

    @ManyToOne
    @JoinColumn(name = "nguoitao",insertable = false,updatable = false)
    private NhanVien nguoiTao;

    @Column(name = "ngaysua")
    private Date ngaySua;

    @ManyToOne
    @JoinColumn(name = "nguoisua",insertable = false,updatable = false)
    private NhanVien nguoiSua;

    @Column(name = "trangthai")
    private Integer trangThai;

//    @ManyToOne
//    @JoinColumn(name = "iddanhmuc",insertable = false,updatable = false)
//    private DanhMuc danhMuc;

//    @OneToMany(mappedBy = "danhMuc", cascade = CascadeType.REMOVE)
//    private List<DanhMuc> danhMucList = new ArrayList<>();

    @OneToMany(mappedBy = "danhMuc", cascade = CascadeType.REMOVE)
    private List<SanPham> dsSanPham = new ArrayList<>();

}
