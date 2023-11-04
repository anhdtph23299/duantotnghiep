package com.laptrinhjavaweb.ApiController.user;

import com.laptrinhjavaweb.service.HoaDonService;
import com.laptrinhjavaweb.util.base.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/user/dathang")
public class ApiUserDatHangController {
    @Autowired
    HoaDonService hoaDonService;
    @PostMapping("/{idkh}")
    public ResponseObject datHang(@PathVariable(name = "idkh") Long idkh
            ,@RequestBody Map<String, Object> requestBody){
        List<Integer> dsghct = (List<Integer>) requestBody.get("dsghct");
        return hoaDonService.taoHoaDonByIdGioHangChiTiet(idkh,dsghct);
    }


}
