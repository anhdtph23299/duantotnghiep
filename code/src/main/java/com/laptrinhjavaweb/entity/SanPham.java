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
@Table(name = "sanpham")

public class SanPham extends BaseEntity {

	@Column(name = "slug", unique = true)
	private String slug;

	@Column(name = "tensp", nullable = false)
	private String ten;

	@Column(name = "gia", nullable = false)
	private Double gia;

	@Column(name = "chitietsanpham", columnDefinition = "TEXT")
	private String chitietsanpham;

	@Column(name = "motasanpham", columnDefinition = "TEXT")
	private String motasanpham;

//	@Column(name = "isnew")
//	private Integer isnew;

//	@Column(name = "ispopular")
//	private Integer ispopular;
//
//	@Column(name = "ismostviewed")
//	private Integer ismostviewed;
//
//	@Column(name = "isbestseller")
//	private Integer isbestseller;

	@ManyToOne
	@JoinColumn(name = "iddm")
	private DanhMuc danhmucs;

	@ManyToOne
	@JoinColumn(name = "thuonghieuid")
	private ThuongHieu thuonghieus;

	@OneToMany(mappedBy = "sanphams", fetch = FetchType.LAZY)
	private List<ThuocTinh> thuocTinhEntities = new ArrayList<>();

	@OneToMany(mappedBy = "sanphams", fetch = FetchType.LAZY)
	private List<GiaTriThuocTinh> giaTriThuocTinhEntities = new ArrayList<>();

	@OneToMany(mappedBy = "sanphams", fetch = FetchType.LAZY)
	private List<BienThe> bienTheEntities = new ArrayList<>();

	@OneToMany(mappedBy = "sanphams", fetch = FetchType.LAZY)
	private List<SanPhamHinhAnh> sanPhamHinhAnhEntities = new ArrayList<>();

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

	public Double getGia() {
		return gia;
	}

	public void setGia(Double gia) {
		this.gia = gia;
	}

	public String getChitietsanpham() {
		return chitietsanpham;
	}

	public void setChitietsanpham(String chitietsanpham) {
		this.chitietsanpham = chitietsanpham;
	}

	public String getMotasanpham() {
		return motasanpham;
	}

	public void setMotasanpham(String motasanpham) {
		this.motasanpham = motasanpham;
	}

//	public Integer getIsnew() {
//		return isnew;
//	}
//
//	public void setIsnew(Integer isnew) {
//		this.isnew = isnew;
//	}

//	public Integer getIspopular() {
//		return ispopular;
//	}
//
//	public void setIspopular(Integer ispopular) {
//		this.ispopular = ispopular;
//	}
//
//	public Integer getIsmostviewed() {
//		return ismostviewed;
//	}
//
//	public void setIsmostviewed(Integer ismostviewed) {
//		this.ismostviewed = ismostviewed;
//	}
//
//	public Integer getIsbestseller() {
//		return isbestseller;
//	}
//
//	public void setIsbestseller(Integer isbestseller) {
//		this.isbestseller = isbestseller;
//	}

	public DanhMuc getDanhmucs() {
		return danhmucs;
	}

	public void setDanhmucs(DanhMuc danhmucs) {
		this.danhmucs = danhmucs;
	}

	public ThuongHieu getThuonghieus() {
		return thuonghieus;
	}

	public void setThuonghieus(ThuongHieu thuonghieus) {
		this.thuonghieus = thuonghieus;
	}

	public List<ThuocTinh> getThuocTinhEntities() {
		return thuocTinhEntities;
	}

	public void setThuocTinhEntities(List<ThuocTinh> thuocTinhEntities) {
		this.thuocTinhEntities = thuocTinhEntities;
	}

	public List<GiaTriThuocTinh> getGiaTriThuocTinhEntities() {
		return giaTriThuocTinhEntities;
	}

	public void setGiaTriThuocTinhEntities(List<GiaTriThuocTinh> giaTriThuocTinhEntities) {
		this.giaTriThuocTinhEntities = giaTriThuocTinhEntities;
	}

	public List<BienThe> getBienTheEntities() {
		return bienTheEntities;
	}

	public void setBienTheEntities(List<BienThe> bienTheEntities) {
		this.bienTheEntities = bienTheEntities;
	}

	public List<SanPhamHinhAnh> getSanPhamHinhAnhEntities() {
		return sanPhamHinhAnhEntities;
	}

	public void setSanPhamHinhAnhEntities(List<SanPhamHinhAnh> sanPhamHinhAnhEntities) {
		this.sanPhamHinhAnhEntities = sanPhamHinhAnhEntities;
	}
}
