package com.laptrinhjavaweb.model.response;

import com.laptrinhjavaweb.entity.ThongTinMuaHang;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = {ThongTinMuaHang.class})
public interface ThongTinMuaHangResponse {

    @Value("#{target.id}")
    Long getId();
    @Value("#{target.tenNguoiNhan}")
    String getTenNguoiNhan();
    @Value("#{target.sdt}")
    String getSdt();
    @Value("#{target.diaChi}")
    String getDiaChi();
    @Value("#{target.soNha}")
    String getSoNha();
    @Value("#{target.idThanhPho}")
    String getIdThanhPho();
    @Value("#{target.idHuyen}")
    String getIdHuyen();
    @Value("#{target.idXa}")
    String getIdXa();
    @Value("#{target.trangThai}")
    String getTrangThai();

    @Value("#{target.macDinh}")
    Boolean getMacDinh();
}
