package com.laptrinhjavaweb.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;

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
    @JoinColumn(name = "idsp",insertable = false,updatable = false)
    private SanPhamEntity sanPham;

    @Column(name = "soluong")
    private Integer soLuong;

    @ManyToOne
    @JoinColumn(name = "idspbt",insertable = false,updatable = false)
    private BienTheEntity bienTheEntity;


//    @JsonProperty("tongTien")
//    public BigDecimal getTongTien(){
//        return chiTietSanPhamThuocTinh.getGia().multiply(BigDecimal.valueOf(soLuong));
//    }
}
