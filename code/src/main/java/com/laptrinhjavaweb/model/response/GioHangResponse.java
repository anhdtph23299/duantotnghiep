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

    @Value("#{target.gioHangChiTietId.idSanPhamThuocTinh}")
    Long getIdSanPhamThuocTinh();

    @Value("#{target.soLuong}")
    Integer getSoLuong();

    @Value("#{target.chiTietSanPhamThuocTinh.giaTien}")
    BigDecimal getGiaTien();
    @Value("#{target.chiTietSanPhamThuocTinh.sanPham.danhMuc.tenDM}")
    String getTenDanhMuc();
    @Value("#{target.chiTietSanPhamThuocTinh.giaTri}")
    String getGiaTri();

    @Value("#{target.chiTietSanPhamThuocTinh.sanPham.ten}")
    String getTenSanPham();
}
