package com.laptrinhjavaweb.service.serviceimpl;

import com.laptrinhjavaweb.converter.KhachHangConvertToDto;
import com.laptrinhjavaweb.dto.KhachHangDto;
import com.laptrinhjavaweb.dto.LoginDto;
import com.laptrinhjavaweb.dto.LoginMessage;
import com.laptrinhjavaweb.entity.KhachHang;
import com.laptrinhjavaweb.repository.KhachHangRepository;
import com.laptrinhjavaweb.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KhachHangServiceImpl implements KhachHangService {

    @Autowired
    KhachHangRepository khachHangRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    KhachHangConvertToDto convert;

    @Override
    public List<KhachHang> getDsKhachHang() {
        return khachHangRepository.findAll();
    }

    @Override
    public KhachHang findById(Long id) {
        Optional<KhachHang> khachHang= khachHangRepository.findById(id);
        return khachHang.orElse(null);
    }

    @Override
    public String update(KhachHang khachHang) {
        if(khachHangRepository.findById(khachHang.getId()).orElse(null)==null){
            return "Không có mã khách hàng này";
        }
        return khachHangRepository.save(khachHang)!=null?"Sửa thành công":"Thêm thất bại";
    }

    @Override
    public KhachHang insert(KhachHang khachHang) {
        return khachHangRepository.save(khachHang);
    }

    @Override
    public void delete(Long id) {
        khachHangRepository.deleteById(id);
    }

    @Override
    public List<KhachHang> getSearchKhachHang( String maKH, String tenKH, String email, String sdt, String diaChi, String cccd) {
        return khachHangRepository.findByMaKHContainingOrTenKHContainingOrEmailContainingOrSdtContainingOrDiaChiContainingOrCccdContaining(maKH,tenKH,email,sdt,diaChi,cccd);
    }

    @Override
    public KhachHang addKhachHang(KhachHangDto khachHangDto) {
        KhachHang kh = convert.convertoDto(khachHangDto);
        khachHangRepository.save(kh);
        return kh;
    }

    @Override
    public LoginMessage loginKhachHang(LoginDto loginDto) {
        KhachHang kh1 = khachHangRepository.findByEmail(loginDto.getEmail());
        if(kh1 != null){
            String pass = loginDto.getPassword();
            String encodedPassword = kh1.getMatKhau();
            Boolean isCheck = passwordEncoder.matches(pass, encodedPassword);
            if(isCheck ){
                Optional<KhachHang> kh = khachHangRepository.findByEmailAndMatKhau(loginDto.getEmail(), encodedPassword);
                if(kh.isPresent()){
                    return new LoginMessage("Login thanh cong", true);
                }else{
                    return  new LoginMessage("Login that bai", false);
                }
            }else{
                return new LoginMessage("Mat khau khong chinh xac", false);
            }
        }else{
            return new LoginMessage("Email khong chinh xac", false);
        }
    }


}
