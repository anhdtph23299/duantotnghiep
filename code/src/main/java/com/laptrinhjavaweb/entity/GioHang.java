package com.laptrinhjavaweb.entity;

import com.laptrinhjavaweb.entity.base.PrimaryEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
@Table(name = "giohang")
public class GioHang extends PrimaryEntity {

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idkh")
    private KhachHang khachHang;

    @Column(name = "ngaytao")
    private Date ngayTao=new Date();
    @Column(name = "trangthai")
    private Integer trangThai=1;
}
