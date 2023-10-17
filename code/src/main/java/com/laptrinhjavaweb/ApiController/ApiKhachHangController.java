package com.laptrinhjavaweb.ApiController;

import com.laptrinhjavaweb.entity.KhachHang;
import com.laptrinhjavaweb.service.KhachHangService;
import com.laptrinhjavaweb.util.base.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin/khachhang")
public class ApiKhachHangController {

    @Autowired
    private KhachHangService khachHangService;

    @GetMapping
    public ResponseObject getKhachHang(){
        return new ResponseObject(khachHangService.getDsKhachHang());
    }

    @PostMapping("/insert")
    public ResponseObject insert(@RequestBody KhachHang khachHang){
        return new ResponseObject(khachHangService.insert(khachHang));
    }

    @GetMapping("/detail/{id}")
    public ResponseObject detail(@PathVariable(name = "id")Long id){
        return new ResponseObject(khachHangService.findById(id));
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable(name = "id")Long id){
        khachHangService.delete(id);
        return "Xóa thành công";
    }

    @PutMapping("/update/{id}")
    public ResponseObject update(@RequestBody KhachHang khachHang){
        return new ResponseObject(khachHangService.update(khachHang));
    }

    @PutMapping("/updateStatus/{id}")
    public ResponseEntity<String> updateStatus(@PathVariable Long id) {
        // Tìm khách hàng theo ID
        KhachHang khachHang = khachHangService.findById(id);

        if (khachHang.getTrangThai() == 1) {
            khachHang.setTrangThai(0);
        } else {
            khachHang.setTrangThai(1);
        }

        khachHangService.insert(khachHang);

        return new ResponseEntity<>("Update success", HttpStatus.OK);
    }
}
