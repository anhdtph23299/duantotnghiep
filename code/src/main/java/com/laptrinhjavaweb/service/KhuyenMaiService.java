package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.entity.KhuyenMai;

import java.util.List;

public interface KhuyenMaiService {
    List<KhuyenMai> getAll();
<<<<<<< HEAD
    KhuyenMai findById(Long id);
    String insert(KhuyenMai khuyenMai);
    String update(KhuyenMai khuyenMai, Long id);
    String delete(Long id);
=======

    KhuyenMai findById(Long id);

    String insert(KhuyenMai khuyenMai);

    String update(KhuyenMai khuyenMai, Long id);

    String delete(Long id);

>>>>>>> 05656fde4f7200afb113438fb319a54853650308
}
