package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.entity.SanPhamGiamGia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SanPhamGiamGiaRepository extends JpaRepository<SanPhamGiamGia, Long> {

    @Query("select sp from SanPhamGiamGia sp where sp.khuyenMai = ?1")
    List<SanPhamGiamGia> findSanPhamGiamGiaByGiamGia(Long idproduct);


}
