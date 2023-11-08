package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.entity.HoaDon;
import com.laptrinhjavaweb.entity.enumentity.PhuongThucThanhToanEnum;
import com.laptrinhjavaweb.model.request.ThongTinDatHangRequest;
import com.laptrinhjavaweb.model.response.HoaDonChiTietResponse;
import com.laptrinhjavaweb.util.base.ResponseObject;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface GiaoHangService {

    ThongTinDatHangRequest getThongTinDatHang(Long idttdathang,Long idkh);

    List<HoaDonChiTietResponse> dsHoaDonChiTiet(Long idkh);

    HoaDon thanhToan(Long idkh, Long idttgh, PhuongThucThanhToanEnum phuongThucThanhToan);

    ThongTinDatHangRequest datHangGiaoHangNhanh(Long idhd);
}
