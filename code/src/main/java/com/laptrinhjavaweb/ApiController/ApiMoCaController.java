package com.laptrinhjavaweb.ApiController;

import com.laptrinhjavaweb.entity.MoCa;
import com.laptrinhjavaweb.entity.NhanVien;
import com.laptrinhjavaweb.service.MoCaService;
import com.laptrinhjavaweb.util.base.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/admin/moca")
public class ApiMoCaController {

    @Autowired
    private MoCaService moCaService;

    @GetMapping
    public ResponseObject getMoCa(){
        return new ResponseObject(moCaService.getMoCa());
    }

    @PostMapping("/insert")
    public ResponseObject insert(@RequestBody MoCa moca){
        return new ResponseObject(moCaService.insert(moca));
    }

//    @GetMapping("/getDateTimeFromDB")
//    public String getDateTimeFromDB() {
//        String thoiGian = moCaService.getThoiGianFromDB();
//        return thoiGian;
//    }

    @GetMapping("/getDateTime")
    @ResponseBody
    public String getDateTime() {
        String dateTime = moCaService.getCurrentDateTime();
        return dateTime;
    }
}
