package com.laptrinhjavaweb.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.laptrinhjavaweb.dto.GiaTriThuocTinhDTO;
import com.laptrinhjavaweb.dto.ThuocTinhDTO;
import com.laptrinhjavaweb.entity.SanPham;
import com.laptrinhjavaweb.entity.ThuocTinh;
import com.laptrinhjavaweb.repository.SanPhamRepository;

@Component
public class ThuocTinhConverter {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private SanPhamRepository sanPhamRepository;

	@Autowired
	private GiaTriThuocTinhConverter giaTriThuocTinhConvert;

	public ThuocTinh convertToEntity(ThuocTinhDTO dto) {
		ThuocTinh entity = modelMapper.map(dto, ThuocTinh.class);
		SanPham sanPham = sanPhamRepository.findById(dto.getSanphamid()).get();
		entity.setSanphams(sanPham);
		return entity;
	}

	public GiaTriThuocTinhDTO convertToGiaTriThuocTinhDTO(ThuocTinhDTO dto) {
		GiaTriThuocTinhDTO giaTriThuocTinhDTO = modelMapper.map(dto, GiaTriThuocTinhDTO.class);
		return giaTriThuocTinhDTO;
	}

	public ThuocTinhDTO convertToDTO(ThuocTinh entity) {
		ThuocTinhDTO dto = modelMapper.map(entity, ThuocTinhDTO.class);
		dto.setSanphamid(entity.getSanphams().getId());
		List<GiaTriThuocTinhDTO> listGiaTriThuocTinhDTO = entity.getGiaTriThuocTinhEntities().stream()
				.map(itemGiaTri -> giaTriThuocTinhConvert.convertToDTO(itemGiaTri)).collect(Collectors.toList());
		dto.setGiatrithuoctinh(listGiaTriThuocTinhDTO);
		return dto;
	}
}
