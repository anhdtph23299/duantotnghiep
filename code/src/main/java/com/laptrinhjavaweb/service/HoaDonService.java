package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.entity.HoaDon;
import com.laptrinhjavaweb.model.response.HoaDonChiTietResponse;
import com.laptrinhjavaweb.util.base.ResponseObject;
import org.springframework.http.ResponseEntity;

import java.math.BigDecimal;
import java.util.List;

public interface HoaDonService {
    HoaDon findById(Long idhd);

    ResponseObject taoHoaDonByIdGioHangChiTiet(Long idkh, List<Integer> idGhct);

    HoaDon findHoaDonMoiDat(Long idkh);

    List<HoaDonChiTietResponse> dsHoaDonChiTietByIdHoaDon(Long idhd);

    BigDecimal tongTienTheoHoaDon(Long idhd);


    List<HoaDon> getDsHoaDon();

    HoaDon saveOrUpdate(HoaDon hoaDon);

    void delete(Long id);

    String getCurrentDateTime();
}
