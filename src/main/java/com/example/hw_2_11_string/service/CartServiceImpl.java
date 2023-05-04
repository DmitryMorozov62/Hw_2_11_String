package com.example.hw_2_11_string.service;

import com.example.hw_2_11_string.model.Cart;
import org.springframework.stereotype.Service;


import java.util.Collection;
import java.util.List;

@Service
public class CartServiceImpl implements CartService{
    private final Cart cart;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    public void addId(List<Integer> id) {
        cart.addInCart(id);
    }

    public Collection<Integer> getId() {
        return cart.getAll();
    }
}
