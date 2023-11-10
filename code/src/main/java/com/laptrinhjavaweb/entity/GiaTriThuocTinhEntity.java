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

public class GiaTriThuocTinhEntity extends BaseEntity{

	@Column(name = "giatri")
	private String giatri;
	
	@ManyToOne
    @JoinColumn(name = "sanphamid")
    private SanPhamEntity sanpham;

	@ManyToOne
    @JoinColumn(name = "thuoctinhid")
    private ThuocTinhEntity thuoctinh;
	
	@OneToMany(mappedBy = "giatrithuoctinh", fetch = FetchType.LAZY)
	private List<GiaTriThuocTinhBienTheEntity> giaTriThuocTinhBienTheEntities = new ArrayList<>();

	public String getGiatri() {
		return giatri;
	}

	public void setGiatri(String giatri) {
		this.giatri = giatri;
	}

	public SanPhamEntity getSanpham() {
		return sanpham;
	}

	public void setSanpham(SanPhamEntity sanphams) {
		this.sanpham = sanphams;
	}

	public ThuocTinhEntity getThuoctinh() {
		return thuoctinh;
	}

	public void setThuoctinh(ThuocTinhEntity thuoctinhs) {
		this.thuoctinh = thuoctinhs;
	}

	public List<GiaTriThuocTinhBienTheEntity> getGiaTriThuocTinhBienTheEntities() {
		return giaTriThuocTinhBienTheEntities;
	}

	public void setGiaTriThuocTinhBienTheEntities(List<GiaTriThuocTinhBienTheEntity> giaTriThuocTinhBienTheEntities) {
		this.giaTriThuocTinhBienTheEntities = giaTriThuocTinhBienTheEntities;
	}
}
