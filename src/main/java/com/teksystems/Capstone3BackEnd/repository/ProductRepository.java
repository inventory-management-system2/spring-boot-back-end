package com.teksystems.Capstone3BackEnd.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.teksystems.Capstone3BackEnd.models.ProductEntity;
import com.teksystems.Capstone3BackEnd.models.RegionEntity;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<ProductEntity, Long> {
   ProductEntity findBySerialNumber(String serialNumber);
   Iterable<ProductEntity> findByRegionsNotContains(RegionEntity regionEntity);
}
