package com.scaler.demoproject.demoproject.controller;

import com.scaler.demoproject.demoproject.dto.FakeStoreProductDto;
import com.scaler.demoproject.demoproject.exceptions.ProductNotFoundException;
import com.scaler.demoproject.demoproject.model.Product;
import com.scaler.demoproject.demoproject.service.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    private ProductService productService;

    public ProductController(@Qualifier("selfProductService") ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String testing() throws ProductNotFoundException {
//        return "murali";
        throw new ProductNotFoundException("record not found");
    }


    @GetMapping("/products")
    public ResponseEntity<FakeStoreProductDto> getFakeStoreProductDto() {
        return new ResponseEntity<>(productService.getDto(), HttpStatus.NOT_FOUND);
    }

//    @GetMapping("/products/{id}")
//    public Product getProduct(@PathVariable("id") Long productId) {
//
//        return null;
//    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product) {
        Product postRequestResponse = productService.createProduct(product);
        return postRequestResponse;
    }

}
