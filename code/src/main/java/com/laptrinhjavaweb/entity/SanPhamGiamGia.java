package com.laptrinhjavaweb.entity;

import com.laptrinhjavaweb.entity.base.PrimaryEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@ToString
@Table(name = "sanphamgiamgia")
public class SanPhamGiamGia extends PrimaryEntity {

    @ManyToOne
    @JoinColumn(name = "idsanpham",insertable = false,updatable = false)
    private SanPham sanPhamThuocTinh;

    @ManyToOne
    @JoinColumn(name = "idkhuyenmai",insertable = false,updatable = false)
    private KhuyenMai khuyenMai;

    @Column(name = "soluong")
    private Integer soLuong;

}
