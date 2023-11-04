package com.laptrinhjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhjavaweb.entity.DanhMuc;

public interface DanhMucRepository extends JpaRepository<DanhMuc, Long>{
	
	DanhMuc findBySlug(String slug);

}
