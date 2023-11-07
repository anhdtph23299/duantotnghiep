package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.entity.HoaDon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface HoaDonRepository extends JpaRepository<HoaDon,Long> {

    @Query("select hd from HoaDon hd order by hd.ngayDat desc")
    List<HoaDon> dsHoaDon();
    @Query("select hd from HoaDon hd where hd.trangThai = 0 and hd.khachHang.id=:idkh")
    HoaDon getHoaDonMoiTaoByIdkh(@Param("idkh")Long idkh);

    @Query(value = "SELECT SUM(CASE WHEN bt.gia =NULL THEN sp.gia*hdct.soluong ELSE bt.gia*hdct.soluong end)" +
            " hd FROM dbo.hoadon hd" +
            " JOIN dbo.hoadonchitiet hdct ON hdct.idhd = hd.id" +
            " JOIN dbo.bienthe bt ON bt.id = hdct.idbienthe " +
            " JOIN dbo.sanpham sp ON sp.id = bt.sanphamid " +
            " WHERE hd.id =:idhd",nativeQuery = true)
    BigDecimal tongTienByHoaDon(@Param("idhd")Long idhd);

}
