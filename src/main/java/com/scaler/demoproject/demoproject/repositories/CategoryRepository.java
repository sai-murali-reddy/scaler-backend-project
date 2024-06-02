package com.scaler.demoproject.demoproject.repositories;

import com.scaler.demoproject.demoproject.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category save(Category category);

    Category findByTitle(String title);
}
