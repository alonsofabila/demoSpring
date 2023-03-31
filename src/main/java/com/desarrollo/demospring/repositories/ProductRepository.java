package com.desarrollo.demospring.repositories;

import com.desarrollo.demospring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
