package com.example.demo.core.admin.controller.api;

import com.example.demo.core.admin.model.response.UserKhachHangResponse;
import com.example.demo.core.common.base.ResponseObject;
import com.example.demo.core.admin.model.request.UserKhachHangRequest;
import com.example.demo.core.admin.service.UserKhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/admin/khachhang")
public class KhachHangController {

    @Autowired
    private UserKhachHangService khachHangService;

    @GetMapping("/getall")
    public ResponseObject dsKhachHang(){
        List<UserKhachHangResponse> list = khachHangService.findAll();
        return new ResponseObject(list);
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
    @DeleteMapping("/delete/{id}")
    public ResponseObject xoaKhachHang( @PathVariable(name = "id")Long id){
        return new ResponseObject(khachHangService.delete(id));
    }
}
