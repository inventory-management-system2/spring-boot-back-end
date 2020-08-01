package com.teksystems.Capstone3BackEnd.controller;

import com.teksystems.Capstone3BackEnd.models.request.ProductRequest;

public class UpdateQuantity {
	private static UpdateQuantity updateQuantity = new UpdateQuantity(); 
	
	private UpdateQuantity() {
		
	}
	
	public static UpdateQuantity getInstance() {
		return updateQuantity;
	}
	
	public ProductRequest calculateQuantity(int quantity, ProductRequest productRequest) {
		int total;
		total = productRequest.getQuantity()+quantity;
		productRequest.setQuantity(total);
		return productRequest;
	}
}
