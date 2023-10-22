package com.laptrinhjavaweb.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.dto.SanPhamDTO;
import com.laptrinhjavaweb.service.ISanPhamService;

@RestController
@RequestMapping("/api/sanphams")
public class SanPhamAPI {
	
	@Autowired
	private ISanPhamService sanPhamService;
	
	@PostMapping
	public ResponseEntity<?> createdSanPham(@RequestBody SanPhamDTO sanPhamDTO){
		SanPhamDTO result = sanPhamService.save(sanPhamDTO);
		return new ResponseEntity<>(result, HttpStatus.CREATED);
	}

}
