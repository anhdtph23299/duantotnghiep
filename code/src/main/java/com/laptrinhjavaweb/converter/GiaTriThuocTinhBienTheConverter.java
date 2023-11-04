package com.laptrinhjavaweb.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.GiaTriThuocTinhBienTheDTO;
import com.laptrinhjavaweb.entity.BienThe;
import com.laptrinhjavaweb.entity.GiaTriThuocTinhBienThe;
import com.laptrinhjavaweb.entity.GiaTriThuocTinh;
import com.laptrinhjavaweb.repository.BienTheRepository;
import com.laptrinhjavaweb.repository.GiaTriThuocTinhRepository;

@Component
public class GiaTriThuocTinhBienTheConverter {
	
	@Autowired
    private ModelMapper modelMapper;
	
	@Autowired
	private GiaTriThuocTinhRepository giaTriThuocTinhRepository;
	
	@Autowired
	private BienTheRepository bienTheRepository;
	
	public GiaTriThuocTinhBienThe convertToEntity(GiaTriThuocTinhBienTheDTO dto) {
		GiaTriThuocTinhBienThe entity = modelMapper.map(dto, GiaTriThuocTinhBienThe.class);
		GiaTriThuocTinh giaTriThuocTinh = giaTriThuocTinhRepository.findById(dto.getGiatrithuoctinhid()).get();
		BienThe bienThe = bienTheRepository.findById(dto.getBientheid()).get();
		entity.setGiatrithuoctinhs(giaTriThuocTinh);
		entity.setBienthes(bienThe);
		return entity;
	}

	public GiaTriThuocTinhBienTheDTO convertToDTO(GiaTriThuocTinhBienThe entity){
		GiaTriThuocTinhBienTheDTO dto = modelMapper.map(entity, GiaTriThuocTinhBienTheDTO.class);
		dto.setBientheid(entity.getBienthes().getId());
		dto.setGiatrithuoctinhid(entity.getGiatrithuoctinhs().getId());
		return dto;
	}

}
