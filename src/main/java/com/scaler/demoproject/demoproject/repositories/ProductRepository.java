package com.scaler.demoproject.demoproject.repositories;

import com.scaler.demoproject.demoproject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product save(Product product);

    Product findByTitle(String title);
}
