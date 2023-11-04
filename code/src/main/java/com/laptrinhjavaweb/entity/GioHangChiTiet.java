package com.laptrinhjavaweb.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.laptrinhjavaweb.entity.base.PrimaryEntity;
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
public class GioHangChiTiet extends PrimaryEntity implements Serializable {

//    @EmbeddedId
//    private GioHangChiTietId gioHangChiTietId;

    @ManyToOne
    @JoinColumn(name = "idgiohang")
    @JsonIgnore
    private GioHang gioHang;
    @ManyToOne
    @JoinColumn(name = "idbienthe")
    private BienThe bienThe;

    @Column(name = "soluong")
    private Integer soLuong;

    @Column(name = "trangthai")
    private Integer trangThai;

    @JsonProperty("tongTien")
    public Double getTongTien(){
        if (bienThe.getGia()==null){
            return bienThe.getSanphams().getGia()*soLuong;
        }
        return bienThe.getGia()*soLuong;
    }
}
