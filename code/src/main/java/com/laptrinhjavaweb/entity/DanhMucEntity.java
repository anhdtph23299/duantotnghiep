package com.laptrinhjavaweb.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "danhmuc")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DanhMucEntity extends BaseEntity {

    @Column(name = "slug", unique = true)
    private String slug;

    @Column(name = "tendm")
    private String tenDanhMuc;

    @ManyToOne
    @JoinColumn(name = "danhmuccha")
    private DanhMucEntity danhmuccha;

    @OneToMany(mappedBy = "danhmuccha", fetch = FetchType.LAZY)
    private List<DanhMucEntity> danhmuccons = new ArrayList<>();

    @Column(name = "hienthitrangchu")
    private Integer isshowhomepage;

    @OneToMany(mappedBy = "danhmucs", fetch = FetchType.LAZY)
    private List<SanPhamEntity> sanPhamEntities = new ArrayList<>();

}
