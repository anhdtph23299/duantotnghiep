package com.laptrinhjavaweb.repository;


import com.laptrinhjavaweb.entity.NhanVienEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NhanVienRepository extends JpaRepository<NhanVienEntity, Long> {

    NhanVienEntity findByMaAndTrangthai(String ma, int status);

    NhanVienEntity findByMa(String ma);

    NhanVienEntity findByMaAndMatkhau(String ma, String matkhau);
}
