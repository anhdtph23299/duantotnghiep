package com.laptrinhjavaweb.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.laptrinhjavaweb.entity.base.PrimaryEntity;
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
    @Column(name = "ngaytao")
    private Date ngayDat=new Date();
    @Column(name = "tgdukiengh")
    private Date thoiGianDuKienGiaoHang;
    @Column(name = "ngaythanhtoan")
    private Date ngayThanhToan;
    @Column(name = "phuongthucthanhtoan")
    private Integer PhuongThucThanhToan;
    @Column(name = "idttmuahang")
    private Long thongTinMuaHang;
    @Column(name = "trangthai")
    private Integer trangThai=1;

    @ManyToOne
    @JoinColumn(name = "idkh")
    private KhachHang khachHang;

    @JsonProperty("getTrangThaiHD")
    public String getTrangThaiHD() {
        return trangThai==1?"Đang chờ":trangThai==2?"Hoàn thành":"Huỷ";
    }

    @ManyToOne
    @JoinColumn(name = "idlydo",insertable = false,updatable = false)
    private LiDoHuy liDoHuy;

}
