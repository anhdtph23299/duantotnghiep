package com.laptrinhjavaweb.entity;

import com.laptrinhjavaweb.entity.base.PrimaryEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
@Builder
@Entity
@ToString
@Table(name = "lydohuy")
public class LiDoHuy extends PrimaryEntity {
    @Column(name = "tenlido")
    private String tenLiDo;
    @Column(name = "mota")
    private String moTa;

    @OneToMany(mappedBy = "hoadon")
    private List<HoaDon> hoaDonHuy  = new ArrayList<>();
}
