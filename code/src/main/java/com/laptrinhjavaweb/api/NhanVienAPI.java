package com.laptrinhjavaweb.api;

import com.laptrinhjavaweb.dto.NhanVienDTO;
import com.laptrinhjavaweb.service.INhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/staff")
public class NhanVienAPI {

    @Autowired
    private INhanVienService nhanVienService;

    @PutMapping()
    public ResponseEntity<?> updateTrangThai(
            @RequestParam(name = "ma") String ma,
            @RequestParam(name = "trangthai") Integer trangthai){
        NhanVienDTO nhanVienDTO = nhanVienService.updateTrangThai(ma, trangthai);
        return new ResponseEntity<>(nhanVienDTO, HttpStatus.OK);
    }
}
