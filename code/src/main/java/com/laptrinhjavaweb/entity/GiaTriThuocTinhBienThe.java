package com.laptrinhjavaweb.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "giatrithuoctinhbienthe")

public class GiaTriThuocTinhBienThe extends BaseEntity{
	
	@ManyToOne
    @JoinColumn(name = "bientheid")
    private BienThe bienthes;
	
	@ManyToOne
    @JoinColumn(name = "giatrithuoctinhid")
    private GiaTriThuocTinh giatrithuoctinhs;

	public BienThe getBienthes() {
		return bienthes;
	}

	public void setBienthes(BienThe bienthes) {
		this.bienthes = bienthes;
	}

	public GiaTriThuocTinh getGiatrithuoctinhs() {
		return giatrithuoctinhs;
	}

	public void setGiatrithuoctinhs(GiaTriThuocTinh giatrithuoctinhs) {
		this.giatrithuoctinhs = giatrithuoctinhs;
	}
}
