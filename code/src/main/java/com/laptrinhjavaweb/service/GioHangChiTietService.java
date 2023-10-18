package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.entity.GioHangChiTiet;

import java.math.BigDecimal;
import java.util.List;

public interface GioHangChiTietService {

    String thayDoiSoLuong(Long idSP,Long idGH,Integer soLuong);

   List<GioHangChiTiet> dsGioHangChiTietByIdKh(Long idKH);

   BigDecimal tongTien(Long idKH);

}
