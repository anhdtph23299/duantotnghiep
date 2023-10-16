package com.laptrinhjavaweb.entity;

import com.laptrinhjavaweb.entity.base.PrimaryEntity;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
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
@Table(name = "chitietsanphamthuoctinh")
public class ChiTietSanPhamThuocTinh extends PrimaryEntity {
    @ManyToOne
    @JoinColumn(name = "idsanpham",insertable = false,updatable = false)
    private SanPham sanPham;

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
    @JoinColumn(name = "nguoiTao",insertable = false,updatable = false)
    private NhanVien nguoiTao;

    @Column(name = "ngaysua")
    private Date ngaySua;

    @ManyToOne
    @JoinColumn(name = "nguoiSua",insertable = false,updatable = false)
    private NhanVien nguoiSua;

    @Column(name = "trangthai")
    private int trangThai;

    @OneToMany(mappedBy = "chiTietSanPhamThuocTinh", cascade = CascadeType.REMOVE)
    private List<KhachHangYeuThichSanPham> dsKhachHangYeuThichSanPham  = new ArrayList<>();

    @OneToMany(mappedBy = "chiTietSanPhamThuocTinh", cascade = CascadeType.REMOVE)
    private List<KhuyenMaiSanPham> dsKhuyenMaiSanPham  = new ArrayList<>();

}
