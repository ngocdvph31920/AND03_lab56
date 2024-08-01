package com.example.demo2.select;


import com.example.demo2.SanPham;

public class SvrResponseSelect {//get
    private SanPham[] products;
    private String message;

    public SanPham[] getProducts() {
        return products;
    }

    public String getMessage() {
        return message;
    }
}
