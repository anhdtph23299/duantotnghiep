package com.laptrinhjavaweb.service.serviceimpl;

import com.laptrinhjavaweb.converter.KhuyenMaiConverToDto;
import com.laptrinhjavaweb.dto.KhuyenMaiDto;
import com.laptrinhjavaweb.entity.KhuyenMai;
import com.laptrinhjavaweb.entity.NhanVien;
import com.laptrinhjavaweb.repository.KhuyenMaiRepository;
import com.laptrinhjavaweb.repository.NhanVienRepository;
import com.laptrinhjavaweb.service.KhuyenMaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KhuyenMaiServiceImpl implements KhuyenMaiService {

    @Autowired
    private KhuyenMaiRepository khuyenMaiRepository;

    @Autowired
    KhuyenMaiConverToDto convert;

    @Autowired
    private NhanVienRepository nhanVienRepository;

    @Override
    public List<KhuyenMaiDto> getAll() {
        List<KhuyenMai> listkm = this.khuyenMaiRepository.findAll();
        List<KhuyenMaiDto> list = new ArrayList<>();
        for (KhuyenMai km: listkm  ) {
            KhuyenMaiDto dto = convert.convertToDto(km);
            list.add(dto);
        }
        return list;
    }

    @Override
    public KhuyenMaiDto findById(Long id) {
        KhuyenMai km = this.khuyenMaiRepository.findById(id).orElse(null);
        KhuyenMaiDto dto = convert.convertToDto(km);
        return dto;
    }

    @Override
    public String insert(KhuyenMai khuyenMai) {
        System.out.println("khuyen mai req: "+khuyenMai.getNguoiTao());
        NhanVien nv = nhanVienRepository.findById(khuyenMai.getNguoiTao().getId()).orElse(null);
        System.out.println("Nhan vien res: "+nv);
        khuyenMai.setNguoiTao(nv);
        KhuyenMai km = this.khuyenMaiRepository.save(khuyenMai);
        if (km != null) {
            return "Insert thanh cong";
        } else {
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
        if (km != null) {
            this.khuyenMaiRepository.delete(km);
            return "Xoa thanh cong";
        } else {
            return "Khong tim thay";
        }
    }
}
