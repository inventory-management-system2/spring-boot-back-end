package com.teksystems.Capstone3BackEnd.service;

import com.teksystems.Capstone3BackEnd.dto.ProductDto;
import com.teksystems.Capstone3BackEnd.models.ProductEntity;
import com.teksystems.Capstone3BackEnd.models.request.ProductRequest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


public interface ProductService {
//    ProductDto getProduct(String productId);
    List<ProductDto> getAllUsers(int page, int limit);
    ProductDto createProduct(ProductDto productDto);
    ProductDto updateProduct(String serialNumber, ProductDto productDto);
	
	ProductEntity updateQuantityProduct(String serialNumber, ProductRequest quantity);

}
