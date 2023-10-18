package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.entity.ChucVu;
import com.laptrinhjavaweb.entity.NhanVien;

import java.util.List;


public interface ChucVuService {

    List<ChucVu> getDSChucVu();

    ChucVu findById(Long id);

    String update(ChucVu chucVu);

    ChucVu insert(ChucVu chucVu);
}
