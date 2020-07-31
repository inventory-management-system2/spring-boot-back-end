package com.teksystems.Capstone3BackEnd.controller;

import static org.assertj.core.api.Assertions.assertThat;
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
		ProductRequest request = new ProductRequest("1234", "CD", 1);
		
		ProductResponse response = controller.createProduct(request);
		
		assertThat(request).isEqualToComparingFieldByField(response);
	}

}
