package com.laptrinhjavaweb.api;

import com.laptrinhjavaweb.dto.KhachHangDTO;
import com.laptrinhjavaweb.service.IKhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/assignment/customer")
public class KhachHangAPI {

    @Autowired
    private IKhachHangService khachHangService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody KhachHangDTO khachHangDTO){
        KhachHangDTO newKhachHangDTO = khachHangService.save(khachHangDTO);
        return new ResponseEntity<>(newKhachHangDTO, HttpStatus.CREATED);
    }
}
