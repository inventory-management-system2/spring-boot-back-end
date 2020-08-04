package com.teksystems.Capstone3BackEnd.service;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.teksystems.Capstone3BackEnd.dto.ProductDto;
import com.teksystems.Capstone3BackEnd.service.implementations.ProductServiceImplementation;

@SpringBootTest
public class ProductServiceImplementationTest {

	@Mock
	private ProductServiceImplementation mockProductService;

	@Test
	public void shouldCreateProduct() {

		ProductDto newDto = new ProductDto("momo", 0);

		when(mockProductService.createProduct(newDto)).thenReturn(new ProductDto("momo", 0));

	}

	@Test
	public void shouldUpdateNotCreateProductThatAlreadyExists() {
		
		
	}

}
