package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.HoaDonChiTietDTO;

import java.util.List;

public interface HoaDonChiTietService {

    List<HoaDonChiTietDTO> getDsHoaDonChiTiet(Long idhd);
}
