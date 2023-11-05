package com.laptrinhjavaweb.entity;

import com.laptrinhjavaweb.entity.base.PrimaryEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
