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
<<<<<<< HEAD
    @Column(name = "soluong")
    private int soLuong;
=======

>>>>>>> 05656fde4f7200afb113438fb319a54853650308
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
<<<<<<< HEAD
    @Column(name = "nguoitao")
    private Long nguoiTao;
    @Column(name = "ngaysua")
    private Date ngaySua;
    @Column(name = "nguoisua    ")
    private Long nguoiSua;
    @Column(name = "mota")
    private String moTa;
=======

    @Column(name = "soluong")
    private int soLuong;

    @Column(name = "giatridontoithieu")
    private Float giaTriDonToiThieu;
    @Column(name = "giatrigiamtoida")
    private Float giaTriGiamToiDa;
    @Column(name = "mota")
    private String moTa;

    @ManyToOne
    @JoinColumn(name = "nguoitao", insertable = false, updatable = false)
    private NhanVien nguoiTao;

    @Column(name = "ngaysua")
    private Date ngaySua;

    @ManyToOne
    @JoinColumn(name = "nguoisua", insertable = false, updatable = false)
    private NhanVien nguoisua;

    @OneToMany(mappedBy = "khuyenMai")
    private List<SanPhamGiamGia> dsSanPhamKhuyenMai = new ArrayList<>();
>>>>>>> 05656fde4f7200afb113438fb319a54853650308
}