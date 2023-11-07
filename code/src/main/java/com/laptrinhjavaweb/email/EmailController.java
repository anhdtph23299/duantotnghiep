package com.laptrinhjavaweb.email;

import com.laptrinhjavaweb.entity.NhanVien;
import com.laptrinhjavaweb.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmailController {

    private static final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public static String encodePassword(String password) {
        return passwordEncoder.encode(password);
    }

    @Autowired
    private EmailService emailService;

    @Autowired
    private NhanVienService nhanVienService;

    @PostMapping("/quenmatkhau")
    public ResponseEntity<String> quenmatkhau(@RequestParam String email) {
        NhanVien nhanVien = nhanVienService.findByEmail(email);

        if (nhanVien != null) {
            String newPassword = nhanVienService.generateRandomPassword();
            nhanVien.setResetToken(newPassword);
            nhanVienService.insert(nhanVien);

            emailService.sendPasswordResetEmail(nhanVien.getEmail(), newPassword);

            return ResponseEntity.ok("Thành công");
        } else {
            return ResponseEntity.badRequest().body("Thất bại");
        }
    }

    @PostMapping("/resetPasswordByToken")
    public ResponseEntity<String> resetPasswordByToken(@RequestParam String resetToken, @RequestParam String matkhau) {
        NhanVien nhanVien = nhanVienService.findByResetToken(resetToken);

        if (nhanVien != null) {
            String newPassword = encodePassword(matkhau);
            nhanVien.setMatKhau(newPassword);
            nhanVien.setResetToken(null);
            nhanVienService.update(nhanVien);

            return ResponseEntity.ok("Thành công.");
        } else {
            return ResponseEntity.badRequest().body("Thất bại");
        }
    }
}
