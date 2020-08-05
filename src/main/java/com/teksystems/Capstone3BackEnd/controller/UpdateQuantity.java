package com.teksystems.Capstone3BackEnd.controller;

import com.teksystems.Capstone3BackEnd.models.RegionEntity;

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
	
	public RegionEntity calculateQuantity(int quantity,RegionEntity regionEntity) {
		int total;
		total = regionEntity.getQuantity()+quantity;
		regionEntity.setQuantity(total);
		return regionEntity;
	}
}
