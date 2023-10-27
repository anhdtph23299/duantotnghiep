package com.laptrinhjavaweb.converter;

import java.util.List;
import java.util.stream.Collectors;

import com.laptrinhjavaweb.dto.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.entity.DanhMucEntity;
import com.laptrinhjavaweb.entity.SanPhamEntity;
import com.laptrinhjavaweb.entity.ThuongHieuEntity;
import com.laptrinhjavaweb.repository.DanhMucRepository;
import com.laptrinhjavaweb.repository.ThuongHieuRepository;

@Component
public class SanPhamConverter {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private DanhMucRepository danhMucRepository;

    @Autowired
    private ThuongHieuRepository thuongHieuRepository;

    @Autowired
    private ThuocTinhConverter thuocTinhConverter;

    @Autowired
    private GiaTriThuocTinhConverter giaTriThuocTinhConvert;

    @Autowired
    private BienTheConverter bienTheConvert;

    @Autowired
    private GiaTriThuocTinhBienTheConverter giaTriThuocTinhBienTheConverter;

    @Autowired
    private SanPhamHinhAnhConverter sanPhamHinhAnhConverter;

    public SanPhamEntity convertToEntity(SanPhamDTO dto) {
        SanPhamEntity entity = modelMapper.map(dto, SanPhamEntity.class);
        DanhMucEntity danhMucEntity = danhMucRepository.findBySlug(dto.getDanhmucslug());
        ThuongHieuEntity thuongHieuEntity = thuongHieuRepository.findBySlug(dto.getThuonghieuslug());
        entity.setDanhmucs(danhMucEntity);
        entity.setThuonghieus(thuongHieuEntity);
        return entity;
    }

    public SanPhamDTO convertToDTO(SanPhamEntity entity) {
        modelMapper.getConfiguration().setAmbiguityIgnored(true);
        SanPhamDTO dto = modelMapper.map(entity, SanPhamDTO.class);
        dto.setDanhmucslug(entity.getDanhmucs().getSlug());
        dto.setThuonghieuslug(entity.getThuonghieus().getSlug());
        List<ThuocTinhDTO> listThuocTinhDTO = entity.getThuocTinhEntities().stream().map(item -> {
            ThuocTinhDTO thuocTinhDTO = thuocTinhConverter.convertToDTO(item);
            List<GiaTriThuocTinhDTO> listGiaTriThuocTinhDTO = item.getGiaTriThuocTinhEntities().stream().map(
                    itemGiaTri -> giaTriThuocTinhConvert.convertToDTO(itemGiaTri)).collect(Collectors.toList());
            thuocTinhDTO.setGiatrithuoctinh(listGiaTriThuocTinhDTO);
            return thuocTinhDTO;
        }).collect(Collectors.toList());
        List<BienTheDTO> listBienTheDTO = entity.getBienTheEntities().stream().map(item -> {
            BienTheDTO bienTheDTO = bienTheConvert.convertToDTO(item);
            List<GiaTriThuocTinhBienTheDTO> listGiaTriBienTheThuocTinhsDTO = item.getGiaTriThuocTinhBienTheEntities().stream().map(
                    itemGiaTriBienThe -> giaTriThuocTinhBienTheConverter.convertToDTO(itemGiaTriBienThe)
            ).collect(Collectors.toList());
            bienTheDTO.setListGiaTriThuocTinhBienThesDTO(listGiaTriBienTheThuocTinhsDTO);
            return bienTheDTO;
        }).collect(Collectors.toList());
        List<SanPhamHinhAnhDTO> listSanPhamHinhAnhDTO = entity.getSanPhamHinhAnhEntities().stream().map(item ->
                sanPhamHinhAnhConverter.convertToDTO(item)).collect(Collectors.toList());

        dto.setThuoctinh(listThuocTinhDTO);
        dto.setBienthe(listBienTheDTO);
        dto.setSanphamhinhanh(listSanPhamHinhAnhDTO);
        return dto;
    }

}
