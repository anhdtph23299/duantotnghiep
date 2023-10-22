package com.laptrinhjavaweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.laptrinhjavaweb.converter.BienTheConverter;
import com.laptrinhjavaweb.dto.BienTheDTO;
import com.laptrinhjavaweb.entity.BienTheEntity;
import com.laptrinhjavaweb.repository.BienTheRepository;
import com.laptrinhjavaweb.service.IBienTheService;

@Service
public class BienTheServiceImpl implements IBienTheService{
	
	@Autowired
	private BienTheRepository bienTheRepository;
	
	@Autowired
	private BienTheConverter bienTheConverter;

	@Override
	@Transactional
	public List<BienTheDTO> save(List<BienTheDTO> bienThesDTO) {
		for (BienTheDTO bienTheDTO : bienThesDTO) {
			BienTheEntity bienTheEntity = bienTheConverter.convertToEntity(bienTheDTO);
			bienTheRepository.save(bienTheEntity);
			bienTheDTO.setId(bienTheEntity.getId());
		}
		return bienThesDTO;
	}

}
