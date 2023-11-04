package com.laptrinhjavaweb.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "thuonghieu")

public class ThuongHieu extends BaseEntity{
	
	@Column(name = "slug", unique = true)
	private String slug;

	@Column(name = "ten")
	private String ten;
	
	@OneToMany(mappedBy = "thuonghieus", fetch = FetchType.LAZY)
	private List<SanPham> sanPhamEntities = new ArrayList<>();

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public List<SanPham> getSanPhamEntities() {
		return sanPhamEntities;
	}

	public void setSanPhamEntities(List<SanPham> sanPhamEntities) {
		this.sanPhamEntities = sanPhamEntities;
	}
}
