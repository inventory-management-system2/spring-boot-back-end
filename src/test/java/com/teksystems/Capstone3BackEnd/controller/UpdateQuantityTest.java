package com.teksystems.Capstone3BackEnd.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.teksystems.Capstone3BackEnd.models.ProductEntity;

@SpringBootTest
public class UpdateQuantityTest {
	
	@Autowired
	ProductController controller;
	
	@Test
	public void testUpdateQuantity() {
		ProductEntity increase = new ProductEntity("1", "Macbook Pro", 10, "mbp123", Double.valueOf(999.99), "electronics", "https://i.dell.com/sites/csimages/Video_Imagery/all/xps_7590_touch.png");
		
		UpdateQuantity.getInstance().calculateQuantity(5, increase);
		int response = increase.getQuantity();
		assertEquals(15,response);
		
	}
}
