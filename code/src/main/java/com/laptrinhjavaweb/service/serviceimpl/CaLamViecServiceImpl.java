package com.laptrinhjavaweb.service.serviceimpl;

import com.laptrinhjavaweb.entity.CaLamViec;
import com.laptrinhjavaweb.repository.CaLamViecRepository;
import com.laptrinhjavaweb.service.CaLamViecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CaLamViecServiceImpl implements CaLamViecService {

    @Autowired
    private CaLamViecRepository caLamViecRepository;

    @Override
    public List<CaLamViec> getDsCaLamViec() {
        return caLamViecRepository.findAll();
    }

    @Override
    public CaLamViec findById(Long id) {
        Optional<CaLamViec> caLamViec = caLamViecRepository.findById(id);
        return caLamViec.orElse(null);
    }

    @Override
    public String update(CaLamViec caLamViec) {
        if(caLamViecRepository.findById(caLamViec.getId()).orElse(null)==null){
            return "Không có ca làm việc này";
        }
        return caLamViecRepository.save(caLamViec)!=null?"Sửa thành công":"Thêm thất bại";
    }

    @Override
    public CaLamViec insert(CaLamViec caLamViec) {
        return caLamViecRepository.save(caLamViec);
    }

    @Override
    public void delete(Long id) {
        caLamViecRepository.deleteById(id);
    }

}
