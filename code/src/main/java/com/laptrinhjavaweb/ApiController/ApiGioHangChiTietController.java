package com.laptrinhjavaweb.ApiController;

import com.laptrinhjavaweb.model.request.ThayDoiSoLuongGioHangRequest;
import com.laptrinhjavaweb.service.GioHangChiTietService;
import com.laptrinhjavaweb.util.base.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController()
@RequestMapping("/api/user/ghct")
public class ApiGioHangChiTietController {

    @Autowired
    GioHangChiTietService gioHangChiTietService;

    @GetMapping("/{id}")
    public ResponseObject dsGioHangChiTietByKhachHang(@PathVariable(name = "id")Long idkh){
        return new ResponseObject(gioHangChiTietService.dsGioHangChiTietByIdKh(idkh));
    }

    @PostMapping("/subtotaltheoghct/{idkh}")
    public ResponseObject totalGioHangByKhachHangAndGioHangChiTiet(
            @PathVariable(name = "idkh")Long idkh,
            @RequestBody Map<String, List<Long>> requestBody
            ){
        return  new ResponseObject(gioHangChiTietService.tongTienTheoGioHangChiTiet(idkh, requestBody.get("collection")));
    }

    @GetMapping("/subtotal/{id}")
    public ResponseObject totalGioHangByKhachHang(@PathVariable(name = "id")Long idkh){
        return new ResponseObject(gioHangChiTietService.tongTien(idkh));
    }

    @PostMapping("/thaydoisoluong")
    public ResponseObject totalGioHangByKhachHang(@RequestBody ThayDoiSoLuongGioHangRequest request){
        return new ResponseObject(gioHangChiTietService.thayDoiSoLuong(request));
    }
    @GetMapping("/dsspttchiatheosp/{id}")
    public ResponseObject dsSpttChiaTheoSanPhamByIdKh(@PathVariable(name = "id")Long idkh){
        return  new ResponseObject(gioHangChiTietService.dsGioHangChiaTheoSanPham(idkh));
    }


}
