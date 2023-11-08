package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.dto.HoaDonChiTietDTO;
import com.laptrinhjavaweb.dto.HoaDonDTO;
import com.laptrinhjavaweb.entity.HoaDonChiTiet;
import com.laptrinhjavaweb.model.response.GioHangResponse;
import com.laptrinhjavaweb.model.response.HoaDonChiTietResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface HoaDonChiTietRepository extends JpaRepository<HoaDonChiTiet,Long> {

    @Query("select hdct from HoaDonChiTiet hdct where hdct.hoaDon.id=:idhd ")
    List<HoaDonChiTietResponse> dsHoaDonChiTietByIdHoaDon(@Param("idhd")Long idhd);

    @Query("select hdct from HoaDonChiTiet hdct where hdct.hoaDon.id=:idhd ")
    List<HoaDonChiTiet> findByHoaDon(@Param("idhd")Long idhd);
}
