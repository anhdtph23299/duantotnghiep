package com.laptrinhjavaweb.entity;

import com.laptrinhjavaweb.entity.base.PrimaryEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
@Builder
@Entity
@ToString
@Table(name = "vidientu")
public class ViDienTu extends PrimaryEntity {

    @Column(name = "sotien")
    private BigDecimal soTien;

    @ManyToOne
    @JoinColumn(name = "idkh",referencedColumnName = "id")
    private KhachHang khachHang;
}
