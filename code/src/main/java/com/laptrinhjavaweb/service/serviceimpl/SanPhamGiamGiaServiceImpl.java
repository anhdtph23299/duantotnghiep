package com.laptrinhjavaweb.service.serviceimpl;

import com.laptrinhjavaweb.converter.SanPhamGiamGiaConvertToDto;
import com.laptrinhjavaweb.dto.SanPhamGiamGiaCustom;
import com.laptrinhjavaweb.dto.SanPhamGiamGiaDto;
import com.laptrinhjavaweb.entity.KhuyenMai;
import com.laptrinhjavaweb.entity.SanPhamEntity;
import com.laptrinhjavaweb.entity.SanPhamGiamGia;
import com.laptrinhjavaweb.repository.KhuyenMaiRepository;
import com.laptrinhjavaweb.repository.SanPhamGiamGiaRepository;
import com.laptrinhjavaweb.repository.SanPhamRepository;
import com.laptrinhjavaweb.service.SanPhamGiamGiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SanPhamGiamGiaServiceImpl implements SanPhamGiamGiaService {
    @Autowired
    private SanPhamGiamGiaRepository sanPhamGiamGiaRepository;

    @Autowired
    KhuyenMaiRepository khuyenMaiRepository;

    @Autowired
    SanPhamRepository sanPhamRepository;

    @Autowired
    SanPhamGiamGiaConvertToDto convert;

    @Override
    public List<SanPhamGiamGia> getAll() {
        List<SanPhamGiamGia> list = sanPhamGiamGiaRepository.findAll();
        return list;
    }

    @Override
    public List<SanPhamGiamGiaDto> create(SanPhamGiamGiaCustom custom) {
        List<SanPhamGiamGiaDto> result = new ArrayList<>();
        KhuyenMai km = custom.getKhuyenMai();
        List<SanPhamEntity> listsp = custom.getSanPhamEntity();
        System.out.println("Thong tin");
        System.out.println("Danh sahcs san pham: "+listsp);
        KhuyenMai entity = khuyenMaiRepository.save(km);
        for (SanPhamEntity sp: listsp) {
            SanPhamEntity sanPhamEntity = sanPhamRepository.findById(sp.getId()).orElse(null);
            SanPhamGiamGia sanPhamGiamGia = new SanPhamGiamGia();
            sanPhamGiamGia.setSanPhamThuocTinh(sanPhamEntity);
            sanPhamGiamGia.setKhuyenMai(entity);
            SanPhamGiamGia spn = this.sanPhamGiamGiaRepository.save(sanPhamGiamGia);
            SanPhamGiamGiaDto dton = convert.convertToDto(spn);
            result.add(dton);
        }
        return null;
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

    @Override
    public List<KhuyenMai> getAllKhuyenMai() {
        List<KhuyenMai> list = this.khuyenMaiRepository.findAllKhuyenMai();
        return list;
    }
}
