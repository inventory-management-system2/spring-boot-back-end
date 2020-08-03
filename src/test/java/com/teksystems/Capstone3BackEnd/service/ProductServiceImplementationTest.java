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
    ProductServiceImplementation serviceImpl;


    @Test
    public void shouldUpdateNotCreateProductThatAlreadyExists(){
      ProductDto newDto = new ProductDto("Momomo", 5, 9.99, "Music", "asdf.jpg");
      ProductDto secondImplementedDto = serviceImpl.createProduct(newDto);
      assertEquals(secondImplementedDto.getPrice(),9.99);


    }

}
