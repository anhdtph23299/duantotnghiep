package com.laptrinhjavaweb.service.serviceimpl;

import com.laptrinhjavaweb.entity.BienTheEntity;
import com.laptrinhjavaweb.entity.GioHangChiTiet;
import com.laptrinhjavaweb.entity.HoaDon;
import com.laptrinhjavaweb.entity.HoaDonChiTiet;
import com.laptrinhjavaweb.entity.KhachHang;
import com.laptrinhjavaweb.entity.ThongTinMuaHang;
import com.laptrinhjavaweb.model.response.HoaDonChiTietResponse;
import com.laptrinhjavaweb.repository.BienTheRepository;
import com.laptrinhjavaweb.repository.GioHangChiTietRepository;
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
import java.util.Date;
import java.util.List;
@Service
public class HoaDonServiceImpl implements HoaDonService {
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
    @Transactional
    public ResponseObject taoHoaDonByIdGioHangChiTiet(Long idkh, List<Integer> idGhct) {
        HoaDon hoaDon = hoaDonRepository.getHoaDonMoiTaoByIdkh(idkh);
        if (hoaDon!=null){
            return new ResponseObject("Đang có hoá đơn trạng thái chưa giao hàng,vui lòng xem lại");
        }
        KhachHang khachHang = khachHangRepository.findById(idkh).orElse(null);
        hoaDon = new HoaDon();
        hoaDon.setKhachHang(khachHang);
        hoaDon.setTrangThai(0);
        hoaDon.setNgayDat(new Date());
        hoaDon = hoaDonRepository.save(hoaDon);

        for (Integer idghct:idGhct) {
            GioHangChiTiet gioHangChiTiet = gioHangChiTietRepo.findById(Long.valueOf(idghct)).orElse(null);
//            if (gioHangChiTiet==null){
//                return new ResponseObject("Có lỗi xảy ra khi không tìm thấy sản phẩm trong giỏ hàng");
//            }

            BienTheEntity bienThe = bienTheRepository.findById(gioHangChiTiet.getId()).orElse(null);
//            if (bienThe==null){
//                return new ResponseObject("Có lỗi xảy ra khi không tìm thấy biến thể này");
//            }
            HoaDonChiTiet hoaDonChiTiet = new HoaDonChiTiet();
            hoaDonChiTiet.setBienThe(bienThe);
            hoaDonChiTiet.setHoaDon(hoaDon);
            hoaDonChiTiet.setSoLuong(gioHangChiTiet.getSoLuong());
            hoaDonChiTiet.setDonGia(BigDecimal.valueOf(bienThe.getGia()));
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
    public List<HoaDon> getDsHoaDon() {
        return hoaDonRepository.findAll();
    }

    @Override
    public String insert(HoaDon hoaDon) {
        return hoaDonRepository.save(hoaDon)!=null?"Tạo hoá đơn thành công":"Có lỗi xảy ra";
    }

    @Override
    public void delete(Long id) {
        hoaDonRepository.deleteById(id);
    }
}
