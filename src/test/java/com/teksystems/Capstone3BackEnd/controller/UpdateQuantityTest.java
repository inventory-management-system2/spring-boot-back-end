package com.teksystems.Capstone3BackEnd.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.teksystems.Capstone3BackEnd.models.request.ProductRequest;

@SpringBootTest
public class UpdateQuantityTest {
	
	@Autowired
	ProductController controller;
	
	@Test
	public void testUpdateQuantity() {
		ProductRequest increase = new ProductRequest("MacBookPro",5);
		UpdateQuantity.getInstance().calculateQuantity(10, increase);
		int response = increase.getQuantity();
		assertEquals(15,response);
		
	}
}
