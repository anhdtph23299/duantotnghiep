package com.laptrinhjavaweb.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class GioHangChiTietId implements Serializable {

    @Column(name = "idgiohang")
    private Long idGioHang;
    @Column(name = "idsptt")
    private Long IdSanPhamThuocTinh;

}
