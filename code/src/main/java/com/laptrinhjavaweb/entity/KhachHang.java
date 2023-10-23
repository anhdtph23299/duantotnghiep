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
@Table(name = "khachhang")
public class KhachHang  extends PrimaryEntity {

    @Column(name = "makh")
    private String maKH;

    @Column(name = "tenkh")
    private String tenKH;

    @Column(name = "sdt")
    private String sdt;

    @Column(name = "email")
    private String email;

    @Column(name = "gioitinh")
    private Boolean gioiTinh;

    @Column(name = "ngaysinh")
    private Date ngaySinh;

    @Column(name = "trangthai")
    private Integer trangThai;

    @Column(name = "diachi")
    private String diaChi;

    @Column(name = "cccd")
    private String cccd;

    @Column(name = "mota")
    private String moTa;

    //    @OneToOne(mappedBy = "khachHang", cascade = CascadeType.ALL)
//    @PrimaryKeyJoinColumn
//    private GioHang gioHang;

//    @OneToMany(mappedBy = "khachHang", cascade = CascadeType.REMOVE)
//    private List<KhachHangYeuThichSanPham> dsYeuThichSanPham  = new ArrayList<>();

}