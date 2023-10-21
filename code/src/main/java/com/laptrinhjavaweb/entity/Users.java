package com.laptrinhjavaweb.entity;

import com.laptrinhjavaweb.entity.base.PrimaryEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
@Entity
@ToString
@Table(name = "users")
public class Users extends PrimaryEntity {
    @Column(name = "tensp")
    private String ten;
    @OneToMany(mappedBy = "users")
    private List<CartItem> dsSanPham = new ArrayList<>();
}
