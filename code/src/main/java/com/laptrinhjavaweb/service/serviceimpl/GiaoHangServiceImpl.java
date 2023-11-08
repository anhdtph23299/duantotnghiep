package com.laptrinhjavaweb.service.serviceimpl;

import com.laptrinhjavaweb.entity.HoaDon;
import com.laptrinhjavaweb.entity.KhachHang;
import com.laptrinhjavaweb.entity.ThongTinMuaHang;
import com.laptrinhjavaweb.entity.enumentity.PhuongThucThanhToanEnum;
import com.laptrinhjavaweb.model.datarq.SanPhamGhnApi;
import com.laptrinhjavaweb.model.request.ThongTinDatHangRequest;
import com.laptrinhjavaweb.model.response.HoaDonChiTietResponse;
import com.laptrinhjavaweb.model.response.ThongTinMuaHangResponse;
import com.laptrinhjavaweb.service.GiaoHangService;
import com.laptrinhjavaweb.service.HoaDonService;
import com.laptrinhjavaweb.service.KhachHangService;
import com.laptrinhjavaweb.service.ThongTinMuaHangService;
import com.laptrinhjavaweb.util.base.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class GiaoHangServiceImpl implements GiaoHangService {

    @Autowired
    private HoaDonService hoaDonService;

    @Autowired
    private KhachHangService khachHangService;

    @Autowired
    private ThongTinMuaHangService thongTinMuaHangService;
    private String diaChiBuuCuc ="Số 97 Thiên hiền , Phường Mỹ Đình 1, QUận Nam Từ Liêm , Hà Nội, Vietnam";

    private ThongTinDatHangRequest getThongTinDatHangRequest (List<SanPhamGhnApi> dssp,ThongTinMuaHangResponse ttmh){
        ThongTinDatHangRequest request = ThongTinDatHangRequest.builder()
              //  .payment_type_id(2L)
                .note("Chuyển khoản")
                .required_note("KHONGCHOXEMHANG")
                .client_order_code("")
                .from_name("Đinh Tuấn Anh")
                .from_phone("0389478937")
                .cod_amount(70000L)
                .content("Test mua đơn hàng")
                .weight(100)
                .length(10)
                .width(10)
                .height(10)
                .deliver_station_id(null)
                .service_id(0L)
                .service_type_id(2L)
                .build();

        request.setDiaChiNguoiGui(diaChiBuuCuc);
        request.setDsSanPham(dssp);
        request.setNguoiNhan(ttmh.getDiaChi(),ttmh.getSdt(),ttmh.getTenNguoiNhan());
        request.setNguoiThanhToan("NguoiNhan");
        return request;
    }
   private List<SanPhamGhnApi> getListSanPhamGhn(List<HoaDonChiTietResponse> dsHdct){
        List<SanPhamGhnApi> sanPhamGhnApiList = new ArrayList<>();
        for (HoaDonChiTietResponse hdct:dsHdct
             ) {
            sanPhamGhnApiList.add(new SanPhamGhnApi(hdct));
        }
        return  sanPhamGhnApiList;
    }
    @Override
    public ThongTinDatHangRequest getThongTinDatHang(Long idttdathang,Long idkh) {
        List<HoaDonChiTietResponse> dsHdct = dsHoaDonChiTiet(idkh);
        ThongTinMuaHangResponse thongTinMuaHang = thongTinMuaHangService.findThongTinMuaHangById(idttdathang);
        List<SanPhamGhnApi> sanPhamGhnApiList = getListSanPhamGhn(dsHdct);
        ThongTinDatHangRequest request = getThongTinDatHangRequest(sanPhamGhnApiList,thongTinMuaHang);
      //  request.setTo_phone("0325808823");
        return request;
    }


    @Override
    public List<HoaDonChiTietResponse> dsHoaDonChiTiet(Long idkh) {
        HoaDon hoaDon = hoaDonService.findHoaDonMoiDat(idkh);
        List<HoaDonChiTietResponse> dsHdct = hoaDonService.dsHoaDonChiTietByIdHoaDon(hoaDon.getId());
        return dsHdct;
    }


    @Override
    public HoaDon thanhToan(Long idkh,Long idttgh ,PhuongThucThanhToanEnum pttt) {
        KhachHang khachHang = khachHangService.findById(idkh);
        ThongTinMuaHang thongTinMuaHang = thongTinMuaHangService.findById(idttgh);
        HoaDon hoaDon = hoaDonService.findHoaDonMoiDat(khachHang.getId());
        if (hoaDon == null){
            return null;
        }
        hoaDon.setTrangThai(11);
        hoaDon.setNgayDat(new Date());
        hoaDon.setThongTinMuaHang(thongTinMuaHang);
        hoaDon.setPhuongThucThanhToan(pttt);
        return hoaDonService.saveOrUpdate(hoaDon);
    }

    @Override
    public ThongTinDatHangRequest datHangGiaoHangNhanh(Long idhd) {
        HoaDon hoaDon = hoaDonService.findById(idhd);
        List<HoaDonChiTietResponse> dsHdct = dsHoaDonChiTietTheoHoaDon(hoaDon.getId());
        ThongTinMuaHangResponse thongTinMuaHang = thongTinMuaHangService.findThongTinMuaHangById(hoaDon.getThongTinMuaHang().getId());
        List<SanPhamGhnApi> sanPhamGhnApiList = getListSanPhamGhn(dsHdct);
        ThongTinDatHangRequest request = getThongTinDatHangRequest(sanPhamGhnApiList,thongTinMuaHang);
        return request;
    }
    private List<HoaDonChiTietResponse> dsHoaDonChiTietTheoHoaDon(Long idhd) {
        List<HoaDonChiTietResponse> dsHdct = hoaDonService.dsHoaDonChiTietByIdHoaDon(idhd);
        return dsHdct;
    }

}
