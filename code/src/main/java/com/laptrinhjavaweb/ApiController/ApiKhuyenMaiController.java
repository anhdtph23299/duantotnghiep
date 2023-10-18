package com.laptrinhjavaweb.ApiController;

import com.laptrinhjavaweb.entity.KhuyenMai;
import com.laptrinhjavaweb.service.KhuyenMaiService;
import com.laptrinhjavaweb.util.base.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin/khuyen-mai")
public class ApiKhuyenMaiController {
    @Autowired
    KhuyenMaiService khuyenMaiService;

    @GetMapping
    public ResponseObject getAll(){
        return new ResponseObject(khuyenMaiService.getAll());
    }

    @GetMapping("/detail/{id}")
    public ResponseObject detail(@PathVariable(name = "id")Long id){
        KhuyenMai km = khuyenMaiService.findById(id);
        return new ResponseObject(km);
    }

    @PostMapping("/insert")
    public ResponseObject insert(@RequestBody KhuyenMai khuyenMai){
        String res = khuyenMaiService.insert(khuyenMai);
        return new ResponseObject(res);
    }

    @PostMapping("/delete/{id}")
    public ResponseObject delete(@PathVariable(name = "id")Long id){
        String res = khuyenMaiService.delete(id);
        return new ResponseObject(res);
    }


}
