package com.laptrinhjavaweb.entity;

import com.laptrinhjavaweb.entity.base.PrimaryEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
@Builder
@Entity
@ToString
@Table(name = "khachhangyeuthichsanpham")
public class KhachHangYeuThichSanPham extends PrimaryEntity {
    @ManyToOne
    @JoinColumn(name = "idctsanphamtt",insertable = false,updatable = false)
    private ChiTietSanPhamThuocTinh chiTietSanPhamThuocTinh;

    @ManyToOne
    @JoinColumn(name = "idkhachhang",insertable = false,updatable = false)
    private KhachHang khachHang;

}
