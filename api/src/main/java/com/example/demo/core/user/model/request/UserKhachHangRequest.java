package com.example.demo.core.user.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserKhachHangRequest {

    private Long idKhachHang;
    private String tenKhachHang;
}
