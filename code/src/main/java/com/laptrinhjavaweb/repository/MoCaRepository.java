package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.entity.MoCa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;

public interface MoCaRepository extends JpaRepository<MoCa, Long> {

//    @Query("SELECT m.thoiGian FROM MoCa m ORDER BY m.id DESC")
//    LocalDateTime findLastThoiGian();

}
