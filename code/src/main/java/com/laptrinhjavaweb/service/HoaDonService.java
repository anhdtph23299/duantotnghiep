package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.entity.HoaDon;

import java.util.List;

public interface HoaDonService {

    List<HoaDon> getDsHoaDon();

    HoaDon insert(HoaDon hoaDon);

    void delete(Long id);
}
