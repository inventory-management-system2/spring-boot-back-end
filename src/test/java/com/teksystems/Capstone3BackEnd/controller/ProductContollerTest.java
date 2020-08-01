package com.teksystems.Capstone3BackEnd.controller;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.teksystems.Capstone3BackEnd.models.request.ProductRequest;
import com.teksystems.Capstone3BackEnd.models.response.ProductResponse;

@SpringBootTest
public class ProductContollerTest {
	
	@Autowired
	ProductController controller;
	
	@Test
	public void shouldCreateProduct() {
		ProductRequest request = new ProductRequest("CD", 1);
		
		ProductResponse response = controller.createProduct(request);
		
		assertThat(request).isEqualToComparingFieldByField(response);
	}
	
	
	@Test
	public void shouldUpdateProduct() {
		
		ProductRequest oldProduct = new ProductRequest("MacBookPro", 2); 
		
		ProductResponse createdProduct = controller.createProduct(oldProduct);
		
		ProductRequest updatedProduct = new ProductRequest("Windows Dell", 9); 
		
		ProductResponse response = controller.updateProduct(createdProduct.getProductId(), updatedProduct); 
		
		assertThat(updatedProduct).isEqualToComparingFieldByField(response); 
		
	}
	
	@Test
	public void shouldUpdateProductQuantity() {
		
		ProductRequest oldProduct = new ProductRequest("MacBook Pro", 10);
		
		ProductResponse createdProduct = controller.createProduct(oldProduct);
		
		ProductRequest updatedProduct = new ProductRequest("MacBook Pro", 100);
		
		ProductResponse response = controller.updateQuantity(createdProduct.getProductId(), updatedProduct);
		
		assertEquals(110, response.getQuantity()); 
		
	}
	
	@Test
	public void shouldNotupdateProductQuantityForLessThanOne() {
	
		ProductRequest oldProduct = new ProductRequest("MacBook Pro", 10);
		
		ProductResponse createdProduct = controller.createProduct(oldProduct);
		
		ProductRequest updatedProduct = new ProductRequest("MacBook Pro", 0);
		
		ProductResponse response = controller.updateQuantity(createdProduct.getProductId(), updatedProduct);
		
		assertEquals(response.getQuantity(), 10); 
		
		updatedProduct = new ProductRequest("MacBook Pro", -1);
		
		response = controller.updateQuantity(createdProduct.getProductId(), updatedProduct);
		
		assertEquals(10, response.getQuantity()); 
		
	}
	
	

}
