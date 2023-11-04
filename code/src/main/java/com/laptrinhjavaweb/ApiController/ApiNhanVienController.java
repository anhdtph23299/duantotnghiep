package com.laptrinhjavaweb.ApiController;

import com.laptrinhjavaweb.entity.KhachHang;
import com.laptrinhjavaweb.entity.NhanVien;
import com.laptrinhjavaweb.service.NhanVienService;
import com.laptrinhjavaweb.util.base.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/api/admin/nhanvien")
public class ApiNhanVienController {

    @Autowired
    private NhanVienService nhanVienService;

    @GetMapping
    public ResponseObject getNhanVien(){
        return new ResponseObject(nhanVienService.getDsNhanVien());
    }

    @PostMapping("/insert")
    public ResponseObject insert(@RequestBody NhanVien nhanVien){
        System.out.println(nhanVien);
        return new ResponseObject(nhanVienService.insert(nhanVien));
    }

    @GetMapping("/detail/{id}")
    public ResponseObject detail(@PathVariable(name = "id")Long id){
        return new ResponseObject(nhanVienService.findById(id));
    }

    @PutMapping("/update/{id}")
    public ResponseObject update(@RequestBody NhanVien nhanVien){
        return new ResponseObject(nhanVienService.update(nhanVien));
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable(name = "id")Long id){
        nhanVienService.delete(id);
        return "Xóa thành công";
    }

    @PutMapping("/updateStatus/{id}")
    public ResponseEntity<String> updateStatus(@PathVariable Long id) {
        NhanVien nhanVien = nhanVienService.findById(id);

        if (nhanVien.getTrangThai() == 1) {
            nhanVien.setTrangThai(0);
        } else {
            nhanVien.setTrangThai(1);
        }

        nhanVienService.insert(nhanVien);

        return new ResponseEntity<>("Update success", HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseObject getSearchNhanVien( String maNV, String tenNV, String email, String sdt){
        return new ResponseObject(nhanVienService.getSearchNhanVien(maNV,tenNV, email, sdt));
    }

}
