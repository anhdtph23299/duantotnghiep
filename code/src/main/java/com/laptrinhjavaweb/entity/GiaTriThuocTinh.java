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
@Table(name = "giatrithuoctinh")

public class GiaTriThuocTinh extends BaseEntity{

	@Column(name = "giatri")
	private String giatri;
	
	@ManyToOne
    @JoinColumn(name = "sanphamid")
    private SanPham sanphams;

	@ManyToOne
    @JoinColumn(name = "thuoctinhid")
    private ThuocTinh thuoctinhs;
	
	@OneToMany(mappedBy = "giatrithuoctinhs", fetch = FetchType.LAZY)
	private List<GiaTriThuocTinhBienThe> giaTriThuocTinhBienTheEntities = new ArrayList<>();

	public String getGiatri() {
		return giatri;
	}

	public void setGiatri(String giatri) {
		this.giatri = giatri;
	}

	public SanPham getSanphams() {
		return sanphams;
	}

	public void setSanphams(SanPham sanphams) {
		this.sanphams = sanphams;
	}

	public ThuocTinh getThuoctinhs() {
		return thuoctinhs;
	}

	public void setThuoctinhs(ThuocTinh thuoctinhs) {
		this.thuoctinhs = thuoctinhs;
	}

	public List<GiaTriThuocTinhBienThe> getGiaTriThuocTinhBienTheEntities() {
		return giaTriThuocTinhBienTheEntities;
	}

	public void setGiaTriThuocTinhBienTheEntities(List<GiaTriThuocTinhBienThe> giaTriThuocTinhBienTheEntities) {
		this.giaTriThuocTinhBienTheEntities = giaTriThuocTinhBienTheEntities;
	}
}
