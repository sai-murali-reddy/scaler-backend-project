package com.scaler.demoproject.demoproject.controller;

import com.scaler.demoproject.demoproject.dto.FakeStoreProductDto;
import com.scaler.demoproject.demoproject.model.Product;
import com.scaler.demoproject.demoproject.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String testing() {
        return "murali";
    }

    @GetMapping("/products")
    public FakeStoreProductDto getFakeStoreProductDto() {
        return productService.getDto();
    }

//    @GetMapping("/products/{id}")
//    public Product getProduct(@PathVariable("id") Long productId) {
//
//        return null;
//    }

}
