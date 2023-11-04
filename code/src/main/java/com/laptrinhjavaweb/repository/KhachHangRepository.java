package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.entity.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KhachHangRepository extends JpaRepository<KhachHang, Long> {

    KhachHang findByMaKHAndTrangThai(String maKhachHang, int trangThai);

    List<KhachHang> findByMaKHContainingOrTenKHContainingOrEmailContainingOrSdtContainingOrDiaChiContainingOrCccdContaining(String maKH, String tenKH, String email, String sdt, String diaChi, String cccd);
}

