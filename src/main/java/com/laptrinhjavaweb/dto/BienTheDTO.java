package com.laptrinhjavaweb.dto;

public class BienTheDTO extends AbstractDTO<BienTheDTO>{

	private String ten;
	
	private Long sanphamid;
	
	private String gia;
	
	private String hinhanh;

	public String getTen() {
		return ten;
	}

	public void setTen(String name) {
		this.ten = name;
	}

	public Long getSanphamid() {
		return sanphamid;
	}

	public void setSanphamid(Long sanphamid) {
		this.sanphamid = sanphamid;
	}

	public String getGia() {
		return gia;
	}

	public void setGia(String gia) {
		this.gia = gia;
	}

	public String getHinhanh() {
		return hinhanh;
	}

	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}
}
