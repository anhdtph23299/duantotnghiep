package com.laptrinhjavaweb.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
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
    @JoinColumn(name = "idsptt",insertable = false,updatable = false)
    private ChiTietSanPhamThuocTinh chiTietSanPhamThuocTinh;

    @Column(name = "soluong")
    private Integer soLuong;

//    @JsonProperty("tongTien")
//    public BigDecimal getTongTien(){
//        return chiTietSanPhamThuocTinh.getGia().multiply(BigDecimal.valueOf(soLuong));
//    }
}
