package com.teksystems.Capstone3BackEnd.controller;

import com.teksystems.Capstone3BackEnd.dto.ProductDto;
import com.teksystems.Capstone3BackEnd.service.ProductService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;

import com.teksystems.Capstone3BackEnd.models.request.ProductRequest;
import com.teksystems.Capstone3BackEnd.models.response.ProductResponse;

import static org.mockito.Mockito.when;

@SpringBootTest
public class ProductControllerTest {

    ProductController productController;

    @Mock
    ProductService productService;

    @Test
    public void shouldCreateProduct() {

        ProductRequest productRequest = new ProductRequest("Jelly Beans");
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(productRequest, productDto);

        System.out.println("dto from beginning of test " + productDto);

        ProductDto expectedDto = new ProductDto(55L, "Jelly Beans", "auto-generate");

        when(productService.createProduct(productDto)).thenReturn(expectedDto);

        productController = new ProductController(productService);


        ProductResponse expected = new ProductResponse("Jelly Beans", "auto-generate");

        //ProductResponse actual = productController.createProduct(productRequest);

       // assertEquals(expected, actual);
    }


}
