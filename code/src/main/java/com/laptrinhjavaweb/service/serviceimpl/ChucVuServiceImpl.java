package com.laptrinhjavaweb.service.serviceimpl;

import com.laptrinhjavaweb.entity.ChucVu;
import com.laptrinhjavaweb.entity.NhanVien;
import com.laptrinhjavaweb.repository.ChucVuRepository;
import com.laptrinhjavaweb.service.ChucVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChucVuServiceImpl implements ChucVuService {

    @Autowired
    private ChucVuRepository chucVuRepository;

    @Override
    public List<ChucVu> getDSChucVu() {
        return chucVuRepository.findAll();
    }

    @Override
    public ChucVu findById(Long id) {
        Optional<ChucVu> chucVu= chucVuRepository.findById(id);
        return chucVu.orElse(null);
    }

    @Override
    public String update(ChucVu chucVu) {
        if(chucVuRepository.findById(chucVu.getId()).orElse(null)==null){
            return "Không có mã chức vụ này";
        }
        return chucVuRepository.save(chucVu)!=null?"Sửa thành công":"Thêm thất bại";
    }

    @Override
    public ChucVu insert(ChucVu chucVu) {
        return chucVuRepository.save(chucVu);
    }
}
