package com.laptrinhjavaweb.service.serviceimpl;

import com.laptrinhjavaweb.entity.GioHangChiTiet;
import com.laptrinhjavaweb.model.request.ThayDoiSoLuongGioHangRequest;
import com.laptrinhjavaweb.model.response.GioHangResponse;
import com.laptrinhjavaweb.repository.GioHangChiTietRepository;
import com.laptrinhjavaweb.service.GioHangChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class GioHangChiTietServiceImpl implements GioHangChiTietService {
    @Autowired
    GioHangChiTietRepository gioHangChiTietRepository;

    @Override
    public GioHangResponse thayDoiSoLuong(ThayDoiSoLuongGioHangRequest request) {
        try {
            GioHangChiTiet gioHangChiTiet = gioHangChiTietRepository.findById(request.getIdGhct()).orElse(null);
            if (gioHangChiTiet==null){
                return null;
            }
            gioHangChiTiet.setSoLuong(gioHangChiTiet.getSoLuong() + request.getSoLuong());
         gioHangChiTiet =    gioHangChiTietRepository.save(gioHangChiTiet);

            return gioHangChiTietRepository.getGioHangResponseById(gioHangChiTiet.getId());
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<GioHangResponse> dsGioHangChiTietByIdKh(Long idKH) {
        return gioHangChiTietRepository.dsGioHangChiTietByIdKh(idKH);
    }

    @Override
    public BigDecimal tongTien(Long idKH) {
        return gioHangChiTietRepository.tongTien(idKH);
    }

    @Override
    public BigDecimal tongTienTheoGioHangChiTiet(Long idKH, List<Long> lstGhct) {
        return gioHangChiTietRepository.tongTienTheoGioHangChiTiet(idKH, lstGhct);
    }

    @Override
    public List<List<GioHangResponse>> dsGioHangChiaTheoSanPham(Long idKh) {
        List<Long> dsIdSanPham = gioHangChiTietRepository.getDsIdSanPhamByKhachHang(idKh);
        System.out.println(dsIdSanPham);
        List<List<GioHangResponse>> dsGioHangChiaTheoSanPham = new ArrayList<>();
        for (Long id: dsIdSanPham
             ) {
            dsGioHangChiaTheoSanPham.add(gioHangChiTietRepository.getDsspThuocTinhByIdSanPhamAndIdKh(id,idKh));
        }
        return dsGioHangChiaTheoSanPham;
    }


}
