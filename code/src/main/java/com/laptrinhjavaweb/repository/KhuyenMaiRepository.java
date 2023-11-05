package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.entity.KhuyenMai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface KhuyenMaiRepository extends JpaRepository<KhuyenMai, Long> {

    @Query(value = "select * from khuyenmai km left join sanphamgiamgia spgg on km.id = spgg.idkhuyenmai", nativeQuery = true)
    List<KhuyenMai> findAllKhuyenMai();

}
