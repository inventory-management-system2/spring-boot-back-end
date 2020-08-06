package com.teksystems.Capstone3BackEnd.service;

import java.util.List;

import com.teksystems.Capstone3BackEnd.dto.ProductDto;
import com.teksystems.Capstone3BackEnd.models.ProductEntity;
import com.teksystems.Capstone3BackEnd.models.request.ProductRequest;


public interface ProductService {
    ProductDto getProduct(String productId);
    List<ProductDto> getAllProducts(int page, int limit);
    ProductDto createProduct(ProductDto productDto);
    ProductDto updateProduct(String serialNumber, ProductDto productDto);
	
	ProductEntity updateQuantityProduct(String serialNumber, ProductRequest quantity);
	ProductEntity getProductEntity(String serialNumber);

}
