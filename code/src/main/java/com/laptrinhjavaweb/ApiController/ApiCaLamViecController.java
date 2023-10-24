package com.laptrinhjavaweb.ApiController;


import com.laptrinhjavaweb.entity.CaLamViec;
import com.laptrinhjavaweb.entity.KhachHang;
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
        CaLamViec maCa = caLamViecService.insert(caLamViec);
        Long id = maCa.getId();
        String maCaLV = "CA" + id;
        maCa.setMaCaLV(maCaLV);
        caLamViecService.update(maCa);

        return new ResponseObject(maCa);
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
