package com.laptrinhjavaweb.model.response;

import com.laptrinhjavaweb.entity.GioHangChiTiet;
import com.laptrinhjavaweb.entity.HoaDonChiTiet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.math.BigDecimal;

@Projection(types = {HoaDonChiTiet.class})
public interface HoaDonChiTietResponse {
    @Value("#{target.id}")
    Long getIdHdct();

    @Value("#{target.hoaDon.khachHang.id}")
    Long getIdKhachHang();
    @Value("#{target.hoaDon.id}")
    Long getIdHoaDon();

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
