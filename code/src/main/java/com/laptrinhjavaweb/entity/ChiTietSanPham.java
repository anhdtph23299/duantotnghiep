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
@Table(name = "chitietsanpham")
public class ChiTietSanPham extends PrimaryEntity {
    @Column(name = "slug")
    private String slug;

    @Column(name = "ten")
    private String ten;

    @Column(name = "thongtinchitiet")
    private String thongTinChiTiet;

    @Column(name = "motasanpham")
    private String moTaSanPham;

    @Column(name = "sanphammoi")
    private int sanPhamMoi;

    @Column(name = "sanphamnoibat")
    private int sanPhamNoiBat;

    @Column(name = "sanphamnhieuluotxem")
    private int sanPhamNhieuLuotXem;

    @Column(name = "ngaytao")
    private Date ngayTao;

    @ManyToOne
    @JoinColumn(name = "nguoitao",insertable = false,updatable = false)
    private NhanVien nhanVienTao;

    @Column(name = "ngaysua")
    private Date ngaySua;

    @ManyToOne
    @JoinColumn(name = "nguoisua",insertable = false,updatable = false)
    private NhanVien nhanVienSua;

    @Column(name = "trangthai")
    private int trangThai;

    @ManyToOne
    @JoinColumn(name = "idsanpham",insertable = false,updatable = false)
    private SanPham sanPham;

    @OneToMany(mappedBy = "sanPham")
    private List<ChiTietSanPhamThuocTinh> chiTietSanPhamThuocTinh = new ArrayList<>();

}
