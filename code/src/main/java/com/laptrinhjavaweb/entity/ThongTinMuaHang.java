package com.laptrinhjavaweb.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
@Builder
@Entity
@ToString
@Table(name = "thongtinmuahang")
public class ThongTinMuaHang extends PrimaryEntity implements Serializable {

    @Column(name = "tennguoinhan")
    private String tenNguoiNhan;
    @Column(name = "sodienthoai")
    private String soDienThoai;
    @Column(name = "diachi")
    private String diaChi;
    @Column(name = "trangthai")
    private Integer trangThai;
    @ManyToOne
    @JoinColumn(name = "idkh")
    @JsonIgnore
  //  @JsonIgnoreProperties("khachhang")
    private KhachHang khachHang;
}
