package com.laptrinhjavaweb.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "bienthe")
public class BienTheEntity extends BaseEntity{

    @Column(name = "ten")
    private String ten;

    @Column(name = "gia")
    private Double gia;

    @Column(name = "hinhanh")
    private String hinhanh;

    @ManyToOne
    @JoinColumn(name = "sanphamid")
    private SanPhamEntity sanphams;

    @OneToMany(mappedBy = "bienthes", fetch = FetchType.LAZY)
    private List<GiaTriThuocTinhBienTheEntity> giaTriThuocTinhBienTheEntities = new ArrayList<>();

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Double getGia() {
        if (gia==null){
            return sanphams.getGia();
        }
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public SanPhamEntity getSanphams() {
        return sanphams;
    }

    public void setSanphams(SanPhamEntity sanphams) {
        this.sanphams = sanphams;
    }

    public List<GiaTriThuocTinhBienTheEntity> getGiaTriThuocTinhBienTheEntities() {
        return giaTriThuocTinhBienTheEntities;
    }

    public void setGiaTriThuocTinhBienTheEntities(List<GiaTriThuocTinhBienTheEntity> giaTriThuocTinhBienTheEntities) {
        this.giaTriThuocTinhBienTheEntities = giaTriThuocTinhBienTheEntities;
    }
}