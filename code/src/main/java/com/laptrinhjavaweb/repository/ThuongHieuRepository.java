package com.laptrinhjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.ThuongHieu;

public interface ThuongHieuRepository extends JpaRepository<ThuongHieu, Long>{
	
	ThuongHieu findBySlug(String slug);

}
