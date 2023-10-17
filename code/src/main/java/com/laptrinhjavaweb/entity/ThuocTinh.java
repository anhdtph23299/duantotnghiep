package com.laptrinhjavaweb.entity;

import com.laptrinhjavaweb.entity.base.PrimaryEntity;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@ToString
@Table(name = "thuoctinh")
public class ThuocTinh extends PrimaryEntity {
    @Column(name = "ma")
    private String ma;

    @Column(name = "ten")
    private String ten;

    @Column(name = "ngaytao")
    private Date ngayTao;

    @Column(name = "ngaysua")
    private Date ngaySua;

    @ManyToOne
    @JoinColumn(name = "nguoitao",insertable = false,updatable = false)
    private NhanVien nhanVienTao;

    @ManyToOne
    @JoinColumn(name = "nguoisua",insertable = false,updatable = false)
    private NhanVien nhanVienSua;

    @Column(name = "trangthai")
    private int trangThai;

    @OneToMany(mappedBy = "thuocTinh", cascade = CascadeType.REMOVE)
    private List<ChiTietSanPhamThuocTinh> dsCTSPThuocTinh = new ArrayList<>();
}
