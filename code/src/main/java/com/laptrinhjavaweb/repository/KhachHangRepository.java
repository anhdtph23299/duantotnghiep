package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.entity.KhachHangEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KhachHangRepository extends JpaRepository<KhachHangEntity, Long> {

    KhachHangEntity findByMaAndTrangthai(String ma, int trangThai);

    KhachHangEntity findByMaAndMatkhau(String ma, String matkhau);
}
