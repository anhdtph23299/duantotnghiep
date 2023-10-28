package com.laptrinhjavaweb.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JoinColumn(name = "idbienthe",insertable = false,updatable = false)
    private BienTheEntity bienThe;

    @Column(name = "soluong")
    private Integer soLuong;

    @JsonProperty("tongTien")
    public Double getTongTien(){
        return bienThe.getGia()*soLuong;
    }
}
