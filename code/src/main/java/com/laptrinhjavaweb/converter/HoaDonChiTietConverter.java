package com.laptrinhjavaweb.converter;

import com.laptrinhjavaweb.dto.BienTheDTO;
import com.laptrinhjavaweb.dto.HoaDonChiTietDTO;
import com.laptrinhjavaweb.dto.HoaDonDTO;
import com.laptrinhjavaweb.dto.SanPhamDTO;
import com.laptrinhjavaweb.entity.HoaDonChiTiet;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HoaDonChiTietConverter {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private SanPhamConverter sanPhamConverter;
    @Autowired
    private HoaDonConverter hoaDonConverter;
    @Autowired
    private BienTheConverter bienTheConverter;

    public HoaDonChiTietDTO convertToDTO (HoaDonChiTiet entity){
        HoaDonChiTietDTO result = new HoaDonChiTietDTO();
        SanPhamDTO sp = sanPhamConverter.convertToDTO(entity.getSanPham());
        HoaDonDTO hd = hoaDonConverter.convertToDTO(entity.getHoaDon());
        BienTheDTO bt = bienTheConverter.convertToDTO(entity.getBienThe());
        result.setHoaDonDTO(hd);
        result.setSanPhamDTO(sp);
        result.setBienTheDTO(bt);
        result.setThanhTien(result.getDonGia() * result.getSoLuong());
        return result;
    }
}
