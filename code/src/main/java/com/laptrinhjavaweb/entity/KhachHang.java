package com.laptrinhjavaweb.entity;

import com.laptrinhjavaweb.entity.base.PrimaryEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

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

    @NotBlank(message = "Tên khách hàng không được để trống")
    @Column(name = "tenkh")
    private String tenKH;

    @Column(name = "matkhau")
    private String matKhau;

    @NotBlank(message = "Số điện thoai không được để trống")
    @Column(name = "sdt")
    private String sdt;

    @NotBlank(message = "Email không được để trống")
    @Column(name = "email")
    private String email;

    @NotNull(message = "Giới tính không được để trống")
    @Column(name = "gioitinh")
    private Boolean gioiTinh;

    @NotNull(message = "Ngày sinh không được để trống")
    @Column(name = "ngaysinh")
    private Date ngaySinh;

    @NotNull(message = "Trạng thái không được để trống")
    @Column(name = "trangthai")
    private Integer trangThai;

    @NotBlank(message = "Địa chỉ không được để trống")
    @Column(name = "diachi")
    private String diaChi;

    @NotBlank(message = "CCCD không được để trống")
    @Column(name = "cccd")
    private String cccd;

    @NotBlank(message = "Mô tả không được để trống")
    @Column(name = "mota")
    private String moTa;

    @Column(name = "ngaydangky")
    private Date ngayDangKy;

    @OneToOne(mappedBy = "khachHang")
    private GioHang gioHang;

}