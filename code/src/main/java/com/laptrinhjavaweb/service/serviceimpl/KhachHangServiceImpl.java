package com.laptrinhjavaweb.service.serviceimpl;

import com.laptrinhjavaweb.entity.KhachHang;
import com.laptrinhjavaweb.repository.KhachHangRepository;
import com.laptrinhjavaweb.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KhachHangServiceImpl implements KhachHangService {

    @Autowired
    KhachHangRepository khachHangRepository;

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
    public String insert(KhachHang khachHang) {
        return khachHangRepository.save(khachHang)!=null?"Tạo mới khách hàng thành công":"Có lỗi xảy ra";
    }

    @Override
    public void delete(Long id) {
        khachHangRepository.deleteById(id);
    }


}
