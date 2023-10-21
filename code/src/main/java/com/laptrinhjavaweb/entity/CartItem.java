package com.laptrinhjavaweb.entity;

import com.laptrinhjavaweb.entity.base.PrimaryEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
@Entity
@ToString
@Table(name = "cart_items")
public class CartItem extends PrimaryEntity {
    @ManyToOne
    @JoinColumn(name = "idproduct")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "iduser")
    private Users users;
}
