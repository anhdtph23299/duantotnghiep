package com.laptrinhjavaweb.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "giatrithuoctinhbienthe")

public class GiaTriThuocTinhBienTheEntity extends BaseEntity{
	
	@ManyToOne
    @JoinColumn(name = "bientheid")
    private BienTheEntity bienthe;
	
	@ManyToOne
    @JoinColumn(name = "giatrithuoctinhid")
    private GiaTriThuocTinhEntity giatrithuoctinh;

	public BienTheEntity getBienthe() {
		return bienthe;
	}

	public void setBienthe(BienTheEntity bienthes) {
		this.bienthe = bienthes;
	}

	public GiaTriThuocTinhEntity getGiatrithuoctinh() {
		return giatrithuoctinh;
	}

	public void setGiatrithuoctinh(GiaTriThuocTinhEntity giatrithuoctinhs) {
		this.giatrithuoctinh = giatrithuoctinhs;
	}
}
