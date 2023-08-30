package com.example.demo.core.admin.model.response;

import com.example.demo.entity.KhachHang;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = {KhachHang.class})
public interface UserKhachHangResponse {

    @Value("#{target.id}")
    @JsonIgnoreProperties(value = { "sensitiveInformation" }, allowGetters = true)
    Long getId();
    @Value("#{target.tenKhachHang}")
    String getTenKhachHang();
}
