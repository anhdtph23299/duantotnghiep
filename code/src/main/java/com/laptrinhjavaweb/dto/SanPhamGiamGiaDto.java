package com.laptrinhjavaweb.dto;

import com.laptrinhjavaweb.entity.KhuyenMai;
import com.laptrinhjavaweb.entity.SanPhamEntity;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class SanPhamGiamGiaDto {
    private SanPhamEntity sanPhamEntity;
    private KhuyenMai khuyenMai;
}
