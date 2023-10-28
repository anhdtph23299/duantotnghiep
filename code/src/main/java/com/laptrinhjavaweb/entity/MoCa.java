package com.laptrinhjavaweb.entity;

import com.laptrinhjavaweb.entity.base.PrimaryEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
@Builder
@Entity
@ToString
@Table(name = "moca")
public class MoCa extends PrimaryEntity {

    @Column(name = "sotiendauca")
    private BigDecimal soTienDauCa;

    @Column(name = "thoigian")
    private LocalDateTime thoiGian;

    @ManyToOne
    @JoinColumn(name = "idnhanvien", referencedColumnName = "id")
    private NhanVien nhanVien;
}
