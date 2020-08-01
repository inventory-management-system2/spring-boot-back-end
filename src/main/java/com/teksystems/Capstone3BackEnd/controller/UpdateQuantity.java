package com.teksystems.Capstone3BackEnd.controller;

import com.teksystems.Capstone3BackEnd.dto.ProductDto;
import com.teksystems.Capstone3BackEnd.models.ProductEntity;
import com.teksystems.Capstone3BackEnd.models.request.ProductRequest;

public class UpdateQuantity {
	private volatile static UpdateQuantity updateQuantity;
	
	private UpdateQuantity() {
	}
	
	public static UpdateQuantity getInstance() {
		if (updateQuantity == null ) {
			updateQuantity = new UpdateQuantity(); 
		}
		return updateQuantity;
	}
	
	public ProductEntity calculateQuantity(int quantity, ProductEntity productEntity) {
		int total;
		total = productEntity.getQuantity()+quantity;
		productEntity.setQuantity(total);
		return productEntity;
	}
}
