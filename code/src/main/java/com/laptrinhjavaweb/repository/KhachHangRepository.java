package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.entity.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface KhachHangRepository extends JpaRepository<KhachHang,Long> {

        List<KhachHang> findByMaKHContainingOrTenKHContainingOrEmailContainingOrSdtContainingOrDiaChiContainingOrCccdContaining(String maKH, String tenKH, String email, String sdt, String diaChi, String cccd);

        Optional<KhachHang> findByEmailAndMatKhau(String email, String matKhau);

        KhachHang findByEmail(String email);
}
