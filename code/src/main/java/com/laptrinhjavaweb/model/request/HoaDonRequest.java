package com.laptrinhjavaweb.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.laptrinhjavaweb.entity.*;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class HoaDonRequest {

    private String maHoaDon;

    private Date ngayDat=new Date();

    private Date thoiGianDuKienGiaoHang;

    private Date ngayThanhToan;

    private Date ngayNhanHang;

    private String moTa;

    private Integer PhuongThucThanhToan;

    private Integer trangThai=1;

}
