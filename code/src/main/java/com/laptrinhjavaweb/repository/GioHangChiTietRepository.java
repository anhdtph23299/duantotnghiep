package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.entity.GioHangChiTiet;
import com.laptrinhjavaweb.entity.GioHangChiTietId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GioHangChiTietRepository extends JpaRepository<GioHangChiTiet, GioHangChiTietId> {

    @Query("select ghct from GioHangChiTiet ghct where ghct.gioHang.khachHang.id=:idkh")
    List<GioHangChiTiet> dsGioHangChiTietByIdKh(@Param("idkh")Long idkh);

//    @Query("select sum(ghct.soLuong*ghct.sanPham.donGia) from GioHangChiTiet ghct where ghct.gioHang.khachHang.id=:idkh")
//    BigDecimal tongTien(@Param("idkh")Long idkh);
}
