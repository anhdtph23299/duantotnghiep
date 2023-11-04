package com.laptrinhjavaweb.entity;

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
@Table(name = "nhanvien")
public class NhanVien extends PrimaryEntity {

    @Column(name = "manv")
    private String maNV;

    @Column(name = "tennv")
    private String tenNV;

    @Column(name = "sdt")
    private String sdt;

    @Column(name = "email")
    private String email;

    @Column(name = "gioitinh")
    private Boolean gioiTinh;

    @Column(name = "ngaysinh")
    private Date ngaySinh;

    @Column(name = "hinhanh")
    private String hinhAnh;

    @Column(name = "trangthai")
    private Integer trangThai;

    @Column(name = "diachi")
    private String diaChi;

    @Column(name = "cccd")
    private String cccd;

    @Column(name = "ngaycap")
    private Date ngayCap;

    @Column(name = "noicap")
    private String noiCap;

    @Column(name = "password")
    private String matKhau;



    @ManyToOne
    @JoinColumn(name = "idchucvu", referencedColumnName = "id")
    private ChucVu chucVu;

}
