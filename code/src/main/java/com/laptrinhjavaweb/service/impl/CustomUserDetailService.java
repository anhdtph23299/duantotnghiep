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

@Service(value = "userCustomService")
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private INhanVienService nhanVienService;

    @Autowired
    private IKhachHangService khachHangService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        MyUserDetail myUserDetail = null;
        NhanVienDTO nhanVienDTO = nhanVienService.findByMaAndTrangthai(username, SystemConstant.STATUS_IN_ACTICE);
        List<GrantedAuthority> authorities = new ArrayList<>();
        if(nhanVienDTO != null){
            authorities.add(new SimpleGrantedAuthority("ROLE_" + nhanVienDTO.getChucVuDTO().getMa()));
            myUserDetail = new MyUserDetail(username, nhanVienDTO.getMatkhau(), true, true, true, true, authorities);
            myUserDetail.setFullname(nhanVienDTO.getTen());
            myUserDetail.setChucvu(nhanVienDTO.getChucVuDTO().getMa());
            BeanUtils.copyProperties(nhanVienDTO, myUserDetail);
        }
        KhachHangDTO khachHangDTO = khachHangService.findByMaAndTrangthai(username, SystemConstant.STATUS_ACTICE);
        if (khachHangDTO != null) {
            authorities.add(new SimpleGrantedAuthority("ROLE_" + SystemConstant.ROLE_CUSTOMER));
            myUserDetail = new MyUserDetail(username, khachHangDTO.getMatkhau(), true, true, true, true, authorities);
            myUserDetail.setFullname(khachHangDTO.getTen());
            myUserDetail.setChucvu("CUSTOMER");
            BeanUtils.copyProperties(khachHangDTO, myUserDetail);
        }
        if(myUserDetail == null){
            throw new UsernameNotFoundException("User name not found");
        }
        return myUserDetail;
    }
}
