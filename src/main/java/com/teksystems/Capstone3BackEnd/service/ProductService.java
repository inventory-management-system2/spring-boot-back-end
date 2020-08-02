package com.teksystems.Capstone3BackEnd.service;

import com.teksystems.Capstone3BackEnd.dto.ProductDto;
import com.teksystems.Capstone3BackEnd.models.ProductEntity;
import com.teksystems.Capstone3BackEnd.models.request.ProductRequest;


public interface ProductService {
//    ProductDto getProduct(String productId);
    ProductDto createProduct(ProductDto productDto);
    ProductDto updateProduct(String productId, ProductDto productDto);
	
	ProductEntity updateQuantityProduct(String productId, ProductRequest quantity);

}
