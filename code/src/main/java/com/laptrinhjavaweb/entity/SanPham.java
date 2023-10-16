package com.laptrinhjavaweb.entity;

import com.laptrinhjavaweb.entity.base.PrimaryEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
@Builder
@Entity
@ToString
@Table(name = "sanpham")
public class SanPham extends PrimaryEntity {

    @Column(name = "tensanpham")
    private String tenSanPham;
    @Column(name = "soluong")
    private Integer soLuong;
    @Column(name = "dongia")
    private BigDecimal donGia;
    @Column(name = "trangthai")
    private Integer trangThai;
}
