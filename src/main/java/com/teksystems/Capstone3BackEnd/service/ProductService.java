package com.teksystems.Capstone3BackEnd.service;

import com.teksystems.Capstone3BackEnd.dto.ProductDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public interface ProductService {
//    ProductDto getProduct(String productId);
    ProductDto createProduct(ProductDto productDto);
//    ProdcutDto updateProduct(String productId, ProductDto productDto);

}
