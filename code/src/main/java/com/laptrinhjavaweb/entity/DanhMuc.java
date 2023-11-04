package com.laptrinhjavaweb.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "danhmuc")

public class DanhMuc extends BaseEntity {

	@Column(name = "slug", unique = true)
	private String slug;

	@Column(name = "tendm")
	private String ten;

	@ManyToOne
	@JoinColumn(name = "danhmuccha")
	private DanhMuc danhmuccha;

	@OneToMany(mappedBy = "danhmuccha", fetch = FetchType.LAZY)
	private List<DanhMuc> danhmuccons = new ArrayList<>();
	
	@Column(name = "hienthitrangchu")
    private Integer isshowhomepage;
	
	@OneToMany(mappedBy = "danhmucs", fetch = FetchType.LAZY)
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

	public DanhMuc getDanhmuccha() {
		return danhmuccha;
	}

	public void setDanhmuccha(DanhMuc danhmuccha) {
		this.danhmuccha = danhmuccha;
	}

	public List<DanhMuc> getDanhmuccons() {
		return danhmuccons;
	}

	public void setDanhmuccons(List<DanhMuc> danhmuccons) {
		this.danhmuccons = danhmuccons;
	}

	public Integer getIsshowhomepage() {
		return isshowhomepage;
	}

	public void setIsshowhomepage(Integer isshowhomepage) {
		this.isshowhomepage = isshowhomepage;
	}

	public List<SanPham> getSanPhamEntities() {
		return sanPhamEntities;
	}

	public void setSanPhamEntities(List<SanPham> sanPhamEntities) {
		this.sanPhamEntities = sanPhamEntities;
	}
}

