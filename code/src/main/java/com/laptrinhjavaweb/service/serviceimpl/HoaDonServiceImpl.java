package com.laptrinhjavaweb.service.serviceimpl;

import com.laptrinhjavaweb.entity.HoaDon;
import com.laptrinhjavaweb.repository.HoaDonRepository;
import com.laptrinhjavaweb.service.HoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HoaDonServiceImpl implements HoaDonService {
    @Autowired
    HoaDonRepository hoaDonRepository;
    @Override
    public List<HoaDon> getDsHoaDon() {
        return hoaDonRepository.findAll();
    }

    @Override
    public HoaDon insert(HoaDon hoaDon) {
        return hoaDonRepository.save(hoaDon);
    }

    @Override
    public void delete(Long id) {
        hoaDonRepository.deleteById(id);
    }
}
