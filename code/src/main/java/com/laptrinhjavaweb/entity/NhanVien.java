package com.laptrinhjavaweb.entity;

import com.laptrinhjavaweb.entity.base.PrimaryEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
@Builder
@Entity
@ToString
@Table(name = "nhanvien")
public class NhanVien extends PrimaryEntity {

    @Column(name = "makh")
    private String maKH;

    @Column(name = "tennv")
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

}
