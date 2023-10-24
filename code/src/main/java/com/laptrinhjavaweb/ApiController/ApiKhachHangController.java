package com.laptrinhjavaweb.ApiController;

import com.laptrinhjavaweb.entity.KhachHang;
import com.laptrinhjavaweb.repository.KhachHangRepository;
import com.laptrinhjavaweb.service.KhachHangService;
import com.laptrinhjavaweb.util.base.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

        KhachHang maKhachHang = khachHangService.insert(khachHang);
        Long id = maKhachHang.getId();
        String maKH = "KH" + id;
        maKhachHang.setMaKH(maKH);
        khachHangService.update(maKhachHang);

        return new ResponseObject(maKhachHang);
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

    @GetMapping("/search")
    public ResponseObject getSearchKhachHang( String maKH, String tenKH, String email, String sdt, String diaChi, String cccd){
        return new ResponseObject(khachHangService.getSearchKhachHang(maKH,tenKH, email, sdt, diaChi, cccd));
    }
}