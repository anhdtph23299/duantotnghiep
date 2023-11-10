package com.laptrinhjavaweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "khachhang")
public class KhachHangEntity extends BaseEntity {

    @Column(name = "ma", unique = true)
    private String ma;

    @Column(name = "matkhau")
    private String matkhau;

    @Column(name = "ten")
    private String ten;

    @Column(name = "sodienthoai", unique = true)
    private String sodienthoai;

    @Column(name = "email")
    private String email;

    @Column(name = "gioitinh")
    private Boolean gioitinh;

    @Column(name = "ngaysinh", columnDefinition = "TIMESTAMP")
    private Date ngaysinh;

    @Column(name = "diachi")
    private String diachi;

    @Column(name = "cancuoccongdan")
    private String cancuoccongdan;

    @Column(name = "mota")
    private String mota;

    @Column(name = "ngaydangky")
    private Date ngaydangky;

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getMatkhau() {
		return matkhau;
	}

	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getSodienthoai() {
		return sodienthoai;
	}

	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(Boolean gioitinh) {
		this.gioitinh = gioitinh;
	}

	public Date getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getCancuoccongdan() {
		return cancuoccongdan;
	}

	public void setCancuoccongdan(String cancuoccongdan) {
		this.cancuoccongdan = cancuoccongdan;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public Date getNgaydangky() {
		return ngaydangky;
	}

	public void setNgaydangky(Date ngaydangky) {
		this.ngaydangky = ngaydangky;
	}
}