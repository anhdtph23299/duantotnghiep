package com.laptrinhjavaweb.entity;

import com.laptrinhjavaweb.entity.base.PrimaryEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
@Builder
@Entity
@ToString
@Table(name = "chucvu")
public class ChucVu extends PrimaryEntity {

    @Column(name = "macv")
    private String maCV;

    @Column(name = "tencv")
    private String tenCV;

    @Column(name = "trangthai")
    private Integer trangThai;
}
