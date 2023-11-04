package com.laptrinhjavaweb.entity;

import com.laptrinhjavaweb.entity.base.PrimaryEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
@Builder
@Entity
@ToString
@Table(name = "lichsutichdiem")
public class LichSuTichDiem extends PrimaryEntity {

    @Column(name = "sodiem")
    private Integer soDiem;

    @Column(name = "ngaytich")
    private Date ngayTich;

    @ManyToOne
    @JoinColumn(name = "idtd", referencedColumnName = "id")
    private TichDiem tichDiem;

    @ManyToOne
    @JoinColumn(name = "idhd",referencedColumnName = "id")
    private HoaDon hoaDon;
}
