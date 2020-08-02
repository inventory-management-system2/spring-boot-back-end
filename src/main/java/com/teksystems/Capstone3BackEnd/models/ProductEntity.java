package com.teksystems.Capstone3BackEnd.models;

import javax.persistence.*;

@Entity
public class ProductEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false, unique = true)
	private String productName;
	private int quantity;
	@Column(nullable = false, unique = true)
	private String serialNumber;
	private Double price;
	private String category;
	private String imageUrl;
	
	public ProductEntity(String productName, int quantity, String serialNumber, Double price,
			String category, String imageUrl) {
		this.productName = productName;
		this.quantity = quantity;
		this.serialNumber = serialNumber;
		this.price = price;
		this.category = category;
		this.imageUrl = imageUrl;
	}

	public ProductEntity(String productName, int quantity){
		this.productName = productName;
		this.quantity = quantity;
	}

	public ProductEntity(){}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Long getId(){
		return id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
}

