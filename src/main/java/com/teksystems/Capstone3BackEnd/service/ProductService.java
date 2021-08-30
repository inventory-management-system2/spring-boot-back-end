package com.teksystems.Capstone3BackEnd.service;

import com.teksystems.Capstone3BackEnd.dto.ProductDto;
import com.teksystems.Capstone3BackEnd.models.ProductEntity;
import com.teksystems.Capstone3BackEnd.models.request.ProductRequest;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Mapper
public interface ProductService {

    ProductService INSTANCE = Mappers.getMapper(ProductService.class);

    ProductDto getProduct(String productId);
    List<ProductDto> getAllProducts(int page, int limit);
    @Mapping(source = "Dto", target = "product")
    ProductDto createProduct(ProductDto productDto);
    ProductDto updateProduct(String serialNumber, ProductDto productDto);
	
	ProductEntity updateQuantityProduct(String serialNumber, ProductRequest quantity);

}
