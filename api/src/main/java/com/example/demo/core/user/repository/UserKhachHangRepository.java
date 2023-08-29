package com.example.demo.core.user.repository;


import com.example.demo.core.user.model.response.UserKhachHangResponse;
import com.example.demo.repository.KhachHangRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserKhachHangRepository extends KhachHangRepository {

    @Query(value = "select kh from KhachHang kh")
    Page<UserKhachHangResponse> getDsKhachHang(Pageable pageable);
}
