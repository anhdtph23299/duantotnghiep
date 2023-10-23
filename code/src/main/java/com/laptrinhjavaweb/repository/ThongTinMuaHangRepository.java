package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.entity.ThongTinMuaHang;
import com.laptrinhjavaweb.model.response.ThongTinMuaHangResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ThongTinMuaHangRepository extends JpaRepository<ThongTinMuaHang,Long> {
    @Query("select tt from ThongTinMuaHang tt where tt.khachHang.id=:idkh and tt.trangThai in (:trangthais)")
    ThongTinMuaHang getTTMuaHangByIdKHAndTrangThai(@Param("idkh") Long idkh,@Param("trangthais") List<Integer> trangThai);

    @Query("select tt from ThongTinMuaHang tt where tt.khachHang.id=:idkh and tt.trangThai <> 0")
    List<ThongTinMuaHangResponse> dsThongTinMuaHangByIdKhachHang(@Param("idkh") Long idkh);
}
