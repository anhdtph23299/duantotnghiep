package com.laptrinhjavaweb.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.GiaTriThuocTinhDTO;
import com.laptrinhjavaweb.entity.GiaTriThuocTinh;
import com.laptrinhjavaweb.entity.SanPham;
import com.laptrinhjavaweb.entity.ThuocTinh;
import com.laptrinhjavaweb.repository.SanPhamRepository;
import com.laptrinhjavaweb.repository.ThuocTinhRepository;

@Component
public class GiaTriThuocTinhConverter {

	@Autowired
    private ModelMapper modelMapper;
	
	@Autowired
	private SanPhamRepository sanPhamRepository;
	
	@Autowired
	private ThuocTinhRepository thuocTinhRepository;
	
	public GiaTriThuocTinh convertToEntity(GiaTriThuocTinhDTO dto) {
		GiaTriThuocTinh entity = modelMapper.map(dto, GiaTriThuocTinh.class);
		SanPham sanPham = sanPhamRepository.findById(dto.getSanphamid()).get();
		ThuocTinh thuocTinh = thuocTinhRepository.findById(dto.getThuoctinhid()).get();
		entity.setSanphams(sanPham);
		entity.setThuoctinhs(thuocTinh);
		return entity;
	}
	
	public GiaTriThuocTinhDTO convertToDTO(GiaTriThuocTinh entity) {
		GiaTriThuocTinhDTO dto = modelMapper.map(entity, GiaTriThuocTinhDTO.class);
		dto.setThuoctinhid(entity.getThuoctinhs().getId());
		dto.setSanphamid(entity.getSanphams().getId());
		return dto;
	}
}
