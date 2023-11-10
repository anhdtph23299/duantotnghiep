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

public class SanPhamEntity extends BaseEntity {

	@Column(name = "slug", unique = true)
	private String slug;

	@Column(name = "ten", nullable = false)
	private String ten;

	@Column(name = "gia", nullable = false)
	private Double gia;

	@Column(name = "chitietsanpham", columnDefinition = "TEXT")
	private String chitietsanpham;

	@Column(name = "motasanpham", columnDefinition = "TEXT")
	private String motasanpham;

	@Column(name = "isnew")
	private Integer isnew;

	@Column(name = "ispopular")
	private Integer ispopular;

	@Column(name = "ismostviewed")
	private Integer ismostviewed;

	@Column(name = "isbestseller")
	private Integer isbestseller;

	@ManyToOne
	@JoinColumn(name = "danhmucid")
	private DanhMucEntity danhmuc;

	@ManyToOne
	@JoinColumn(name = "thuonghieuid")
	private ThuongHieuEntity thuonghieu;

	@OneToMany(mappedBy = "sanpham", fetch = FetchType.LAZY)
	private List<ThuocTinhEntity> thuocTinhEntities = new ArrayList<>();

	@OneToMany(mappedBy = "sanpham", fetch = FetchType.LAZY)
	private List<GiaTriThuocTinhEntity> giaTriThuocTinhEntities = new ArrayList<>();

	@OneToMany(mappedBy = "sanpham", fetch = FetchType.LAZY)
	private List<BienTheEntity> bienTheEntities = new ArrayList<>();

	@OneToMany(mappedBy = "sanpham", fetch = FetchType.LAZY)
	private List<SanPhamHinhAnhEntity> sanPhamHinhAnhEntities = new ArrayList<>();

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

	public Integer getIsnew() {
		return isnew;
	}

	public void setIsnew(Integer isnew) {
		this.isnew = isnew;
	}

	public Integer getIspopular() {
		return ispopular;
	}

	public void setIspopular(Integer ispopular) {
		this.ispopular = ispopular;
	}

	public Integer getIsmostviewed() {
		return ismostviewed;
	}

	public void setIsmostviewed(Integer ismostviewed) {
		this.ismostviewed = ismostviewed;
	}

	public Integer getIsbestseller() {
		return isbestseller;
	}

	public void setIsbestseller(Integer isbestseller) {
		this.isbestseller = isbestseller;
	}

	public DanhMucEntity getDanhmuc() {
		return danhmuc;
	}

	public void setDanhmuc(DanhMucEntity danhmucs) {
		this.danhmuc = danhmucs;
	}

	public ThuongHieuEntity getThuonghieu() {
		return thuonghieu;
	}

	public void setThuonghieu(ThuongHieuEntity thuonghieus) {
		this.thuonghieu = thuonghieus;
	}

	public List<ThuocTinhEntity> getThuocTinhEntities() {
		return thuocTinhEntities;
	}

	public void setThuocTinhEntities(List<ThuocTinhEntity> thuocTinhEntities) {
		this.thuocTinhEntities = thuocTinhEntities;
	}

	public List<GiaTriThuocTinhEntity> getGiaTriThuocTinhEntities() {
		return giaTriThuocTinhEntities;
	}

	public void setGiaTriThuocTinhEntities(List<GiaTriThuocTinhEntity> giaTriThuocTinhEntities) {
		this.giaTriThuocTinhEntities = giaTriThuocTinhEntities;
	}

	public List<BienTheEntity> getBienTheEntities() {
		return bienTheEntities;
	}

	public void setBienTheEntities(List<BienTheEntity> bienTheEntities) {
		this.bienTheEntities = bienTheEntities;
	}

	public List<SanPhamHinhAnhEntity> getSanPhamHinhAnhEntities() {
		return sanPhamHinhAnhEntities;
	}

	public void setSanPhamHinhAnhEntities(List<SanPhamHinhAnhEntity> sanPhamHinhAnhEntities) {
		this.sanPhamHinhAnhEntities = sanPhamHinhAnhEntities;
	}
}
