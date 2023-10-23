package com.laptrinhjavaweb.ApiController;


import com.laptrinhjavaweb.entity.CaLamViec;
import com.laptrinhjavaweb.service.CaLamViecService;
import com.laptrinhjavaweb.util.base.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin/calamviec")
public class ApiCaLamViecController {

    @Autowired
    private CaLamViecService caLamViecService;

    @GetMapping
    public ResponseObject getCaLamViec(){
        return new ResponseObject(caLamViecService.getDsCaLamViec());
    }

    @PostMapping("/insert")
    public ResponseObject insert(@RequestBody CaLamViec caLamViec){
        System.out.println(caLamViec);
        return new ResponseObject(caLamViecService.insert(caLamViec));
    }

    @GetMapping("/detail/{id}")
    public ResponseObject detail(@PathVariable(name = "id")Long id){
        return new ResponseObject(caLamViecService.findById(id));
    }

    @PutMapping("/update/{id}")
    public ResponseObject update(@RequestBody CaLamViec caLamViec){
        return new ResponseObject(caLamViecService.update(caLamViec));
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable(name = "id")Long id){
        caLamViecService.delete(id);
        return "Xóa thành công";
    }
}
