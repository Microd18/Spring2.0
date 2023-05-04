package com.example.spring2.services;

import com.example.spring2.model.Cart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopService {

    private final Cart cart;

    public ShopService(Cart cart) {
        this.cart = cart;
    }

    public void addAll(List<Integer> values) {
        cart.addAll(values);
    }

    public List<Integer> getAll() {
        return cart.getAll();
    }
}


