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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
@Builder
@Entity
@ToString
@Table(name = "hoadonchitiet")
public class HoaDonChiTiet extends PrimaryEntity {

    @ManyToOne
    @JoinColumn(name = "idhd")
    private HoaDon hoaDon;
    @ManyToOne
    @JoinColumn(name = "idbienthe")
    private BienTheEntity bienThe;

    @Column(name = "soluong")
    private Integer soLuong;

    @Column(name = "dongia")
    private BigDecimal donGia;

    public BigDecimal getTongTien(){
        return donGia.multiply(BigDecimal.valueOf(soLuong));
    }
}
