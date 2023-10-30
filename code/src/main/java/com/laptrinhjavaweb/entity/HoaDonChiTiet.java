package com.laptrinhjavaweb.entity;

import com.laptrinhjavaweb.entity.base.PrimaryEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
@Builder
@Entity
@ToString
@Table(name = "hoadonchitiet")
public class HoaDonChiTiet extends PrimaryEntity {

    @ManyToOne
    private HoaDon hoaDon;
    @ManyToOne
    private BienTheEntity bienThe;
    @Column(name = "ngaythanhtoan")
    private Date ngayThanhToan;
    @Column(name = "phuongthucthanhtoan")
    private Integer PhuongThucThanhToan;
    @Column(name = "idttmuahang")
    private Long thongTinMuaHang;
    @Column(name = "trangthai")
    private Integer trangThai=1;
}
