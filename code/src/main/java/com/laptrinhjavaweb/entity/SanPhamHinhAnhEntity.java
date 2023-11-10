package com.laptrinhjavaweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sanphamhinhanh")

public class SanPhamHinhAnhEntity extends BaseEntity{
	
	@Column(name = "hinhanh")
	private String hinhanh;
	
	@ManyToOne
	@JoinColumn(name = "sanphamid")
	private SanPhamEntity sanpham;

	public String getHinhanh() {
		return hinhanh;
	}

	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}

	public SanPhamEntity getSanpham() {
		return sanpham;
	}

	public void setSanpham(SanPhamEntity sanphams) {
		this.sanpham = sanphams;
	}
}
