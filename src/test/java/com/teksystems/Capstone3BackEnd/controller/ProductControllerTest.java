package com.teksystems.Capstone3BackEnd.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;

import com.teksystems.Capstone3BackEnd.dto.ProductDto;
import com.teksystems.Capstone3BackEnd.models.request.ProductRequest;
import com.teksystems.Capstone3BackEnd.models.response.ProductResponse;
import com.teksystems.Capstone3BackEnd.service.ProductService;

@SpringBootTest
public class ProductControllerTest {

    ProductController productController;

    @Mock
    ProductService productService;

    @Test
    public void shouldCreateProduct() {

//        ProductRequest productRequest = new ProductRequest("Jelly Beans");
//        ProductDto productDto = new ProductDto();
//        BeanUtils.copyProperties(productRequest, productDto);
//
//        ProductDto expectedDto = new ProductDto(55L, "Jelly Beans", "auto-generate");
//
//        when(productService.createProduct(productDto)).thenReturn(expectedDto);
//
//        productController = new ProductController(productService);
//
//        ProductResponse expected = new ProductResponse("Jelly Beans", "auto-generate");
//
//        ProductResponse actual = productController.createProduct(productRequest);
//
//        assertEquals(expected, actual);
    }


}
