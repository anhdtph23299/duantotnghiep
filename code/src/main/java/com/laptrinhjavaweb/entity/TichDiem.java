package com.laptrinhjavaweb.entity;

import com.laptrinhjavaweb.entity.base.PrimaryEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
@Builder
@Entity
@ToString
@Table(name = "tichdiem")
public class TichDiem extends PrimaryEntity {

    @Column(name = "sodiem")
    private Integer soDiem;

    @OneToOne
    @JoinColumn(name = "idkh", referencedColumnName = "id")
    private KhachHang khachHang;
}
