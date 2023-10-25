package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.laptrinhjavaweb.converter.SanPhamConverter;
import com.laptrinhjavaweb.converter.ThuocTinhConverter;
import com.laptrinhjavaweb.dto.BienTheDTO;
import com.laptrinhjavaweb.dto.GiaTriThuocTinhDTO;
import com.laptrinhjavaweb.dto.SanPhamDTO;
import com.laptrinhjavaweb.dto.SanPhamHinhAnhDTO;
import com.laptrinhjavaweb.dto.ThuocTinhDTO;
import com.laptrinhjavaweb.entity.SanPhamEntity;
import com.laptrinhjavaweb.repository.SanPhamRepository;
import com.laptrinhjavaweb.service.IBienTheService;
import com.laptrinhjavaweb.service.IGiaTriThuocTinhService;
import com.laptrinhjavaweb.service.ISanPhamHinhAnhService;
import com.laptrinhjavaweb.service.ISanPhamService;
import com.laptrinhjavaweb.service.IThuocTinhService;

@Service
public class SanPhamServiceImpl implements ISanPhamService{
	
	@Autowired
	private SanPhamConverter sanPhamConvert;

	@Autowired
	private ThuocTinhConverter thuocTinhConverter;

	@Autowired
	private SanPhamRepository sanPhamRepository;

	@Autowired
	private ISanPhamHinhAnhService sanPhamHinhAnhService;

	@Autowired
	private IThuocTinhService thuocTinhService;

	@Autowired
	private IBienTheService bienTheService;

	@Autowired
	private IGiaTriThuocTinhService giaTriThuocTinhService;


	@SuppressWarnings("unused")
	@Override
	@Transactional
	public SanPhamDTO save(SanPhamDTO sanPhamDTO) {
		SanPhamEntity sanPhamEntity = sanPhamConvert.convertToEntity(sanPhamDTO);
		sanPhamRepository.save(sanPhamEntity);
		sanPhamDTO.setId(sanPhamEntity.getId());
		List<GiaTriThuocTinhDTO> newListGiaTriThuocTinhDTO = new ArrayList<>();
		List<SanPhamHinhAnhDTO> listSanPhamHinhAnh = sanPhamDTO.getSanphamhinhanh().stream().map(
				item -> {
					item.setSanphamid(sanPhamDTO.getId());
					return item;
				}).collect(Collectors.toList());
		List<ThuocTinhDTO> listThuocTinhDTO = sanPhamDTO.getThuoctinh().stream().map(
				item -> {
					item.setSanphamid(sanPhamDTO.getId());
					GiaTriThuocTinhDTO giaTriThuocTinhDTO = thuocTinhConverter.convertToGiaTriThuocTinhDTO(item);
					item = thuocTinhService.save(item);
					giaTriThuocTinhDTO.setThuoctinhid(item.getId());
					giaTriThuocTinhService.save(giaTriThuocTinhDTO);
					return item;
				}).collect(Collectors.toList());
		List<BienTheDTO> listBienTheDTO = sanPhamDTO.getBienthe().stream().map(
				item -> {
					item.setSanphamid(sanPhamDTO.getId());
					return item;
				}).collect(Collectors.toList());

		List<SanPhamHinhAnhDTO> newListSanPhamHinhAnh = sanPhamHinhAnhService.save(listSanPhamHinhAnh);
		List<BienTheDTO> newListBienTheDTO = bienTheService.save(listBienTheDTO);
		
		sanPhamDTO.setSanphamhinhanh(newListSanPhamHinhAnh);
		sanPhamDTO.setThuoctinh(listThuocTinhDTO);
		sanPhamDTO.setBienthe(newListBienTheDTO);
		return sanPhamDTO;
	}


	@Override
	public SanPhamDTO findBySlug(String slug) {
		SanPhamEntity sanPhamEntity = sanPhamRepository.findBySlug(slug);
		SanPhamDTO sanPhamDTO = sanPhamConvert.convertToDTO(sanPhamEntity);
		return sanPhamDTO;
	}

}
