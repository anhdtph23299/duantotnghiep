package com.laptrinhjavaweb.email;

import com.laptrinhjavaweb.entity.NhanVien;
import com.laptrinhjavaweb.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @Autowired
    private NhanVienService nhanVienService;

    @PostMapping("/quenmatkhau")
    public ResponseEntity<String> resetPassword(@RequestParam String email) {
        NhanVien nhanVien = nhanVienService.findByEmail(email);

        if (nhanVien != null) {
            String newPassword = nhanVienService.generateRandomPassword();
            nhanVien.setPassword(newPassword);
            nhanVienService.insert(nhanVien);

            emailService.sendPasswordResetEmail(nhanVien.getEmail(), newPassword);

            return ResponseEntity.ok("Thành công");
        } else {
            return ResponseEntity.badRequest().body("Thất bại");
        }
    }
}
