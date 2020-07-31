package com.teksystems.Capstone3BackEnd.repository;

import com.teksystems.Capstone3BackEnd.models.ProductEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductRepository extends PagingAndSortingRepository<ProductEntity, String> {
    ProductEntity save(ProductEntity product);
//    ProductEntity findByUserId(String productId);
}
