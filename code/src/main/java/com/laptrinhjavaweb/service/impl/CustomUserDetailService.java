package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.constant.SystemConstant;
import com.laptrinhjavaweb.dto.KhachHangDTO;
import com.laptrinhjavaweb.dto.MyUserDetail;
import com.laptrinhjavaweb.dto.NhanVienDTO;
import com.laptrinhjavaweb.service.IKhachHangService;
import com.laptrinhjavaweb.service.INhanVienService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private INhanVienService nhanVienService;

    @Autowired
    private IKhachHangService khachHangService;

    @Override
    public UserDetails loadUserByUsername(String ma) throws UsernameNotFoundException {
        MyUserDetail myUserDetail = null;
        NhanVienDTO nhanVienDTO = nhanVienService.findByMaNVAndTrangThai(ma, SystemConstant.STATUS_ACTICE);
        List<GrantedAuthority> authorities = new ArrayList<>();
        if(nhanVienDTO != null){
            authorities.add(new SimpleGrantedAuthority("ROLE_" + nhanVienDTO.getChucVuDTO().getMaCV()));
            myUserDetail = new MyUserDetail(ma, nhanVienDTO.getMatKhau(), true, true, true, true, authorities);
            myUserDetail.setFullName(nhanVienDTO.getTenNV());
            BeanUtils.copyProperties(nhanVienDTO, myUserDetail);
        }
        KhachHangDTO khachHangDTO = khachHangService.findByMaKHAndTrangThai(ma, SystemConstant.STATUS_ACTICE);
        if (khachHangDTO != null) {
            authorities.add(new SimpleGrantedAuthority("ROLE_" + SystemConstant.ROLE_CUSTOMER));
            myUserDetail = new MyUserDetail(ma, khachHangDTO.getMatKhau(), true, true, true, true, authorities);
            myUserDetail.setFullName(khachHangDTO.getTenKH());
            BeanUtils.copyProperties(khachHangDTO, myUserDetail);
        }
        if(myUserDetail == null){
            throw new UsernameNotFoundException("User name not found");
        }
        return myUserDetail;
    }
}
