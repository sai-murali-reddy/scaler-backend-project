package com.scaler.demoproject.demoproject.service;

import com.scaler.demoproject.demoproject.model.Product;

import java.util.List;

public class FakeStoreProductService implements ProductService {

    @Override
    public Product getSingleProduct(Long productId) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }
}
