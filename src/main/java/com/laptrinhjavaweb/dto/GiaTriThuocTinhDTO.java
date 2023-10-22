package com.laptrinhjavaweb.dto;

public class GiaTriThuocTinhDTO extends AbstractDTO<GiaTriThuocTinhDTO> {

	private Long sanphamid;
	
	private Long thuoctinhid;
	
	private String giatri;

	public Long getSanphamid() {
		return sanphamid;
	}

	public void setSanphamid(Long sanphamid) {
		this.sanphamid = sanphamid;
	}

	public Long getThuoctinhid() {
		return thuoctinhid;
	}

	public void setThuoctinhid(Long thuoctinhid) {
		this.thuoctinhid = thuoctinhid;
	}

	public String getGiatri() {
		return giatri;
	}

	public void setGiatri(String value) {
		this.giatri = value;
	}
}
