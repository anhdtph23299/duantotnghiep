package com.example.demo.core.admin.repository;


import com.example.demo.core.admin.model.response.UserKhachHangResponse;
import com.example.demo.repository.KhachHangRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserKhachHangRepository extends KhachHangRepository {

    @Query(value = "select kh from KhachHang kh")
    Page<UserKhachHangResponse> getDsKhachHang(Pageable pageable);
    @Query(value = "select kh from KhachHang kh")
    List<UserKhachHangResponse> dsKH();
}
