package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.entity.SanPhamGiamGia;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SanPhamGiamGiaService {
    List<SanPhamGiamGia> getAll();
    List<SanPhamGiamGia> create(List<SanPhamGiamGia> list);
    String delete(List<SanPhamGiamGia> list);
    List<SanPhamGiamGia> update(List<SanPhamGiamGia> list);
    List<SanPhamGiamGia> findById(Long id);
}
