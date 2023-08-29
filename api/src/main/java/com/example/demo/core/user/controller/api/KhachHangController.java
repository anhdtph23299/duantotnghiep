package com.example.demo.core.user.controller.api;

import com.example.demo.core.common.base.ResponseObject;
import com.example.demo.core.user.model.request.UserKhachHangRequest;
import com.example.demo.core.user.service.UserKhachHangService;
import com.example.demo.entity.KhachHang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/khachhang")
public class KhachHangController {

    @Autowired
    private UserKhachHangService khachHangService;

        @GetMapping("/getall")
    public ResponseObject dsKhachHang(@RequestParam(name = "page",defaultValue = "1",required = false)Integer page){
        return new ResponseObject(khachHangService.dsKhachHang(--page));
    }
    @PostMapping("/insert")
    public ResponseObject themKhachHang(@RequestBody UserKhachHangRequest khachHangRequest){
        return new ResponseObject(khachHangService.insert(khachHangRequest));
    }
    @PutMapping("/update/{id}")
    public ResponseObject suaKhachHang(@RequestBody UserKhachHangRequest khachHangRequest, @PathVariable(name = "id")Long id){
            khachHangRequest.setIdKhachHang(id);
        return new ResponseObject(khachHangService.update(khachHangRequest));
    }
    @DeleteMapping("/delete/[id}")
    public ResponseObject xoaKhachHang(  @PathVariable(name = "id")Long id){
        return new ResponseObject(khachHangService.delete(id));
    }
}
