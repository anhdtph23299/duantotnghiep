package com.laptrinhjavaweb.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.BienTheDTO;
import com.laptrinhjavaweb.entity.BienTheEntity;
import com.laptrinhjavaweb.entity.SanPhamEntity;
import com.laptrinhjavaweb.repository.SanPhamRepository;

@Component
public class BienTheConverter {

	@Autowired
    private ModelMapper modelMapper;
	
	@Autowired
	private SanPhamRepository sanPhamRepository;
	
	public BienTheEntity convertToEntity(BienTheDTO dto) {
		BienTheEntity entity = modelMapper.map(dto, BienTheEntity.class);
		SanPhamEntity sanPhamEntity = sanPhamRepository.findById(dto.getSanphamid()).get();
		entity.setSanphams(sanPhamEntity);
		return entity;
	}
}
