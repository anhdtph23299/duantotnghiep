package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.entity.GioHangChiTiet;
import com.laptrinhjavaweb.model.request.ThayDoiSoLuongGioHangRequest;
import com.laptrinhjavaweb.model.response.GioHangResponse;

import java.math.BigDecimal;
import java.util.List;

public interface GioHangChiTietService {

    GioHangResponse thayDoiSoLuong(ThayDoiSoLuongGioHangRequest request);

   List<GioHangResponse> dsGioHangChiTietByIdKh(Long idKH);

   BigDecimal tongTien(Long idKH);
   BigDecimal tongTienTheoGioHangChiTiet(Long idKH,List<Long> lstGhct);

   List<List<GioHangResponse>> dsGioHangChiaTheoSanPham(Long idKh);


}
