package com.laptrinhjavaweb.ApiController;

import com.laptrinhjavaweb.entity.CartItem;
import com.laptrinhjavaweb.repository.CartItemRepository;
import com.laptrinhjavaweb.util.base.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/admin/cartitem")
public class ApiCartItem {

    @Autowired
    CartItemRepository cartItemRepository;

    @PostMapping("/insert")
    public ResponseObject insert(@RequestBody List<CartItem> cartItem){
        System.out.println(cartItem );
        List<CartItem> list = new ArrayList<>();
        for (CartItem c: cartItem) {
            CartItem res = cartItemRepository.save(c);
            list.add(res);
        }
        return new ResponseObject(list);
    }

}
