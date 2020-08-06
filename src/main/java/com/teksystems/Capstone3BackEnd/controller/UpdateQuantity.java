package com.teksystems.Capstone3BackEnd.controller;

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
	
	public ProductEntity calculateQuantity(ProductRequest productRequest, ProductEntity productEntity) {
		productEntity.setRegionNe(productEntity.getRegionNe()+productRequest.getRegionNe());
		productEntity.setRegionSe(productEntity.getRegionSe()+productRequest.getRegionSe());
		productEntity.setRegionSw(productEntity.getRegionSw()+productRequest.getRegionSw());
		return productEntity;
	}
}
