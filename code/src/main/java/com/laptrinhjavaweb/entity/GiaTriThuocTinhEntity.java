package com.laptrinhjavaweb.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "giatrithuoctinh")

public class GiaTriThuocTinhEntity extends BaseEntity{

    @Column(name = "giatri")
    private String giatri;

    @ManyToOne
    @JoinColumn(name = "sanphamid")
    private SanPhamEntity sanphams;

    @ManyToOne
    @JoinColumn(name = "thuoctinhid")
    private ThuocTinhEntity thuoctinhs;

    @OneToMany(mappedBy = "giatrithuoctinhs", fetch = FetchType.LAZY)
    private List<GiaTriThuocTinhBienTheEntity> giaTriThuocTinhBienTheEntities = new ArrayList<>();

    public String getGiatri() {
        return giatri;
    }

    public void setGiatri(String giatri) {
        this.giatri = giatri;
    }

    public SanPhamEntity getSanphams() {
        return sanphams;
    }

    public void setSanphams(SanPhamEntity sanphams) {
        this.sanphams = sanphams;
    }

    public ThuocTinhEntity getThuoctinhs() {
        return thuoctinhs;
    }

    public void setThuoctinhs(ThuocTinhEntity thuoctinhs) {
        this.thuoctinhs = thuoctinhs;
    }

    public List<GiaTriThuocTinhBienTheEntity> getGiaTriThuocTinhBienTheEntities() {
        return giaTriThuocTinhBienTheEntities;
    }

    public void setGiaTriThuocTinhBienTheEntities(List<GiaTriThuocTinhBienTheEntity> giaTriThuocTinhBienTheEntities) {
        this.giaTriThuocTinhBienTheEntities = giaTriThuocTinhBienTheEntities;
    }
}
