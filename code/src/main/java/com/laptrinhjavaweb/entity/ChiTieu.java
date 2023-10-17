package com.laptrinhjavaweb.entity;

import com.laptrinhjavaweb.entity.base.PrimaryEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
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
@Table(name = "chitieu")
public class ChiTieu  extends PrimaryEntity {

    @Column(name = "sotien")
    private BigDecimal soTien;

    @Column(name = "ngaytao")
    private Date ngayTao;

    @Column(name = "loaichitieu")
    private String loaiChiTieu;

    @Column(name = "trangthai")
    private int trangThai;

    @ManyToOne
    @JoinColumn(name = "idvdt",referencedColumnName = "id")
    private ViDienTu viDienTu;

    @ManyToOne
    @JoinColumn(name = "idhd",referencedColumnName = "id")
    private HoaDon hoaDon;
}
