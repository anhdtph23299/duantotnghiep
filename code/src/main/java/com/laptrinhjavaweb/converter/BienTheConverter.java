package com.laptrinhjavaweb.converter;

import com.laptrinhjavaweb.entity.SanPhamHinhAnh;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.BienTheDTO;
import com.laptrinhjavaweb.dto.GiaTriThuocTinhBienTheDTO;
import com.laptrinhjavaweb.entity.BienThe;
import com.laptrinhjavaweb.entity.SanPham;
import com.laptrinhjavaweb.repository.SanPhamRepository;

@Component
public class BienTheConverter {

	@Autowired
    private ModelMapper modelMapper;
	
	@Autowired
	private SanPhamRepository sanPhamRepository;

    @Autowired
    private GiaTriThuocTinhBienTheConverter giaTriThuocTinhBienTheConverter;

	public BienThe convertToEntity(BienTheDTO dto) {
		BienThe entity = modelMapper.map(dto, BienThe.class);
		SanPham sanPham = sanPhamRepository.findById(dto.getSanphamid()).get();
		entity.setSanphams(sanPham);
		return entity;
	}
	
	public BienTheDTO convertToDTO(BienThe entity) {
		BienTheDTO dto = modelMapper.map(entity, BienTheDTO.class);
		dto.setSanphamid(entity.getSanphams().getId());
		List<GiaTriThuocTinhBienTheDTO> listGiaTriBienTheThuocTinhsDTO = entity.getGiaTriThuocTinhBienTheEntities().stream().map(
                itemGiaTriBienThe -> giaTriThuocTinhBienTheConverter.convertToDTO(itemGiaTriBienThe)
        ).collect(Collectors.toList());
        dto.setListGiaTriThuocTinhBienThesDTO(listGiaTriBienTheThuocTinhsDTO);
		return dto;
	}

	public SanPhamHinhAnh convertToSanPhamHinhAnhEntity(BienTheDTO dto){
		SanPhamHinhAnh entity = modelMapper.map(dto, SanPhamHinhAnh.class);
		SanPham sanPham = sanPhamRepository.findById(dto.getSanphamid()).get();
		entity.setSanphams(sanPham);
		return entity;
	}
}
