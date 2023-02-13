package com.web.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.model.ProductResult;

public interface ProductRepo extends JpaRepository<ProductResult, Integer> {

}
