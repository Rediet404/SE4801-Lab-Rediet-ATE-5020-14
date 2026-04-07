package com.ctbe.rediet.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ctbe.rediet.model.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
// Spring Data automatically generates the SQL for this method:
List<Product> findByNameContainingIgnoreCase(String keyword);
}