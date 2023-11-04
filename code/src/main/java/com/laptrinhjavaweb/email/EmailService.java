package com.laptrinhjavaweb.email;

public interface EmailService {

    void sendPasswordResetEmail(String recipient, String password);

}
