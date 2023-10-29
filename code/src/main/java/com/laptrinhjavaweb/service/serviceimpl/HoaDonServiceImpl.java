package com.laptrinhjavaweb.service.serviceimpl;

import com.laptrinhjavaweb.entity.GioHangChiTiet;
import com.laptrinhjavaweb.entity.HoaDon;
import com.laptrinhjavaweb.entity.KhachHang;
import com.laptrinhjavaweb.repository.GioHangChiTietRepository;
import com.laptrinhjavaweb.repository.HoaDonRepository;
import com.laptrinhjavaweb.repository.KhachHangRepository;
import com.laptrinhjavaweb.service.HoaDonService;
import com.laptrinhjavaweb.util.base.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public ResponseObject taoHoaDonByIdGioHangChiTiet(Long idkh, List<Long> idGhct) {
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

        for (Long idghct:idGhct) {
            GioHangChiTiet gioHangChiTiet = gioHangChiTietRepo.findById(idghct).orElse(null);
            if (gioHangChiTiet==null){
                return new ResponseObject("Có lỗi xảy ra khi không tìm thấy sản phẩm trong giỏ hàng");
            }

        }
        return null;
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
