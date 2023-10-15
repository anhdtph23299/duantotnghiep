package com.laptrinhjavaweb.ApiController;

import com.laptrinhjavaweb.entity.KhachHang;
import com.laptrinhjavaweb.service.KhachHangService;
import com.laptrinhjavaweb.util.base.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
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
        System.out.println(khachHang);
        return new ResponseObject(khachHangService.insert(khachHang));
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable(name = "id")Long id){
        khachHangService.delete(id);
        return "Xóa thành công";
    }

}
