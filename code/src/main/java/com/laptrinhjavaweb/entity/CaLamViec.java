package com.laptrinhjavaweb.entity;

import com.laptrinhjavaweb.entity.base.PrimaryEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
@Builder
@Entity
@ToString
@Table(name = "calamviec")
public class CaLamViec extends PrimaryEntity {

    @Column(name = "macalv")
    private String maCaLV;

    @Column(name = "ngaylamviec")
    private Date ngayLamViec;

    @Column(name = "giobatdau")
    private Time gioBatDau;

    @Column(name = "gioketthuc")
    private Time gioKetThuc;

    @Column(name = "trangthai")
    private Integer trangThai;

    @ManyToOne
    @JoinColumn(name = "idnhanvien", referencedColumnName = "id")
    private NhanVien nhanVien;

}
