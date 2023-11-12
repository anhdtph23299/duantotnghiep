package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.HoaDonDTO;
import com.laptrinhjavaweb.entity.HoaDon;
import com.laptrinhjavaweb.model.response.HoaDonChiTietResponse;
import com.laptrinhjavaweb.util.base.ResponseObject;
import org.springframework.http.ResponseEntity;

import java.math.BigDecimal;
import java.util.List;

public interface HoaDonService {
    // tuấn anh
    ResponseObject taoHoaDonByIdGioHangChiTiet(Long idkh, List<Integer> idGhct);

    HoaDon findHoaDonMoiDat(Long idkh);

    List<HoaDonChiTietResponse> dsHoaDonChiTietByIdHoaDon(Long idhd);

    BigDecimal tongTienTheoHoaDon(Long idhd);



    //tuấn
    List<HoaDonDTO> getDsHoaDon();

//    HoaDonDTO detailHD(String maHoaDon);

    String getCurrentDateTime();
}
