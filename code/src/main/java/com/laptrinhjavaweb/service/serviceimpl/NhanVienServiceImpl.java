package com.laptrinhjavaweb.service.serviceimpl;

import com.laptrinhjavaweb.entity.NhanVien;
import com.laptrinhjavaweb.repository.NhanVienRepository;
import com.laptrinhjavaweb.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class NhanVienServiceImpl implements NhanVienService {

    @Autowired
    private NhanVienRepository nhanVienRepository;

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
    public NhanVien findByEmail(String email) {
        return nhanVienRepository.findByEmail(email);
    }


    @Override
    public String generateRandomPassword() {
        java.util.Random random = new Random();
        int password = 1000 + random.nextInt(9000);
        return String.valueOf(password);
    }
}
