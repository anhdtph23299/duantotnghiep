package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.model.request.ThongTinDatHangRequest;

public interface GiaoHangService {

    ThongTinDatHangRequest getThongTinDatHang(Long idttdathang,Long idkh);
}
