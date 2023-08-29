package com.example.demo.core.user.service.impl;

import com.example.demo.core.user.model.request.UserKhachHangRequest;
import com.example.demo.core.user.model.response.UserKhachHangResponse;
import com.example.demo.core.user.repository.UserKhachHangRepository;
import com.example.demo.core.user.service.UserKhachHangService;
import com.example.demo.entity.KhachHang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserKhachHangServiceImpl implements UserKhachHangService {
    @Autowired
    UserKhachHangRepository khachHangRepository;

    @Override
    public KhachHang insert(UserKhachHangRequest khachHangRequest) {
        return khachHangRepository.save(KhachHang.builder().tenKhachHang(khachHangRequest.getTenKhachHang()).build());
    }

    @Override
    public KhachHang update(UserKhachHangRequest khachHangRequest) {
        KhachHang khachHang = KhachHang.builder().tenKhachHang(khachHangRequest.getTenKhachHang()).build();
        khachHang.setId(khachHang.getId());
        return khachHangRepository.save(khachHang);
    }

    @Override
    public KhachHang delete(Long idKH) {
        return khachHangRepository.findById(idKH).map(khachHang -> {
            khachHangRepository.delete(khachHang);
            return khachHang;
        }).orElse(null);
    }

    @Override
    public Page<UserKhachHangResponse> dsKhachHang(int page) {
        Pageable pageable = PageRequest.of(page,5);
        return khachHangRepository.getDsKhachHang(pageable);
    }
}
