package com.laptrinhjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.SanPham;

public interface SanPhamRepository extends JpaRepository<SanPham, Long>{

	SanPham findBySlug(String slug);
}
