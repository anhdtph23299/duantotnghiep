package com.example.demo.entity;

import com.example.demo.entity.base.PrimaryEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
@Builder
@Entity
@Table(name = "khachhang")
public class KhachHang extends PrimaryEntity {
    @Column(name = "tenkhachhang")
    private String tenKhachHang;

}
