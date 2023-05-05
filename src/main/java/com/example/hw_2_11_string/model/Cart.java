package com.example.hw_2_11_string.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Cart {
    private List<Integer> cart;
    public Cart() {
        this.cart = new ArrayList<>();
    }

    public void addInCart(List<Integer> id) {
            for (Integer e : id) {
                if (e > 0) {
                    cart.add(e);
                }
            }
    }

    public Collection<Integer> getAll() {
        return Collections.unmodifiableCollection(cart);
    }
}
