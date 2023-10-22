package com.laptrinhjavaweb.ApiController;

import com.laptrinhjavaweb.entity.SanPhamGiamGia;
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

    @GetMapping
    public ResponseObject getAll() {
        return new ResponseObject(sanPhamGiamGiaService.getAll());
    }

    @PostMapping("/insert")
    public ResponseObject insert(@RequestBody List<SanPhamGiamGia> list) {
        List<SanPhamGiamGia> res = sanPhamGiamGiaService.create(list);
        return new ResponseObject(res);
    }

    @GetMapping("/detail/{id}")
    public ResponseObject detail(@PathVariable(name = "id") Long id) {
        List<SanPhamGiamGia> res = sanPhamGiamGiaService.findById(id);
        return new ResponseObject(res);
    }
}

