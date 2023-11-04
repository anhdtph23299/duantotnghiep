package com.laptrinhjavaweb.service.serviceimpl;

import com.laptrinhjavaweb.entity.SanPhamGiamGia;
import com.laptrinhjavaweb.repository.SanPhamGiamGiaRepository;
import com.laptrinhjavaweb.service.SanPhamGiamGiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SanPhamGiamGiaServiceImpl implements SanPhamGiamGiaService {
    @Autowired
    private SanPhamGiamGiaRepository sanPhamGiamGiaRepository;

    @Override
    public List<SanPhamGiamGia> getAll() {
        List<SanPhamGiamGia> list = sanPhamGiamGiaRepository.findAll();
        return list;
    }

    @Override
    public List<SanPhamGiamGia> create(List<SanPhamGiamGia> list) {
        List<SanPhamGiamGia> result = new ArrayList<>();
        for (SanPhamGiamGia spgg: list
             ) {
            SanPhamGiamGia sanPhamGiamGia = this.sanPhamGiamGiaRepository.save(spgg);
            result.add(sanPhamGiamGia);
        }
        return result;
    }

    @Override
    public String delete(List<SanPhamGiamGia> list) {
        for (SanPhamGiamGia spgg: list
        ) {
            this.sanPhamGiamGiaRepository.delete(spgg);
        }
        return "Xóa";
    }

    @Override
    public List<SanPhamGiamGia> update(List<SanPhamGiamGia> list) {
        List<SanPhamGiamGia> result = new ArrayList<>();
        for (SanPhamGiamGia spgg: list
        ) {
            SanPhamGiamGia sanPhamGiamGia = this.sanPhamGiamGiaRepository.save(spgg);
            result.add(sanPhamGiamGia);
        }
        return result;
    }

    @Override
    public List<SanPhamGiamGia> findById(Long id) {
        List<SanPhamGiamGia> list = this.sanPhamGiamGiaRepository.findSanPhamGiamGiaByGiamGia(id);
        return list;
    }
}
