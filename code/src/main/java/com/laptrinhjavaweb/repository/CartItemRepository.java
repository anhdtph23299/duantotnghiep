package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
