package com.scaler.demoproject.demoproject.controller;

import com.scaler.demoproject.demoproject.dto.FakeStoreProductDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/")
    public String testing() {

        return "murali";
    }

//    @GetMapping("/product")
//    public FakeStoreProductDto getProduct() {
//
//    }

}
