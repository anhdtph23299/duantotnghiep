package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.entity.HoaDon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HoaDonRepository extends JpaRepository<HoaDon,Long> {

    @Query("select hd from HoaDon hd order by hd.ngayDat desc")
    List<HoaDon> dsHoaDon();

}
