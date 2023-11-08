package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.entity.GioHang;
import com.laptrinhjavaweb.model.response.GioHangResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GioHangRepository extends JpaRepository<GioHang,Long> {

    @Query("select gh from GioHang gh where gh.khachHang.id=:idkh")
    GioHang findGioHangByIdkh(@Param("idkh")Long idkh);
}
