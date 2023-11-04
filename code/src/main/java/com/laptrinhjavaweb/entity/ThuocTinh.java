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
@Table(name = "thuoctinh")

public class ThuocTinh extends BaseEntity{
	
	@Column(name = "slug")
	private String slug;
	
	@Column(name = "tentt")
	private String ten;
	
	@ManyToOne
    @JoinColumn(name = "sanphamid")
    private SanPham sanphams;
	
	@OneToMany(mappedBy = "thuoctinhs", fetch = FetchType.LAZY)
	private List<GiaTriThuocTinh> giaTriThuocTinhEntities = new ArrayList<>();

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

	public SanPham getSanphams() {
		return sanphams;
	}

	public void setSanphams(SanPham sanphams) {
		this.sanphams = sanphams;
	}

	public List<GiaTriThuocTinh> getGiaTriThuocTinhEntities() {
		return giaTriThuocTinhEntities;
	}

	public void setGiaTriThuocTinhEntities(List<GiaTriThuocTinh> giaTriThuocTinhEntities) {
		this.giaTriThuocTinhEntities = giaTriThuocTinhEntities;
	}
}

