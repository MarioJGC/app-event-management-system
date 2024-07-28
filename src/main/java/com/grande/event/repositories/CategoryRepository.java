package com.grande.event.repositories;

import com.grande.event.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CategoryRepository extends JpaRepository<Long, Category> {
}
