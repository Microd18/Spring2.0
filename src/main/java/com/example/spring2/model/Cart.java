package com.example.spring2.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Cart {

    private final List<Integer> list = new ArrayList<>();

    public void addAll(List<Integer> values) {
        list.addAll(values);
    }

    public List<Integer> getAll() {
        return list;
    }
}
