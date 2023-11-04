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
//@Builder
@Entity
@ToString
@Table(name = "sanpham")
public class SanPham extends PrimaryEntity {
    @Column(name = "slug")
    private String slug;

    @Column(name = "TenSP")
    private String ten;

    @Column(name = "thongtinchitiet")
    private String thongTinChiTiet;

    @Column(name = "motasanpham")
    private String moTaSanPham;

    @Column(name = "sanphammoi")
    private int sanPhamMoi;

    @Column(name = "sanphamnoibat")
    private int sanPhamNoiBat;

    @Column(name = "sanphamxemnhieunhat")
    private int sanPhamXemNhieuNhat;

    @Column(name = "sanphamphobien")
    private int sanPhamPhoBien;

    @Column(name = "ngaytao")
    private Date ngayTao;

    @ManyToOne
    @JoinColumn(name = "nguoitao", insertable = false, updatable = false)
    private NhanVien nguoiTao;

    @Column(name = "ngaysua")
    private Date ngaySua;

    @ManyToOne
    @JoinColumn(name = "nguoisua", insertable = false, updatable = false)
    private NhanVien nguoiSua;

    @Column(name = "trangthai")
    private int trangThai;

    @ManyToOne
    @JoinColumn(name = "idDM", insertable = false, updatable = false)
    private DanhMuc danhMuc;

    @OneToMany(mappedBy = "sanPham", cascade = CascadeType.REMOVE)
    private List<ChiTietSanPhamThuocTinh> dsCTSPThuocTinh = new ArrayList<>();

}
