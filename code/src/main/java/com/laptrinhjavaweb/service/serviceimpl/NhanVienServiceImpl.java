package com.laptrinhjavaweb.service.serviceimpl;

import com.laptrinhjavaweb.entity.NhanVien;
import com.laptrinhjavaweb.repository.NhanVienRepository;
import com.laptrinhjavaweb.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienServiceImpl implements NhanVienService {

    @Autowired
    private NhanVienRepository nhanVienRepository;

    @Override
    public List<NhanVien> getDsNhanVien() {
        return nhanVienRepository.findAll();
    }

    @Override
    public NhanVien insert(NhanVien nhanVien) {
        return nhanVienRepository.save(nhanVien);
    }

    @Override
    public void delete(Long id) {
        nhanVienRepository.deleteById(id);
    }
}
