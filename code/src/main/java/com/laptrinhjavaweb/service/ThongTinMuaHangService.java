package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.entity.ThongTinMuaHang;
import com.laptrinhjavaweb.model.response.ThongTinMuaHangResponse;

import java.util.List;

public interface ThongTinMuaHangService {
    ThongTinMuaHang findThongTinMuaHangDefault(Long idkh);

    List<ThongTinMuaHangResponse> dsThongTinMuaHang(Long idkh);
}
