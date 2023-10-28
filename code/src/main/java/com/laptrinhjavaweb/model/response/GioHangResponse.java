package com.laptrinhjavaweb.model.response;

import com.laptrinhjavaweb.entity.GioHangChiTiet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.math.BigDecimal;

@Projection(types = {GioHangChiTiet.class})
public interface GioHangResponse {

    @Value("#{target.gioHang.khachHang.id}")
    Long getIdKhachHang();
    @Value("#{target.gioHangChiTietId.idGioHang}")
    Long getIdGioHang();

    @Value("#{target.gioHangChiTietId.idBienthe}")
    Long getIdSanPhamThuocTinh();

    @Value("#{target.soLuong}")
    Integer getSoLuong();

    @Value("#{target.bienThe.gia}")
    BigDecimal getGiaTien();
    @Value("#{target.bienThe.sanphams.danhmucs.tenDanhMuc}")
    String getTenDanhMuc();
    @Value("#{target.bienThe.gia}")
    String getGiaTri();

    @Value("#{target.tongTien}")
    BigDecimal getTongTien();
    @Value("#{target.bienThe.sanphams.ten}")
    String getTenSanPham();
}
