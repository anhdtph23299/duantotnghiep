package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.entity.ThongTinMuaHang;
import com.laptrinhjavaweb.model.response.ThongTinMuaHangResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ThongTinMuaHangRepository extends JpaRepository<ThongTinMuaHang,Long> {
    @Query("select tt from ThongTinMuaHang tt where tt.khachHang.id=:idkh and tt.trangThai =:trangthai")
    ThongTinMuaHangResponse getTTMuaHangByIdKHAndTrangThai(@Param("idkh") Long idkh,@Param("trangthai")Integer idtt);

    @Query("select tt from ThongTinMuaHang tt where tt.khachHang.id=:idkh and tt.trangThai <> 0")
    List<ThongTinMuaHangResponse> dsThongTinMuaHangByIdKhachHang(@Param("idkh") Long idkh);
    @Modifying
    @Transactional
    @Query("update ThongTinMuaHang tt set tt.trangThai=1 " +
            "where tt.khachHang.id=:idkh and tt.trangThai <> 0")
    void updateTrangThaiThongTinMuaHang(@Param("idkh") Long idkh);

    @Query("select tt from ThongTinMuaHang tt where tt.id =:idtt")
    ThongTinMuaHangResponse getThongTinMuaHangByIdTT(@Param("idtt")Long idThongTinMuaHang);
}
