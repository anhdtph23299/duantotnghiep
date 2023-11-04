package com.laptrinhjavaweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.laptrinhjavaweb.converter.ThuocTinhConverter;
import com.laptrinhjavaweb.dto.ThuocTinhDTO;
import com.laptrinhjavaweb.entity.ThuocTinh;
import com.laptrinhjavaweb.repository.ThuocTinhRepository;
import com.laptrinhjavaweb.service.IThuocTinhService;

@Service
public class ThuocTinhServiceImpl implements IThuocTinhService {

	@Autowired
	private ThuocTinhRepository thuocTinhRepository;

	@Autowired
	private ThuocTinhConverter thuocTinhConvert;

	@Override
	@Transactional
	public ThuocTinhDTO save(ThuocTinhDTO thuocTinhDTO) {
		ThuocTinh thuocTinh = thuocTinhConvert.convertToEntity(thuocTinhDTO);
		thuocTinhRepository.save(thuocTinh);
		thuocTinhDTO.setId(thuocTinh.getId());
		return thuocTinhDTO;
	}

}
