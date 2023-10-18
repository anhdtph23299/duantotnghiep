package com.laptrinhjavaweb.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.laptrinhjavaweb.entity.base.PrimaryEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
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
    private String CCCD;

    @Column(name = "mota")
    private String moTa;

//    @OneToOne(mappedBy = "khachHang", cascade = CascadeType.ALL)
//    @PrimaryKeyJoinColumn
//    private GioHang gioHang;

    @OneToMany(mappedBy = "khachHang",cascade = CascadeType.ALL)
    @JsonIgnoreProperties("khachHang")
    private List<ThongTinMuaHang> thongTinMuaHang;
}
