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
    public ResponseObject getAll() {
        return new ResponseObject(khuyenMaiService.getAll());
    }

    @GetMapping("/detail/{id}")
<<<<<<< HEAD
    public ResponseObject detail(@PathVariable(name = "id")Long id){
=======
    public ResponseObject detail(@PathVariable(name = "id") Long id) {
>>>>>>> 05656fde4f7200afb113438fb319a54853650308
        KhuyenMai km = khuyenMaiService.findById(id);
        return new ResponseObject(km);
    }

    @PostMapping("/insert")
<<<<<<< HEAD
    public ResponseObject insert(@RequestBody KhuyenMai khuyenMai){

=======
    public ResponseObject insert(@RequestBody KhuyenMai khuyenMai) {
>>>>>>> 05656fde4f7200afb113438fb319a54853650308
        String res = khuyenMaiService.insert(khuyenMai);
        return new ResponseObject(res);
    }

    @PostMapping("/delete/{id}")
<<<<<<< HEAD
    public ResponseObject delete(@PathVariable(name = "id")Long id){
        String res = khuyenMaiService.delete(id);
        return new ResponseObject(res);
    }
=======
    public ResponseObject delete(@PathVariable(name = "id") Long id) {
        String res = khuyenMaiService.delete(id);
        return new ResponseObject(res);
    }


>>>>>>> 05656fde4f7200afb113438fb319a54853650308
}
