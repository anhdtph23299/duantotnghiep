package com.laptrinhjavaweb.entity;

import com.laptrinhjavaweb.entity.base.PrimaryEntity;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
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
    private int loaigiamgia;
    @Column(name = "giatrigiam")
    private Float giaTriGiam;
    @Column(name = "ngaybatdau")
    private Date ngayBatDau;
    @Column(name = "ngayketthuc")
    private Date ngayKetThuc;

    @Column(name = "ngaytao")
    private Date ngayTao;

    @ManyToOne
    @JoinColumn(name = "idnvtao",insertable = false,updatable = false)
    private NhanVien nhanVienTao;

    @Column(name = "ngaysua")
    private Date ngaySua;

    @ManyToOne
    @JoinColumn(name = "idnvsua",insertable = false,updatable = false)
    private NhanVien nhanVienSua;

    @Column(name = "trangthai")
    private int trangThai;

    @OneToMany(mappedBy = "khuyenMai")
    private List<KhuyenMaiSanPham> dsSanPhamKhuyenMai = new ArrayList<>();
}