package com.example.demo.core.user.service;

import com.example.demo.core.user.model.request.UserKhachHangRequest;
import com.example.demo.core.user.model.response.UserKhachHangResponse;
import com.example.demo.entity.KhachHang;
import org.springframework.data.domain.Page;

public interface UserKhachHangService {

    KhachHang insert(UserKhachHangRequest khachHangRequest);
    KhachHang update(UserKhachHangRequest khachHangRequest);
    KhachHang delete(Long idKH);

    Page<UserKhachHangResponse> dsKhachHang(int page);
}
