package com.laptrinhjavaweb.dto;

import com.laptrinhjavaweb.entity.KhuyenMai;
import com.laptrinhjavaweb.entity.SanPhamEntity;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class SanPhamGiamGiaCustom {
    private List<SanPhamEntity> sanPhamEntity;
    private KhuyenMai khuyenMai;
}
