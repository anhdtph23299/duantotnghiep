package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface NhanVienRepository extends JpaRepository<NhanVien, Long> {

    List<NhanVien> findByMaNVContainingOrTenNVContainingOrEmailContainingOrSdtContaining(String maNV, String tenNV, String email, String sdt);

    Optional<NhanVien> findByEmailAndMatKhau(String email, String matKhau);

    NhanVien findByEmail(String email);

}
