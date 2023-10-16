package com.laptrinhjavaweb.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@ToString
@Table(name = "giohangchitiet")
public class GioHangChiTiet implements Serializable {

    @EmbeddedId
    private GioHangChiTietId gioHangChiTietId;

    @ManyToOne
    @JoinColumn(name = "idgiohang",insertable = false,updatable = false)
    @JsonIgnore
    private GioHang gioHang;
    @ManyToOne
    @JoinColumn(name = "idsp",insertable = false,updatable = false)
    private SanPham sanPham;

    @Column(name = "soluong")
    private Integer soLuong;

    @JsonProperty("tongTien")
    public BigDecimal getTongTien(){
        return sanPham.getDonGia().multiply(BigDecimal.valueOf(soLuong));
    }
}
