package com.laptrinhjavaweb.entity;

import com.laptrinhjavaweb.entity.base.PrimaryEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.math.BigDecimal;
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
@Table(name = "chitietsanphamthuoctinh")
public class ChiTietSanPhamThuocTinh extends PrimaryEntity {
    @ManyToOne
    @JoinColumn(name = "idchitietsanpham",insertable = false,updatable = false)
    private ChiTietSanPham chiTietSanPham;

    @ManyToOne
    @JoinColumn(name = "idthuoctinh",insertable = false,updatable = false)
    private ThuocTinh thuocTinh;

    @Column(name = "giatri")
    private int giaTri;

    @Column(name = "gia")
    private BigDecimal gia;

    @Column(name = "hinhanh")
    private String hinhAnh;

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

    @OneToMany(mappedBy = "chiTietSanPhamThuocTinh")
    private List<KhachHangYeuThichSanPham> khachHangYeuThichSanPham  = new ArrayList<>();

    @OneToMany(mappedBy = "chiTietSanPhamThuocTinh")
    private List<KhuyenMaiSanPham> khuyenMaiSanPham  = new ArrayList<>();



}
