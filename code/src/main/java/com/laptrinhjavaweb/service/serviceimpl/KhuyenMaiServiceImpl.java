package com.laptrinhjavaweb.service.serviceimpl;

import com.laptrinhjavaweb.entity.KhuyenMai;
import com.laptrinhjavaweb.repository.KhuyenMaiRepository;
import com.laptrinhjavaweb.service.KhuyenMaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhuyenMaiServiceImpl implements KhuyenMaiService {

    @Autowired
    KhuyenMaiRepository khuyenMaiRepository;

    @Override
    public List<KhuyenMai> getAll() {
        return this.khuyenMaiRepository.findAll();
    }

    @Override
    public KhuyenMai findById(Long id) {
        return this.khuyenMaiRepository.findById(id).orElse(null);
    }

    @Override
    public String insert(KhuyenMai khuyenMai) {
        KhuyenMai km = this.khuyenMaiRepository.save(khuyenMai);
        if(km != null){
            return "Insert thanh cong";
        }else{
            return "Insert that bai";
        }
    }

    @Override
    public String update(KhuyenMai khuyenMai, Long id) {
        return null;
    }

    @Override
    public String delete(Long id) {
        KhuyenMai km = this.khuyenMaiRepository.findById(id).orElse(null);
        if(km != null){
            this.khuyenMaiRepository.delete(km);
            return "Xoa thanh cong";
        }else{
            return "Khong tim thay";
        }
    }
}
