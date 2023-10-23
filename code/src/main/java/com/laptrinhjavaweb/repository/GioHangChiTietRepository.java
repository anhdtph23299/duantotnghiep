package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.entity.GioHangChiTiet;
import com.laptrinhjavaweb.entity.GioHangChiTietId;
import com.laptrinhjavaweb.model.response.GioHangResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface GioHangChiTietRepository extends JpaRepository<GioHangChiTiet, GioHangChiTietId> {

    @Query("select ghct from GioHangChiTiet ghct where ghct.gioHang.khachHang.id=:idkh")
    List<GioHangResponse> dsGioHangChiTietByIdKh(@Param("idkh")Long idkh);


    @Query("select sum(ghct.soLuong*ghct.bienTheEntity.gia) from GioHangChiTiet ghct where ghct.gioHang.khachHang.id=:idkh")
    BigDecimal tongTien(@Param("idkh")Long idkh);

    @Query("select distinct ghct.chiTietSanPhamThuocTinh.sanPham.id from GioHangChiTiet ghct where ghct.gioHang.khachHang.id=:idkh")
    List<Long> getDsIdSanPhamByKhachHang(@Param("idkh")Long idkh);
    @Query("select ghct from GioHangChiTiet ghct where ghct.chiTietSanPhamThuocTinh.sanPham.id=:idsp and ghct.gioHang.khachHang.id=:idkh")
    List<GioHangResponse> getDsspThuocTinhByIdSanPhamAndIdKh(@Param("idsp")Long idSp,@Param("idkh")Long idkh);
}
