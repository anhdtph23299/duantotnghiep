package com.laptrinhjavaweb.entity;

import com.laptrinhjavaweb.entity.base.PrimaryEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@ToString
@Table(name = "khachhangyeuthichsanpham")
public class KhachHangYeuThichSanPham extends PrimaryEntity {
    @ManyToOne
    @JoinColumn(name = "idchitietsanphamthuoctinh",insertable = false,updatable = false)
    private ChiTietSanPhamThuocTinh chiTietSanPhamThuocTinh;

    @ManyToOne
    @JoinColumn(name = "idkhachhang",insertable = false,updatable = false)
    private KhachHang khachHang;

}
