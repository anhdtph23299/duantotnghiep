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
    private BienThe bienThe;

    @Column(name = "soluong")
    private Integer soLuong;

    @Column(name = "dongia")
    private Double donGia;

    public Double getTongTien(){
        if (donGia==null){
            return bienThe.getGia()*soLuong;
        }
        return donGia*soLuong;
    }
}
