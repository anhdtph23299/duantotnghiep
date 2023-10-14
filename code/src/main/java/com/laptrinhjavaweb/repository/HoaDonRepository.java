package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.entity.HoaDon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoaDonRepository extends JpaRepository<HoaDon,Long> {
}
