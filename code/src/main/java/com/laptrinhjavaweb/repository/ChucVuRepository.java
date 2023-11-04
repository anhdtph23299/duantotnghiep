package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.entity.ChucVu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChucVuRepository extends JpaRepository<ChucVu, Long> {

    ChucVu findByMaCV(String maChucVu);
}

