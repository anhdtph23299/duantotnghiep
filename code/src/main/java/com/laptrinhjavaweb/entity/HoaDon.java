package com.laptrinhjavaweb.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.laptrinhjavaweb.entity.base.PrimaryEntity;
import com.laptrinhjavaweb.entity.enumentity.PhuongThucThanhToanEnum;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Date;
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

    @Column(name = "phuongthucthanhtoan")
    private Integer PhuongThucThanhToan;

    public void setPhuongThucThanhToan(PhuongThucThanhToanEnum pttt) {
        if (pttt == PhuongThucThanhToanEnum.CHUYENKHOAN){
            PhuongThucThanhToan = 2;
        }else {
            PhuongThucThanhToan = 1;
        }
    }

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


    @JsonProperty("getTrangThaiHD")
    public String getTrangThaiHD() {
        if (trangThai>9){//10 : Mới đặt trong giỏ hàng
            if (trangThai==10){
                return "Đang trong giỏ hàng";
            }else if (trangThai==11){
                return "Chờ gói hàng";
            }
        }

        return trangThai==1?"Đang chờ":trangThai==2?"Hoàn thành":"Huỷ";
    }


    @ManyToOne
    @JoinColumn(name = "idlydo",insertable = false,updatable = false)
    private LiDoHuy liDoHuy;

}
