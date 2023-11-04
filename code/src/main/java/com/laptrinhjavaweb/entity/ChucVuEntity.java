package com.laptrinhjavaweb.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "chucvu")
public class ChucVuEntity extends BaseEntity {

    @Column(name = "macv")
    private String maCV;

    @Column(name = "tencv")
    private String tenCV;

    @OneToMany(mappedBy = "chucVu", fetch = FetchType.LAZY)
    private List<NhanVienEntity> nhanVienEntities = new ArrayList<>();

    public String getMaCV() {
        return maCV;
    }

    public void setMaCV(String maCV) {
        this.maCV = maCV;
    }

    public String getTenCV() {
        return tenCV;
    }

    public void setTenCV(String tenCV) {
        this.tenCV = tenCV;
    }

    public List<NhanVienEntity> getNhanVienEntities() {
        return nhanVienEntities;
    }

    public void setNhanVienEntities(List<NhanVienEntity> nhanVienEntities) {
        this.nhanVienEntities = nhanVienEntities;
    }
}
