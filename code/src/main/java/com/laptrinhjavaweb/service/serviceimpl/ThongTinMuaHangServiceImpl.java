package com.laptrinhjavaweb.service.serviceimpl;

import com.laptrinhjavaweb.entity.KhachHang;
import com.laptrinhjavaweb.entity.ThongTinMuaHang;
import com.laptrinhjavaweb.model.request.DiaChiGiaoHangRequest;
import com.laptrinhjavaweb.model.response.ThongTinMuaHangResponse;
import com.laptrinhjavaweb.repository.ThongTinMuaHangRepository;
import com.laptrinhjavaweb.service.ThongTinMuaHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ThongTinMuaHangServiceImpl implements ThongTinMuaHangService {

    @Autowired
    private ThongTinMuaHangRepository thongTinMuaHangRepository;
    @Override
    public ThongTinMuaHangResponse findThongTinMuaHangDefault(Long idkh) {
        return thongTinMuaHangRepository.getTTMuaHangByIdKHAndTrangThai(idkh,2);
    }

    @Override
    public List<ThongTinMuaHangResponse> dsThongTinMuaHang(Long idkh) {
        return thongTinMuaHangRepository.dsThongTinMuaHangByIdKhachHang(idkh);
    }

    @Override
    public String themDiaChiGiaoHang(Long idkh,DiaChiGiaoHangRequest request) {
        KhachHang khachHang = new KhachHang();
        khachHang.setId(idkh);
        ThongTinMuaHang thongTinMuaHang  = ThongTinMuaHang.builder().idThanhPho(request.getIdThanhPho()).
                idHuyen(request.getIdHuyen())
                        .idXa(request.getIdXa())
                                .tenNguoiNhan(request.getTenNguoiNhan())
                                        .sdt(request.getSoDienThoai())
                .khachHang(khachHang)
                .diaChi(request.getDiaChi())
                .soNha(request.getSoNha())
                .build();

        if (request.getMacDinh()){
            thongTinMuaHangRepository.updateTrangThaiThongTinMuaHang(idkh);
            thongTinMuaHang.setTrangThai(2);
        }else{
            thongTinMuaHang.setTrangThai(1);
        }
        thongTinMuaHang = thongTinMuaHangRepository.save(thongTinMuaHang);
        return thongTinMuaHang==null?"Có lỗi xảy ra":"Thêm thành công";
    }

    @Override
    public String suaDiaChiGiaoHang(Long idttgh, DiaChiGiaoHangRequest request) {
        ThongTinMuaHang thongTinMuaHang = thongTinMuaHangRepository.findById(idttgh).orElse(null);
        if (thongTinMuaHang==null){
            return "Không có thông tin mua hàng này";
        }
        KhachHang khachHang = new KhachHang();
        khachHang.setId(thongTinMuaHang.getKhachHang().getId());
        ThongTinMuaHang thongTinMuaHangUpdate  = ThongTinMuaHang.builder().idThanhPho(request.getIdThanhPho()).
                idHuyen(request.getIdHuyen())
                .idXa(request.getIdXa())
                .tenNguoiNhan(request.getTenNguoiNhan())
                .sdt(request.getSoDienThoai())
                .khachHang(khachHang)
                .diaChi(request.getDiaChi())
                .soNha(request.getSoNha())
                .build();
    thongTinMuaHangUpdate.setId(idttgh);
        if (request.getMacDinh()){
            thongTinMuaHangRepository.updateTrangThaiThongTinMuaHang(khachHang.getId());
            thongTinMuaHangUpdate.setTrangThai(2);
        }else{
            thongTinMuaHangUpdate.setTrangThai(1);
        }
        thongTinMuaHang = thongTinMuaHangRepository.save(thongTinMuaHangUpdate);
        return thongTinMuaHang==null?"Có lỗi xảy ra":"Sửa thành công";
    }

    @Override
    public ThongTinMuaHangResponse findThongTinMuaHangById(Long idThongTinMuaHang) {
        return thongTinMuaHangRepository.getThongTinMuaHangByIdTT(idThongTinMuaHang);
    }
}
