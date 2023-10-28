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
@Table(name = "dongca")
public class DongCa extends PrimaryEntity {

    @Column(name = "sotiencuoica")
    private BigDecimal soTienCuoiCa;

    @Column(name = "thoigian")
    private Date thoiGian;

    @Column(name = "mota")
    private String moTa;

    @ManyToOne
    @JoinColumn(name = "idnhanvien", referencedColumnName = "id")
    private NhanVien nhanVien;
}
