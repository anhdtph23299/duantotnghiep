package com.laptrinhjavaweb.ApiController;

import com.laptrinhjavaweb.service.ThongTinMuaHangService;
import com.laptrinhjavaweb.util.base.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user/ttgh")
public class ApiThongTinMuaHangController {
    @Autowired
    ThongTinMuaHangService thongTinMuaHangService;
    @GetMapping("/{idkh}")
    public ResponseObject getDefaultThongTinGiaoHang(@PathVariable(name = "idkh")Long idkh){
        return new ResponseObject(thongTinMuaHangService.findThongTinMuaHangDefault(idkh));
    }
}
