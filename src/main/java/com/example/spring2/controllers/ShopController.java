package com.example.spring2.controllers;

import com.example.spring2.services.ShopService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ShopController {

    private final ShopService shopService;

    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping("/add")
    public void add(@RequestParam("id") List<Integer> id) {
        shopService.addAll(id);
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return shopService.getAll();
    }

}
