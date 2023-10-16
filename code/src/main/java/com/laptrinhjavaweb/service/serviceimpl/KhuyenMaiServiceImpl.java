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
    private KhuyenMaiRepository khuyenMaiRepository;

    @Override
    public List<KhuyenMai> getAll() {
        return this.khuyenMaiRepository.findAll();
    }

    @Override
    public KhuyenMai findById(Long id) {
        return this.khuyenMaiRepository.findById(id).orElse(null);
    }
}
