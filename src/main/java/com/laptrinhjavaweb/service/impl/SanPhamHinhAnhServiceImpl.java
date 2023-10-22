package com.laptrinhjavaweb.service.impl;

import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.laptrinhjavaweb.converter.SanPhamHinhAnhConverter;
import com.laptrinhjavaweb.dto.SanPhamHinhAnhDTO;
import com.laptrinhjavaweb.entity.SanPhamHinhAnhEntity;
import com.laptrinhjavaweb.repository.SanPhamHinhAnhRepository;
import com.laptrinhjavaweb.service.ISanPhamHinhAnhService;
import com.laptrinhjavaweb.utils.UploadFileUtils;

@Service
public class SanPhamHinhAnhServiceImpl implements ISanPhamHinhAnhService {

	@Autowired
	private UploadFileUtils uploadFileUtils;

	@Autowired
	private SanPhamHinhAnhRepository sanPhamHinhAnhRepository;

	@Autowired
	private SanPhamHinhAnhConverter sanPhamHinhAnhConverter;

	@Override
	@Transactional
	public List<SanPhamHinhAnhDTO> save(List<SanPhamHinhAnhDTO> sanPhamHinhAnhsDTO) {
		for (SanPhamHinhAnhDTO sanPhamHinhAnhDTO : sanPhamHinhAnhsDTO) {
			saveImage(sanPhamHinhAnhDTO);
			SanPhamHinhAnhEntity sanPhamHinhAnhEntity = sanPhamHinhAnhConverter.convertToEntity(sanPhamHinhAnhDTO);
			sanPhamHinhAnhRepository.save(sanPhamHinhAnhEntity);
			sanPhamHinhAnhDTO.setId(sanPhamHinhAnhEntity.getId());
		}
		return sanPhamHinhAnhsDTO;
	}

	public void saveImage(SanPhamHinhAnhDTO sanPhamHinhAnhDTO) {
		// path: path folder of images
		String path = "/path" + sanPhamHinhAnhDTO.getHinhanh();
		if (sanPhamHinhAnhDTO.getHinhanhbase64() != null) {
			byte[] bytes = Base64.decodeBase64(sanPhamHinhAnhDTO.getHinhanhbase64().getBytes());
			uploadFileUtils.writeOrUpdate(path, bytes);
		}
	}
}
