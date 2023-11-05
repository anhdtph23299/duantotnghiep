package com.laptrinhjavaweb.ApiController;

import com.laptrinhjavaweb.dto.SanPhamGiamGiaCustom;
import com.laptrinhjavaweb.dto.SanPhamGiamGiaDto;
import com.laptrinhjavaweb.entity.SanPhamGiamGia;
import com.laptrinhjavaweb.repository.SanPhamRepository;
import com.laptrinhjavaweb.service.SanPhamGiamGiaService;
import com.laptrinhjavaweb.util.base.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/khuyen-mai-san-pham")
public class ApiSanPhamGiamGiaController {
    @Autowired
    private SanPhamGiamGiaService sanPhamGiamGiaService;

    @Autowired
    private SanPhamRepository sanPhamRepository;

    @GetMapping
    public ResponseObject getAll() {
        return new ResponseObject(sanPhamGiamGiaService.getAllKhuyenMai());
    }

    @PostMapping("/insert")
    public ResponseObject insert(@RequestBody SanPhamGiamGiaCustom list) {
        System.out.println();
        List<SanPhamGiamGiaDto> res = sanPhamGiamGiaService.create(list);
        return new ResponseObject(res);
    }



    @GetMapping("/detail/{id}")
    public ResponseObject detail(@PathVariable(name = "id") Long id) {
        List<SanPhamGiamGia> res = sanPhamGiamGiaService.findById(id);
        return new ResponseObject(res);
    }

    @GetMapping("/san-pham")
    public ResponseObject sanpham(){
        return new ResponseObject(sanPhamRepository.findAll());
    }
}

