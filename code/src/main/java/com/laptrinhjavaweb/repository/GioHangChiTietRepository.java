package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.entity.GioHangChiTiet;
import com.laptrinhjavaweb.entity.GioHangChiTietId;
import com.laptrinhjavaweb.model.response.GioHangResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface GioHangChiTietRepository extends JpaRepository<GioHangChiTiet, Long> {

    @Query("select ghct from GioHangChiTiet ghct where ghct.gioHang.khachHang.id=:idkh and ghct.trangThai= 1")
    List<GioHangResponse> dsGioHangChiTietByIdKh(@Param("idkh")Long idkh);
    @Query("select ghct from GioHangChiTiet ghct where ghct.gioHang.id=:idgh and ghct.id in (:idghct) and ghct.trangThai= 1")
    List<GioHangChiTiet> dsGioHangChiTietByIdGioHang(@Param("idgh")Long idgh,@Param("idghct")List<Long> idghct);
    @Query("select ghct from GioHangChiTiet ghct where ghct.id =:idghct")
    GioHangResponse getGioHangResponseById(@Param("idghct")Long idghct);

    @Query("select sum(ghct.soLuong*ghct.bienThe.gia) from GioHangChiTiet ghct where ghct.gioHang.khachHang.id=:idkh and ghct.trangThai= 1")
    BigDecimal tongTien(@Param("idkh")Long idkh);

    @Query("select sum(ghct.soLuong*ghct.bienThe.gia) from GioHangChiTiet ghct where ghct.gioHang.khachHang.id=:idkh and ghct.id in (:lstghct) and ghct.trangThai= 1")
    BigDecimal tongTienTheoGioHangChiTiet(@Param("idkh")Long idkh,@Param("lstghct")List<Long> lstghct);

    @Query("select distinct ghct.bienThe.sanphams.id from GioHangChiTiet ghct where ghct.gioHang.khachHang.id=:idkh and ghct.trangThai= 1")
    List<Long> getDsIdSanPhamByKhachHang(@Param("idkh")Long idkh);
    @Query("select ghct from GioHangChiTiet ghct where ghct.bienThe.sanphams.id=:idsp and ghct.gioHang.khachHang.id=:idkh and ghct.trangThai= 1")
    List<GioHangResponse> getDsspThuocTinhByIdSanPhamAndIdKh(@Param("idsp")Long idSp,@Param("idkh")Long idkh);
}
