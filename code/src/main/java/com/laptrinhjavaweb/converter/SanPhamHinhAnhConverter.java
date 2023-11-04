package com.laptrinhjavaweb.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.SanPhamHinhAnhDTO;
import com.laptrinhjavaweb.entity.SanPham;
import com.laptrinhjavaweb.entity.SanPhamHinhAnh;
import com.laptrinhjavaweb.repository.SanPhamRepository;

@Component
public class SanPhamHinhAnhConverter {

	@Autowired
    private ModelMapper modelMapper;
	
	@Autowired
	private SanPhamRepository sanPhamRepository;
	
	public SanPhamHinhAnh convertToEntity(SanPhamHinhAnhDTO dto) {
		SanPhamHinhAnh entity = modelMapper.map(dto, SanPhamHinhAnh.class);
		SanPham sanPham = sanPhamRepository.findById(dto.getSanphamid()).get();
		entity.setSanphams(sanPham);
		return entity;
	}
	
	public SanPhamHinhAnhDTO convertToDTO(SanPhamHinhAnh entity) {
		SanPhamHinhAnhDTO dto = modelMapper.map(entity, SanPhamHinhAnhDTO.class);
		dto.setSanphamid(entity.getSanphams().getId());
		return dto;
	}
}
