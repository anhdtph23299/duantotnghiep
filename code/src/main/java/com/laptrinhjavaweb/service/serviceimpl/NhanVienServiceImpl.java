package com.laptrinhjavaweb.service.serviceimpl;

import com.laptrinhjavaweb.converter.NhanVienConvertToDto;
import com.laptrinhjavaweb.dto.LoginDto;
import com.laptrinhjavaweb.dto.LoginMessage;
import com.laptrinhjavaweb.dto.NhanVienDto;
import com.laptrinhjavaweb.entity.NhanVien;
import com.laptrinhjavaweb.repository.NhanVienRepository;
import com.laptrinhjavaweb.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NhanVienServiceImpl implements NhanVienService {

    @Autowired
    private NhanVienRepository nhanVienRepository;

    @Autowired
    NhanVienConvertToDto nhanVienConvertToDto;
    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public List<NhanVien> getDsNhanVien() {
        return nhanVienRepository.findAll();
    }

    @Override
    public NhanVien findById(Long id) {
        Optional<NhanVien> nhanVien= nhanVienRepository.findById(id);
        return nhanVien.orElse(null);
    }

    @Override
    public String update(NhanVien nhanVien) {
        if(nhanVienRepository.findById(nhanVien.getId()).orElse(null)==null){
            return "Không có mã nhân viên này";
        }
        return nhanVienRepository.save(nhanVien)!=null?"Sửa thành công":"Thêm thất bại";
    }

    @Override
    public NhanVien insert(NhanVien nhanVien) {
        return nhanVienRepository.save(nhanVien);
    }

    @Override
    public void delete(Long id) {
        nhanVienRepository.deleteById(id);
    }

    @Override
    public List<NhanVien> getSearchNhanVien(String maNV, String tenNV, String email, String sdt) {
        return nhanVienRepository.findByMaNVContainingOrTenNVContainingOrEmailContainingOrSdtContaining(maNV, tenNV, email, sdt);
    }

    @Override
    public NhanVien addNhanVien(NhanVienDto dto) {
        NhanVien nv = nhanVienConvertToDto.convertToDto(dto);
        this.nhanVienRepository.save(nv);
        return nv;
    }

    @Override
    public LoginMessage loginKhachHang(LoginDto loginDto) {
        NhanVien nv1 = this.nhanVienRepository.findByEmail(loginDto.getEmail());
        if(nv1 != null){
            String pass = loginDto.getPassword();
            String encodedPassword = nv1.getMatKhau();
            Boolean isCheck = passwordEncoder.matches(pass, encodedPassword);
            if(isCheck ){
                Optional<NhanVien> nv = nhanVienRepository.findByEmailAndMatKhau(loginDto.getEmail(), encodedPassword);
                if(nv.isPresent()){
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
