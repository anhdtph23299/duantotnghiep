package com.laptrinhjavaweb.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
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
@Table(name = "hoadon")
public class HoaDon extends PrimaryEntity {

    @Column(name = "mahoadon")
    private String maHoaDon;

    @Column(name = "khachthanhtoan")
    private Integer khachThanhToan;

    @Column(name = "ngaytao")
    private Date ngayDat=new Date();

    @Column(name = "tgdukiengh")
    private Date thoiGianDuKienGiaoHang;

    @Column(name = "ngaythanhtoan")
    private Date ngayThanhToan;

    @Column(name = "ngaynhanhang")
    private Date ngayNhanHang;

    @Column(name = "mota")
    private String moTa;

    @Column(name = "tongtienhang")
    private Double tongTienHang;

    @Column(name = "phuongthucthanhtoan")
    private Integer PhuongThucThanhToan;

    @Column(name = "trangthai")
    private Integer trangThai=1;

    @ManyToOne
    @JoinColumn(name = "idkh")
    private KhachHang khachHang;

    @ManyToOne
    @JoinColumn(name = "idttmuahang")
    private ThongTinMuaHang thongTinMuaHang;

    @ManyToOne
    @JoinColumn(name = "idnv")
    private NhanVien nhanVien;

    @ManyToOne
    @JoinColumn(name = "idkm")
    private KhuyenMai khuyenMai;

    @OneToMany(mappedBy = "hoaDon", fetch = FetchType.LAZY)
    private List<HoaDonChiTiet> hoaDonChiTiets = new ArrayList<>();

    @JsonProperty("getTrangThaiHD")
    public String getTrangThaiHD() {
        return trangThai==1?"Đang chờ":trangThai==2?"Hoàn thành":"Huỷ";
    }

    @ManyToOne
    @JoinColumn(name = "idlydo",insertable = false,updatable = false)
    private LiDoHuy liDoHuy;

}
