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
@Table(name = "thongtinmuahang")
public class ThongTinMuaHang extends PrimaryEntity {

    @Column(name = "tennguoinhan")
    private String tenNguoiNhan;

    @Column(name = "sdt")
    private String sdt;

    @Column(name = "diachi")
    private String diaChi;

    @Column(name = "trangthai")
    private Integer trangThai;

    @ManyToOne
    @JoinColumn(name = "idkh", referencedColumnName = "id")
    private KhachHang khachHang;
}
