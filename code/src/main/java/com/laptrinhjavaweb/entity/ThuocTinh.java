package com.laptrinhjavaweb.entity;

import com.laptrinhjavaweb.entity.base.PrimaryEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
@Builder
@Entity
@ToString
@Table(name = "thuoctinh")
public class ThuocTinh extends PrimaryEntity {
    @Column(name = "matt")
    private String ma;

    @Column(name = "tentt")
    private String ten;

    @Column(name = "ngaytao")
    private Date ngayTao;

    @Column(name = "ngaysua")
    private Date ngaySua;

    @ManyToOne
    @JoinColumn(name = "nguoitao",insertable = false,updatable = false)
    private NhanVien nguoiTao;

    @ManyToOne
    @JoinColumn(name = "nguoisua",insertable = false,updatable = false)
    private NhanVien nguoiSua;

    @Column(name = "trangthai")
    private Integer trangThai;

    @OneToMany(mappedBy = "thuocTinh", cascade = CascadeType.REMOVE)
    private List<ChiTietSanPhamThuocTinh> dsCTSPThuocTinh = new ArrayList<>();
}
