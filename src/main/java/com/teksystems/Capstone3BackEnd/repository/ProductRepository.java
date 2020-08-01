package com.teksystems.Capstone3BackEnd.repository;

import com.teksystems.Capstone3BackEnd.models.ProductEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<ProductEntity, Long> {
   ProductEntity findBySerialNumber(String serialNumber);
}
