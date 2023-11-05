package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.SanPhamGiamGiaCustom;
import com.laptrinhjavaweb.dto.SanPhamGiamGiaDto;
import com.laptrinhjavaweb.entity.KhuyenMai;
import com.laptrinhjavaweb.entity.SanPhamGiamGia;

import java.util.List;

public interface SanPhamGiamGiaService {
    List<SanPhamGiamGia> getAll();
    List<SanPhamGiamGiaDto> create(SanPhamGiamGiaCustom custom);
    String delete(List<SanPhamGiamGia> list);
    List<SanPhamGiamGia> update(List<SanPhamGiamGia> list);
    List<SanPhamGiamGia> findById(Long id);

    List<KhuyenMai> getAllKhuyenMai();
}
