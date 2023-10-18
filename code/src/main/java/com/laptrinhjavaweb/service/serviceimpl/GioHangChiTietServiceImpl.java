package com.laptrinhjavaweb.service.serviceimpl;

import com.laptrinhjavaweb.entity.GioHangChiTiet;
import com.laptrinhjavaweb.entity.GioHangChiTietId;
import com.laptrinhjavaweb.repository.GioHangChiTietRepository;
import com.laptrinhjavaweb.service.GioHangChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class GioHangChiTietServiceImpl implements GioHangChiTietService {
    @Autowired
    GioHangChiTietRepository gioHangChiTietRepository;
    @Override
    public String thayDoiSoLuong(Long idSP, Long idGH, Integer soLuong) {
        try{
            GioHangChiTietId gioHangChiTietId = new GioHangChiTietId(idGH,idSP);
            GioHangChiTiet gioHangChiTiet = gioHangChiTietRepository.getOne(gioHangChiTietId);
            gioHangChiTiet.setSoLuong(gioHangChiTiet.getSoLuong()+soLuong);
            gioHangChiTietRepository.save(gioHangChiTiet);
            return "Thay đổi số lượng thành công";
        }catch (Exception e){
            return "Có lỗi xảy ra";
        }
    }

    @Override
    public List<GioHangChiTiet> dsGioHangChiTietByIdKh(Long idKH) {
        return gioHangChiTietRepository.dsGioHangChiTietByIdKh(idKH);
    }

    @Override
    public BigDecimal tongTien(Long idKH) {
        return gioHangChiTietRepository.tongTien(idKH);
    }

}
