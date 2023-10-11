package com.example.demo.core.admin.service;

import com.example.demo.core.admin.model.request.UserKhachHangRequest;
import com.example.demo.core.admin.model.response.UserKhachHangResponse;
import com.example.demo.entity.KhachHang;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserKhachHangService {

    List<UserKhachHangResponse> findAll();

    KhachHang insert(UserKhachHangRequest khachHangRequest);
    KhachHang update(UserKhachHangRequest khachHangRequest);
    KhachHang delete(Long idKH);

    Page<UserKhachHangResponse> dsKhachHang(int page);
}
