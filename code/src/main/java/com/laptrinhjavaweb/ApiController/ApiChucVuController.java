package com.laptrinhjavaweb.ApiController;

import com.laptrinhjavaweb.entity.ChucVu;
import com.laptrinhjavaweb.entity.NhanVien;
import com.laptrinhjavaweb.service.ChucVuService;
import com.laptrinhjavaweb.service.NhanVienService;
import com.laptrinhjavaweb.util.base.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin/chucvu")
public class ApiChucVuController {

    @Autowired
    private ChucVuService chucVuService;

    @GetMapping
    public ResponseObject getChucVu(){
        return new ResponseObject(chucVuService.getDSChucVu());
    }

    @PostMapping("/insert")
    public ResponseObject insert(@RequestBody ChucVu chucVu){
        System.out.println(chucVu);
        return new ResponseObject(chucVuService.insert(chucVu));
    }

    @GetMapping("/detail/{id}")
    public ResponseObject detail(@PathVariable(name = "id")Long id){
        return new ResponseObject(chucVuService.findById(id));
    }

    @PutMapping("/update/{id}")
    public ResponseObject update(@RequestBody ChucVu chucVu){
        return new ResponseObject(chucVuService.update(chucVu));
    }
}
