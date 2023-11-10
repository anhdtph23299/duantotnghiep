package com.laptrinhjavaweb.api;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.dto.SanPhamDTO;
import com.laptrinhjavaweb.exception.DataAlreadyExistException;
import com.laptrinhjavaweb.exception.EntityNotFoundException;
import com.laptrinhjavaweb.service.ISanPhamService;

@RestController
@RequestMapping("/api/sanphams")
public class SanPhamAPI {
	
	@Autowired
	private ISanPhamService sanPhamService;

	@PostMapping
	public ResponseEntity<?> createdSanPham(@RequestBody SanPhamDTO sanPhamDTO){
		SanPhamDTO newSanPhamDTO = sanPhamService.save(sanPhamDTO);
		if(newSanPhamDTO == null){
			throw new DataAlreadyExistException("Slug này đã tồn tại. Xin kiểm tra lại!");
		}
		return new ResponseEntity<>(newSanPhamDTO, HttpStatus.CREATED);
	}
	
	@GetMapping("/{slug}")
	public ResponseEntity<?> findBySlug(@PathVariable("slug") String slug){
		SanPhamDTO results = sanPhamService.findBySlug(slug);
		if(results == null){
			throw new EntityNotFoundException("Không tồn tại slug này!");
		}
		return new ResponseEntity<>(results, HttpStatus.OK);
	}

	@GetMapping("/pagination")
	public ResponseEntity<?> pagination(@RequestParam(name = "page", defaultValue = "1") Integer page,
										@RequestParam(name = "limit", required = false, defaultValue = "2") Integer limit
										){
		Map<String, Object> results = sanPhamService.pagingOrsearchProducts(null, page, limit);
		return new ResponseEntity<>(results, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<?> findAll(){
		Map<String, Object> results = sanPhamService.pagingOrsearchProducts(null, null, null);
		return new ResponseEntity<>(results, HttpStatus.OK);
	}
	
	@GetMapping("/search")
    public ResponseEntity<?> search(
           @RequestParam(name = "q") String param,
           @RequestParam(name = "page", defaultValue = "1") Integer page,
           @RequestParam(name = "limit", required = false, defaultValue = "2") Integer limit){
		Map<String, Object> results = sanPhamService.pagingOrsearchProducts(param, page, limit);
		if(results == null) {
			return new ResponseEntity<>("Không tìm thấy kết quả phù hợp!", HttpStatus.OK);
		}
		return new ResponseEntity<>(results, HttpStatus.OK);
    }

}
