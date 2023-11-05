package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NhanVienRepository extends JpaRepository<NhanVien, Long> {

    NhanVien findByMaNVAndTrangThai(String maNhanVien, int status);

    List<NhanVien> findByMaNVContainingOrTenNVContainingOrEmailContainingOrSdtContaining(String maNV, String tenNV, String email, String sdt);

    NhanVien findByEmail(String email);
}
