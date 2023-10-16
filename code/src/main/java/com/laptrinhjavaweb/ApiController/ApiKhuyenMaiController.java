package com.laptrinhjavaweb.ApiController;

import com.laptrinhjavaweb.service.KhuyenMaiService;
import com.laptrinhjavaweb.util.base.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin/khuyen-mai")
public class ApiKhuyenMaiController {
    @Autowired
    KhuyenMaiService khuyenMaiService;

    @GetMapping
    public ResponseObject getAll(){
        return new ResponseObject(khuyenMaiService.getAll());
    }
}
