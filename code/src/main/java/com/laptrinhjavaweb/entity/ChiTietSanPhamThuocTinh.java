package com.laptrinhjavaweb.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.laptrinhjavaweb.entity.base.PrimaryEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SuperBuilder
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
    @JoinColumn(name = "idtt",insertable = false,updatable = false)
    private ThuocTinh thuocTinh;

    @Column(name = "giatri")
    private String giaTri;

    @Column(name = "gia")
    private BigDecimal giaTien;

    @Column(name = "hinhanh")
    private String hinhAnh;

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

    @OneToMany(mappedBy = "chiTietSanPhamThuocTinh", cascade = CascadeType.REMOVE)
    private List<KhachHangYeuThichSanPham> dsKhachHangYeuThichSanPham  = new ArrayList<>();

    @OneToMany(mappedBy = "chiTietSanPhamThuocTinh", cascade = CascadeType.REMOVE)
    private List<SanPhamGiamGia> dsKhuyenMaiSanPham  = new ArrayList<>();

}
