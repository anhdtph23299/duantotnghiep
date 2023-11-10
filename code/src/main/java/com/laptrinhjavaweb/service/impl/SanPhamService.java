package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.laptrinhjavaweb.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.laptrinhjavaweb.converter.SanPhamConverter;
import com.laptrinhjavaweb.converter.ThuocTinhConverter;
import com.laptrinhjavaweb.entity.SanPhamEntity;
import com.laptrinhjavaweb.repository.SanPhamRepository;
import com.laptrinhjavaweb.service.IBienTheService;
import com.laptrinhjavaweb.service.IGiaTriThuocTinhService;
import com.laptrinhjavaweb.service.ISanPhamHinhAnhService;
import com.laptrinhjavaweb.service.ISanPhamService;
import com.laptrinhjavaweb.service.IThuocTinhService;

@Service
public class SanPhamService implements ISanPhamService{
	
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
		SanPhamEntity sanPhamEntity = sanPhamRepository.findBySlug(sanPhamDTO.getSlug());
		if(sanPhamEntity != null){
			return null;
		}
		sanPhamEntity = sanPhamConvert.convertToEntity(sanPhamDTO);
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
		if(sanPhamEntity == null){
			return null;
		}
		SanPhamDTO sanPhamDTO = sanPhamConvert.convertToDTO(sanPhamEntity);
		return sanPhamDTO;
	}

	@Override
	public Map<String, Object> pagingOrsearchProducts(String param, Integer pageCurrent, Integer limit) {
		Map<String, Object> results = new HashMap<>();
		Boolean isAll = false;
		Page<SanPhamEntity> page = null;
		List<SanPhamDTO> listSanPhamDTO = new ArrayList<>();
		if(pageCurrent == null && limit == null) {
			isAll = true;
			Pageable wholePage = Pageable.unpaged();
			page = sanPhamRepository.findAll(wholePage);
		}else {
			Pageable pageable = PageRequest.of(pageCurrent - 1, limit);
			if(param != null) {
				List<SanPhamEntity> listSanPhamEntity = sanPhamRepository.seachProducts(param);
				int sizeOfListSanPhamEntityt = listSanPhamEntity.size();
				int start = (int) pageable.getOffset();
				int end = Math.min((start + pageable.getPageSize()), sizeOfListSanPhamEntityt);
				List<SanPhamEntity> pageContent = listSanPhamEntity.subList(start, end);
				page = new PageImpl<>(pageContent, pageable, sizeOfListSanPhamEntityt);

			}else {
				page = sanPhamRepository.findAll(pageable);
			}
		}
		listSanPhamDTO = page.getContent().stream().map(
				item -> sanPhamConvert.convertToDTO(item)
		).collect(Collectors.toList());
		if(listSanPhamDTO.isEmpty()) {
			return null;
		}
		results.put("data", listSanPhamDTO);
		if(!isAll) {
			PageAbleDTO pageAbleDTO = new PageAbleDTO();
			pageAbleDTO.setPagecurrent(pageCurrent);
			pageAbleDTO.setTotalpage(page.getTotalPages());
			pageAbleDTO.setPagefirst(1);
			results.put("meta", pageAbleDTO);
		}
		return results;
	}
}
