package com.scaler.demoproject.demoproject.service;

import com.scaler.demoproject.demoproject.dto.FakeStoreProductDto;
import com.scaler.demoproject.demoproject.model.Product;

import java.util.List;

public interface ProductService {
    FakeStoreProductDto getDto();
    Product getSingleProduct(Long productId);
    List<Product> getAllProducts();
    Product createProduct(Product product);
}
