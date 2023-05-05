package com.example.hw_2_11_string.service;

import java.util.Collection;
import java.util.List;

public interface CartService {
    void addId(List<Integer> id);
    Collection<Integer> getId();
}
