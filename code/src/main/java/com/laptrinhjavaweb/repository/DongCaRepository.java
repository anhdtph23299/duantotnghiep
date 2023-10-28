package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.entity.DongCa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DongCaRepository extends JpaRepository<DongCa, Long> {

}
