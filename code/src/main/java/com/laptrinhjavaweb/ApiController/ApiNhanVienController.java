package com.laptrinhjavaweb.ApiController;

import com.laptrinhjavaweb.entity.KhachHang;
import com.laptrinhjavaweb.entity.NhanVien;
import com.laptrinhjavaweb.service.NhanVienService;
import com.laptrinhjavaweb.util.base.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable(name = "id")Long id){
        nhanVienService.delete(id);
        return "Xóa thành công";
    }
}
