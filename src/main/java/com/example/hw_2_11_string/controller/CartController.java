package com.example.hw_2_11_string.controller;

import com.example.hw_2_11_string.service.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/order")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/add")
    public void addProducts(@RequestParam("id") List<Integer> products) {
        cartService.addId(products);
    }

    @GetMapping("/get")
    public Collection<Integer> getProducts() {
        return cartService.getId();
    }
}
