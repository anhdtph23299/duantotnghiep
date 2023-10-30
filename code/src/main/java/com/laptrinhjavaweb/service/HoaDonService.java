package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.entity.HoaDon;
import com.laptrinhjavaweb.util.base.ResponseObject;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface HoaDonService {

    ResponseObject taoHoaDonByIdGioHangChiTiet(Long idkh, List<Long> idGhct);


    List<HoaDon> getDsHoaDon();

    String insert(HoaDon hoaDon);

    void delete(Long id);
}
