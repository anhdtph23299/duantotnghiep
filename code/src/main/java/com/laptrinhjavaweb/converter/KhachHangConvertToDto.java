package com.laptrinhjavaweb.converter;

import com.laptrinhjavaweb.dto.KhachHangDto;
import com.laptrinhjavaweb.entity.KhachHang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class KhachHangConvertToDto {
    @Autowired
    private PasswordEncoder passwordEncoder;
    public KhachHang convertoDto(KhachHangDto khachHangDto){
//        KhachHang khachHang = new KhachHang(
//                khachHangDto.getMaKH(),
//                khachHangDto.getTenKH(),
//                khachHangDto.getSdt(),
//                khachHangDto.getEmail(),
//                khachHangDto.getGioiTinh(),
//                khachHangDto.getNgaySinh(),
//                khachHangDto.getTrangThai(),
//                khachHangDto.getDiaChi(),
//                khachHangDto.getCccd(),
//                khachHangDto.getMoTa(),
//                this.passwordEncoder.encode(khachHangDto.getMatKhau())
//        );
        KhachHang khachHang = new KhachHang();
        return khachHang;
    }
}
