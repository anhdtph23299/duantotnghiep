package com.laptrinhjavaweb.converter;

import com.laptrinhjavaweb.dto.NhanVienDto;
import com.laptrinhjavaweb.entity.NhanVien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class NhanVienConvertToDto {
    @Autowired
    private PasswordEncoder passwordEncoder;

    public NhanVien convertToDto (NhanVienDto dto){
        NhanVien nv = new NhanVien();
        nv.setMaNV(dto.getMaNV());
        nv.setTenNV(dto.getTenNV());
        nv.setEmail(dto.getEmail());
        nv.setMatKhau(this.passwordEncoder.encode(dto.getMatKhau()));
        return nv;
    }
}
