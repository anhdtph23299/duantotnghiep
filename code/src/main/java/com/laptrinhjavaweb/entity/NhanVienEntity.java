package com.laptrinhjavaweb.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "nhanvien")
public class NhanVienEntity extends BaseEntity {

    @Column(name = "manv")
    private String maNV;

    @Column(name = "matkhau")
    private String matKhau;

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

    @Column(name = "diachi")
    private String diaChi;

    @Column(name = "cccd")
    private String cccd;

    @Column(name = "ngaycap")
    private Date ngayCap;

    @Column(name = "noicap")
    private String noiCap;

    @ManyToOne
    @JoinColumn(name = "idchucvu", referencedColumnName = "id")
    private ChucVuEntity chucVu;

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public Date getNgayCap() {
        return ngayCap;
    }

    public void setNgayCap(Date ngayCap) {
        this.ngayCap = ngayCap;
    }

    public String getNoiCap() {
        return noiCap;
    }

    public void setNoiCap(String noiCap) {
        this.noiCap = noiCap;
    }

    public ChucVuEntity getChucVu() {
        return chucVu;
    }

    public void setChucVu(ChucVuEntity chucVu) {
        this.chucVu = chucVu;
    }
}
