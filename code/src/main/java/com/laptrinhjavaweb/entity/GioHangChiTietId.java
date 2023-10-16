package com.laptrinhjavaweb.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class GioHangChiTietId implements Serializable {

    @Column(name = "idgiohang")
    private Long idGioHang;
    @Column(name = "idsp")
    private Long idSanPham;

}
