package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.entity.KhuyenMai;

import java.util.List;

public interface KhuyenMaiService {
    List<KhuyenMai> getAll();
    KhuyenMai findById(Long id);
    String insert(KhuyenMai khuyenMai);
    String update(KhuyenMai khuyenMai, Long id);
    String delete(Long id);
}
