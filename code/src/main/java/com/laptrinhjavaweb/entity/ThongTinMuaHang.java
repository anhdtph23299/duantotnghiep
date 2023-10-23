package com.laptrinhjavaweb.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
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
@Table(name = "thongtinmuahang")
public class ThongTinMuaHang extends PrimaryEntity {

    @Column(name = "tennguoinhan")
    private String tenNguoiNhan;

    @Column(name = "sdt")
    private String sdt;

    @Column(name = "diachi")
    private String diaChi;

    @Column(name = "trangthai")
    @JsonIgnore
    private Integer trangThai;

    @JsonProperty("trangThai")
    public String getTrangThai(){
        return trangThai==1?"":trangThai==2?"Mặc định":"Đã xoá";
    }

    @ManyToOne
    @JoinColumn(name = "idkh", referencedColumnName = "id")
    private KhachHang khachHang;
}
