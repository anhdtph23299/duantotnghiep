package com.laptrinhjavaweb.service.serviceimpl;

import com.laptrinhjavaweb.entity.BienThe;
import com.laptrinhjavaweb.entity.GioHang;
import com.laptrinhjavaweb.entity.GioHangChiTiet;
import com.laptrinhjavaweb.entity.HoaDon;
import com.laptrinhjavaweb.entity.HoaDonChiTiet;
import com.laptrinhjavaweb.entity.KhachHang;
import com.laptrinhjavaweb.entity.ThongTinMuaHang;
import com.laptrinhjavaweb.model.response.HoaDonChiTietResponse;
import com.laptrinhjavaweb.repository.BienTheRepository;
import com.laptrinhjavaweb.repository.GioHangChiTietRepository;
import com.laptrinhjavaweb.repository.GioHangRepository;
import com.laptrinhjavaweb.repository.HoaDonChiTietRepository;
import com.laptrinhjavaweb.repository.HoaDonRepository;
import com.laptrinhjavaweb.repository.KhachHangRepository;
import com.laptrinhjavaweb.repository.ThongTinMuaHangRepository;
import com.laptrinhjavaweb.service.HoaDonService;
import com.laptrinhjavaweb.util.base.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class HoaDonServiceImpl implements HoaDonService {

    @Autowired
    GioHangRepository gioHangRepository;
    @Autowired
    HoaDonRepository hoaDonRepository;

    @Autowired
    KhachHangRepository khachHangRepository;

    @Autowired
    GioHangChiTietRepository gioHangChiTietRepo;

    @Autowired
    BienTheRepository bienTheRepository;

    @Autowired
    HoaDonChiTietRepository hoaDonChiTietRepository;

    @Autowired
    ThongTinMuaHangRepository thongTinMuaHangRepository;

    @Override
    public HoaDon findById(Long idhd) {
        return hoaDonRepository.findById(idhd).orElse(null);
    }

    @Override
    @Transactional
    public ResponseObject taoHoaDonByIdGioHangChiTiet(Long idkh, List<Integer> idghct) {
        HoaDon hoaDon = hoaDonRepository.getHoaDonMoiTaoByIdkh(idkh);
        if (hoaDon!=null){
            return new ResponseObject("Đang có hoá đơn trạng thái chưa giao hàng,vui lòng xem lại");
        }
        KhachHang khachHang = khachHangRepository.findById(idkh).orElse(null);
        hoaDon = new HoaDon();
        hoaDon.setKhachHang(khachHang);
        hoaDon.setTrangThai(10);
        hoaDon.setNgayDat(new Date());
        hoaDon = hoaDonRepository.save(hoaDon);
        List<Long> dsghct = new ArrayList<>();
        for (Integer integer :idghct
             ) {
            dsghct.add(Long.valueOf(integer));
        }
        assert khachHang != null;
        GioHang gioHang = gioHangRepository.findGioHangByIdkh(khachHang.getGioHang().getId());
        List<GioHangChiTiet> dsGioHangChiTiet = gioHangChiTietRepo.dsGioHangChiTietByIdGioHang(gioHang.getId(),dsghct);
        for (GioHangChiTiet gioHangChiTiet:dsGioHangChiTiet) {
           // GioHangChiTiet gioHangChiTiet = gioHangChiTietRepo.findById(Long.valueOf(idghct)).orElse(null);
            BienThe bienThe = gioHangChiTiet.getBienThe();
            HoaDonChiTiet hoaDonChiTiet = new HoaDonChiTiet();
            hoaDonChiTiet.setBienThe(bienThe);
            hoaDonChiTiet.setHoaDon(hoaDon);
            hoaDonChiTiet.setSoLuong(gioHangChiTiet.getSoLuong());
            hoaDonChiTiet.setDonGia(bienThe.getGia());
            hoaDonChiTietRepository.save(hoaDonChiTiet);
            gioHangChiTiet.setTrangThai(0);
            gioHangChiTietRepo.save(gioHangChiTiet);
        }
        return new ResponseObject("Tạo hoá đơn thành công");
    }

    @Override
    public HoaDon findHoaDonMoiDat(Long idkh) {
        return hoaDonRepository.getHoaDonMoiTaoByIdkh(idkh);
    }

    @Override
    public List<HoaDonChiTietResponse> dsHoaDonChiTietByIdHoaDon(Long idhd) {
        return hoaDonChiTietRepository.dsHoaDonChiTietByIdHoaDon(idhd);
    }

    @Override
    public BigDecimal tongTienTheoHoaDon(Long idhd) {
        return hoaDonRepository.tongTienByHoaDon(idhd);
    }


    @Override
    public List<HoaDon> getDsHoaDon() {
        return hoaDonRepository.findAll();
    }

    @Override
    public HoaDon saveOrUpdate(HoaDon hoaDon) {
        return hoaDonRepository.save(hoaDon);
    }

    @Override
    public void delete(Long id) {
        hoaDonRepository.deleteById(id);
    }

    @Override
    public String getCurrentDateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
