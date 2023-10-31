package com.laptrinhjavaweb.ApiController;

import com.laptrinhjavaweb.entity.KhachHang;
import com.laptrinhjavaweb.service.KhachHangService;
import com.laptrinhjavaweb.util.base.ResponseObject;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/admin/khachhang")
public class ApiKhachHangController {

    @Autowired
    private KhachHangService khachHangService;

    @GetMapping
    public ResponseObject getKhachHang(){
        return new ResponseObject(khachHangService.getDsKhachHang());
    }

    @PostMapping("/insert")
    public ResponseObject insert(@Valid @RequestBody KhachHang khachHang) {
        KhachHang maKhachHang = khachHangService.insert(khachHang);

        Long id = maKhachHang.getId();
        String maKH = "KH" + id;
        maKhachHang.setMaKH(maKH);
        khachHangService.update(maKhachHang);

        return new ResponseObject(maKhachHang);
    }

    @GetMapping("/detail/{id}")
    public ResponseObject detail(@PathVariable(name = "id")Long id){
        return new ResponseObject(khachHangService.findById(id));
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable(name = "id")Long id){
        khachHangService.delete(id);
        return "Xóa thành công";
    }

    @PutMapping("/update/{id}")
    public ResponseObject update(@RequestBody KhachHang khachHang){
        return new ResponseObject(khachHangService.update(khachHang));
    }

    @PutMapping("/updateStatus/{id}")
    public ResponseEntity<String> updateStatus(@PathVariable Long id) {
        // Tìm khách hàng theo ID
        KhachHang khachHang = khachHangService.findById(id);

        if (khachHang.getTrangThai() == 1) {
            khachHang.setTrangThai(0);
        } else {
            khachHang.setTrangThai(1);
        }

        khachHangService.insert(khachHang);

        return new ResponseEntity<>("Update success", HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseObject getSearchKhachHang( String maKH, String tenKH, String email, String sdt, String diaChi, String cccd){
        return new ResponseObject(khachHangService.getSearchKhachHang(maKH,tenKH, email, sdt, diaChi, cccd));
    }


    @GetMapping("/exportCustomersToExcel")
    public void exportCustomersToExcel(HttpServletResponse response,
                                       @RequestParam(name = "maKH", required = false) String maKH,
                                       @RequestParam(name = "tenKH", required = false) String tenKH,
                                       @RequestParam(name = "email", required = false) String email,
                                       @RequestParam(name = "sdt", required = false) String sdt,
                                       @RequestParam(name = "diaChi", required = false) String diaChi,
                                       @RequestParam(name = "cccd", required = false) String cccd) throws IOException {
        List<KhachHang> customers = khachHangService.getSearchKhachHang(maKH, tenKH, email, sdt, diaChi, cccd);

        Workbook workbook = khachHangService.exportCustomersToExcel(customers);

        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        response.setHeader("Content-Disposition", "attachment; filename=customers.xlsx");

        OutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        outputStream.close();
    }

    @PostMapping("/importCustomers")
    public ResponseEntity<String> importCustomers(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return new ResponseEntity<>("Tệp không được để trống", HttpStatus.BAD_REQUEST);
        }

        try {
            InputStream inputStream = file.getInputStream();
            khachHangService.importCustomersFromExcel(inputStream);
            return new ResponseEntity<>("Dữ liệu đã được import thành công", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Lỗi khi import dữ liệu từ tệp Excel: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}