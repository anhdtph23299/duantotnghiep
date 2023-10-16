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
@Table(name = "khuyenmaisanpham")
public class KhuyenMaiSanPham extends PrimaryEntity {

    @ManyToOne
    @JoinColumn(name = "idchitietsanphamthuoctinh",insertable = false,updatable = false)
    private ChiTietSanPhamThuocTinh chiTietSanPhamThuocTinh;

    @ManyToOne
    @JoinColumn(name = "idkhuyenmai",insertable = false,updatable = false)
    private KhuyenMai khuyenMai;

}
