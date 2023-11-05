package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.entity.SanPhamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SanPhamRepository extends JpaRepository<SanPhamEntity, Long> {
}
