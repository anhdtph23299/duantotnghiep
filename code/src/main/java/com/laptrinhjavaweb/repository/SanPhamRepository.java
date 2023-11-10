package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.repository.custom.SanPhamRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.SanPhamEntity;

public interface SanPhamRepository extends JpaRepository<SanPhamEntity, Long>, SanPhamRepositoryCustom {

	SanPhamEntity findBySlug(String slug);
}
