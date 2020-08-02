package com.teksystems.Capstone3BackEnd.service;

import com.teksystems.Capstone3BackEnd.controller.ProductController;
import com.teksystems.Capstone3BackEnd.dto.ProductDto;
import com.teksystems.Capstone3BackEnd.models.ProductEntity;
import com.teksystems.Capstone3BackEnd.models.request.ProductRequest;
import com.teksystems.Capstone3BackEnd.service.implementations.ProductServiceImplementation;
import com.teksystems.Capstone3BackEnd.utils.Utils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ProductServiceImplementationTest {

    @Autowired
    ProductServiceImplementation implementation;
    Utils utils;
/*
    @Test
    public void shouldUpdateNotCreateProductThatAlreadyExists(){
      String newSerialNumber = utils.generateSerialNumber(15);
//        ProductDto oldDto = new ProductDto("CD", 1);
//        ProductDto implementedDto = implementation.createProduct(oldDto);

        ProductDto newDto = new ProductDto("CD", 5, newSerialNumber, 9.99, "Music", "asdf.jpg");
        ProductDto secondImplementedDto = implementation.createProduct(newDto);
        assertEquals(secondImplementedDto.getPrice(),9.99);
//        assertEquals(implementedDto.getId(), secondImplementedDto.getId());

    }
*/
}
