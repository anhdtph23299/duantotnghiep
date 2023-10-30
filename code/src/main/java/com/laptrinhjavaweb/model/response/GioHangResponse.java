package com.laptrinhjavaweb.model.response;

import com.laptrinhjavaweb.entity.GioHangChiTiet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.math.BigDecimal;

@Projection(types = {GioHangChiTiet.class})
public interface GioHangResponse {
    @Value("#{target.id}")
    Long getIdGhct();

    @Value("#{target.gioHang.khachHang.id}")
    Long getIdKhachHang();
    @Value("#{target.gioHang.id}")
    Long getIdGioHang();

    @Value("#{target.bienThe.id}")
    Long getIdSanPhamThuocTinh();

    @Value("#{target.soLuong}")
    Integer getSoLuong();

    @Value("#{target.bienThe.gia}")
    BigDecimal getGiaTien();
    @Value("#{target.bienThe.sanphams.danhmucs.tenDanhMuc}")
    String getTenDanhMuc();
    @Value("#{target.bienThe.ten}")
    String getTenBienThe();

    @Value("#{target.tongTien}")
    BigDecimal getTongTien();
    @Value("#{target.bienThe.sanphams.ten}")
    String getTenSanPham();
}
