package com.laptrinhjavaweb.service.serviceimpl;

import com.laptrinhjavaweb.entity.KhachHang;
import com.laptrinhjavaweb.repository.KhachHangRepository;
import com.laptrinhjavaweb.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhachHangServiceImpl implements KhachHangService {

    @Autowired
    KhachHangRepository khachHangRepository;

    @Override
    public List<KhachHang> getDsKhachHang() {
        return khachHangRepository.findAll();
    }

    @Override
    public String insert(KhachHang khachHang) {
        return khachHangRepository.save(khachHang)!=null?"Tạo mới khách hàng thành công":"Có lỗi xảy ra";
    }

    @Override
    public void delete(Long id) {
        khachHangRepository.deleteById(id);
    }


}
