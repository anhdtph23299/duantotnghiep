package com.laptrinhjavaweb.email;

import com.laptrinhjavaweb.entity.NhanVien;

public interface EmailService {

    void sendPasswordResetEmail(String recipient, String password);

}
